package taller.BD.Server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RestResource
@RepositoryRestResource(path="consumos", collectionResourceRel = "Consumos")
public interface RepoConsumos extends CrudRepository<Consumos, Integer>{
    
}
