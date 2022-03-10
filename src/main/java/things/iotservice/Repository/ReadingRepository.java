package things.iotservice.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import things.iotservice.domain.Reading;

@RepositoryRestResource
public interface ReadingRepository extends CrudRepository<Reading, Long> {
}
