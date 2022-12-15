package taller.BD.Server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource(path="cobros", collectionResourceRel = "Cobroses")
public interface RepoCobros extends CrudRepository<Cobros, Integer>{
    
}
