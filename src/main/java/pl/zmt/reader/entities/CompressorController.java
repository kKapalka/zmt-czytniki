package pl.zmt.reader.entities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/compressors")
public class CompressorController {

    @Autowired
    CompressorRepository compressorRepository;

    @GetMapping
    public @ResponseBody
    Iterable<Compressor> getAllCompressors() {
        return compressorRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody
    Optional<Compressor> getCompressorById(@PathVariable Long id) {
        return compressorRepository.findById(id);
    }

    @PostMapping("/add")
    public Compressor addCompressor(@RequestBody Compressor compressor) {
        return compressorRepository.save(compressor);
    }

    @DeleteMapping("/{id}")
    public void delCompressor(@PathVariable Long id) {
        compressorRepository.deleteById(id);
    }

}
