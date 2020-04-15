package pl.zmt.reader.entities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/renovations")
public class RenovationController {

    @Autowired
    RenovationRepository renovationRepository;

    @GetMapping
    public ResponseEntity getAllRenovations() {
        Iterable<Renovation> renovations = renovationRepository.findAll();
        return ResponseEntity.ok(renovations);
    }

    @GetMapping("/{id}")
    public ResponseEntity renovationById (@PathVariable Long id) {
        Optional<Renovation> renovationById = renovationRepository.findById(id);
        return ResponseEntity.ok(renovationById);
    }

    @PostMapping("/add")
    public ResponseEntity addRenovation(@RequestBody Renovation renovation) {
        Renovation savedRenovation = renovationRepository.save(renovation);
        return ResponseEntity.ok(savedRenovation);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delRenovation(@PathVariable Long id) {

        boolean isPresent = renovationRepository.existsById(id);

        if(isPresent) {
            renovationRepository.deleteById(id);
            return new ResponseEntity(id, HttpStatus.OK);
        }

        return new ResponseEntity("not found", HttpStatus.NOT_FOUND);
    }

}
