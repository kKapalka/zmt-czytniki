package pl.zmt.reader.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.zmt.reader.entities.Compressor;
import pl.zmt.reader.repositories.CompressorRepository;


import java.util.Optional;


@RestController
@RequestMapping("/compressors")
public class CompressorController {

    @Autowired
    CompressorRepository compressorRepository;

    @GetMapping
    public ResponseEntity<Iterable<Compressor>> getAllCompressors() {
        Iterable<Compressor> compressors = compressorRepository.findAll();
        return ResponseEntity.ok(compressors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Compressor>> compressorById (@PathVariable Long id) {
        Optional<Compressor> compressorById = compressorRepository.findById(id);
        return ResponseEntity.ok(compressorById);
    }

    @PostMapping("/add")
    public ResponseEntity<Compressor> addCompressor(@RequestBody Compressor compressor) {
        Compressor savedCompressor = compressorRepository.save(compressor);
        return ResponseEntity.ok(savedCompressor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delCompressor(@PathVariable Long id) {

        boolean isPresent = compressorRepository.existsById(id);

        if(isPresent) {
            compressorRepository.deleteById(id);
            return new ResponseEntity<>(id.toString(), HttpStatus.OK);
        }

        return new ResponseEntity<>("not found", HttpStatus.NOT_FOUND);
    }

}
