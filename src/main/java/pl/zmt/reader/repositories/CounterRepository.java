package pl.zmt.reader.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.zmt.reader.entities.Counter;

@Repository
public interface CounterRepository extends CrudRepository<Counter, Long> {

}
