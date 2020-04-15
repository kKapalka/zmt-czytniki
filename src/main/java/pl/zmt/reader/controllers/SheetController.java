package pl.zmt.reader.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.zmt.reader.entities.Sheet;
import pl.zmt.reader.repositories.SheetRepository;


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
