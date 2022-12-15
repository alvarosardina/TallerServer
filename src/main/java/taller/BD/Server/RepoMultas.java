package taller.BD.Server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RestResource
@RepositoryRestResource(path="multas", collectionResourceRel = "Multas")
public interface RepoMultas extends CrudRepository<Multas, Integer>{
    
}
