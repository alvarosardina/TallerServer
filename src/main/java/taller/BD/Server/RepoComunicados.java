package taller.BD.Server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
//@RestResource
@RepositoryRestResource(path="comunicados", collectionResourceRel = "Comunicados")
public interface RepoComunicados extends CrudRepository<Comunicados, Integer>{
    
}
