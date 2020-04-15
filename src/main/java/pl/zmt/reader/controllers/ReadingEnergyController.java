package pl.zmt.reader.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.zmt.reader.entities.ReadingEnergy;
import pl.zmt.reader.repositories.ReadingEnergyRepository;


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
