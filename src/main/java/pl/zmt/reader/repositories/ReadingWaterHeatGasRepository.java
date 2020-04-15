package pl.zmt.reader.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.zmt.reader.entities.ReadingWaterHeatGas;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface ReadingWaterHeatGasRepository extends CrudRepository<ReadingWaterHeatGas, Long> {

}

