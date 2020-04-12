package pl.zmt.reader.entities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sheet")
public class SheetController {


    @Autowired
    private SheetRepository sheetRepository;

    @GetMapping("getall")
    public @ResponseBody
    Iterable<Sheet> getAllSheets() {
        // This returns a JSON or XML with the compressors
        return sheetRepository.findAll();
    }


}
