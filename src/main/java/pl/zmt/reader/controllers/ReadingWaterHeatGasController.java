package pl.zmt.reader.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.zmt.reader.entities.ReadingWaterHeatGas;
import pl.zmt.reader.repositories.ReadingWaterHeatGasRepository;


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
