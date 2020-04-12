package pl.zmt.reader.entities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculation")
public class CalculationController {


    @Autowired
    private CalculationRepository calculationRepository;

    @GetMapping("getall")
    public @ResponseBody
    Iterable<Calculation> getAllCalculations() {
        // This returns a JSON or XML with the compressors
        return calculationRepository.findAll();
    }


}
