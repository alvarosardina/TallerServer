package taller.BD.Server;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
//@RestResource // Faltaba esto para que funcione
//@RepositoryRestResource(path="roles", collectionResourceRel = "Roleses")
@RestResource(path = "roles",rel = "roles")
public interface RepoRoles extends CrudRepository<Roles,Integer> {
    
}
