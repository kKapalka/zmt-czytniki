package pl.zmt.reader.entities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/readingwaterheatgas")
public class ReadingWaterHeatGasController {


    @Autowired
    private ReadingWaterHeatGasRepository readingWaterHeatGasRepository;

    @GetMapping("getall")
    public @ResponseBody
    Iterable<ReadingWaterHeatGas> getAllReadingsWaterHeatGas() {
        // This returns a JSON or XML with the compressors
        return readingWaterHeatGasRepository.findAll();
    }


}
