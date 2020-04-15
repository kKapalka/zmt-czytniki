package pl.zmt.reader.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.zmt.reader.entities.Renovation;
import pl.zmt.reader.repositories.RenovationRepository;

import java.util.Optional;


@RestController
@RequestMapping("/renovations")
public class RenovationController {

    @Autowired
    RenovationRepository renovationRepository;

    @GetMapping
    public ResponseEntity<Iterable<Renovation>> getAllRenovations() {
        Iterable<Renovation> renovations = renovationRepository.findAll();
        return ResponseEntity.ok(renovations);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Renovation>> renovationById (@PathVariable Long id) {
        Optional<Renovation> renovationById = renovationRepository.findById(id);
        return ResponseEntity.ok(renovationById);
    }

    @PostMapping("/add")
    public ResponseEntity<Renovation> addRenovation(@RequestBody Renovation renovation) {
        Renovation savedRenovation = renovationRepository.save(renovation);
        return ResponseEntity.ok(savedRenovation);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delRenovation(@PathVariable Long id) {

        boolean isPresent = renovationRepository.existsById(id);

        if(isPresent) {
            renovationRepository.deleteById(id);
            return new ResponseEntity<>(id.toString(), HttpStatus.OK);
        }

        return new ResponseEntity<>("not found", HttpStatus.NOT_FOUND);
    }

}
