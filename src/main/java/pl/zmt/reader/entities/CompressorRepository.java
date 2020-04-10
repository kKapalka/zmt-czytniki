package pl.zmt.reader.entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.LongAccumulator;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface CompressorRepository extends CrudRepository<Compressor, Long> {

}

