package pl.zmt.reader.entities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/compressor")
public class CompressorController {


    @Autowired
    private CompressorRepository compressorRepository;

    @GetMapping("getall")
    public @ResponseBody
    Iterable<Compressor> getAllCompressors() {
        // This returns a JSON or XML with the compressors
        return compressorRepository.findAll();
    }


}
