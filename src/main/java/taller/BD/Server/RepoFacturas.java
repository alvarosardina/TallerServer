package taller.BD.Server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
//@RestResource
@RepositoryRestResource(path="facturas", collectionResourceRel = "Facturas")
public interface RepoFacturas extends CrudRepository<Facturas, Integer>{
    
}
