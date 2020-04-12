package pl.zmt.reader.entities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/readingair")
public class ReadingAirController {


    @Autowired
    private ReadingAirRepository readingAirRepository;

    @GetMapping("getall")
    public @ResponseBody
    Iterable<ReadingAir> getAllReadingsAir() {
        // This returns a JSON or XML with the compressors
        return readingAirRepository.findAll();
    }


}
