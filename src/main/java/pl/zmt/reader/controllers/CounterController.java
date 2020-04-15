package pl.zmt.reader.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.zmt.reader.entities.Counter;
import pl.zmt.reader.repositories.CounterRepository;


@RestController
@RequestMapping("/counter")
public class CounterController {


    @Autowired
    private CounterRepository counterRepository;

    @GetMapping("getall")
    public @ResponseBody
    Iterable<Counter> getAllCounters() {
        // This returns a JSON or XML with the compressors
        return counterRepository.findAll();
    }


}
