package pl.zmt.reader.entities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


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
