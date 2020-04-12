package pl.zmt.reader.entities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/readingenergy")
public class ReadingEnergyController {


    @Autowired
    private ReadingEnergyRepository readingEnergyRepository;

    @GetMapping("getall")
    public @ResponseBody
    Iterable<ReadingEnergy> getAllReadingsEnergy() {
        // This returns a JSON or XML with the compressors
        return readingEnergyRepository.findAll();
    }


}