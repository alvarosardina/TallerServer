package taller.BD.Server;

import java.sql.Date;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
//@RestResource
@RepositoryRestResource(path="reclamos", collectionResourceRel = "Reclamos")
public interface RepoReclamos extends CrudRepository<Reclamos, Date>{
    
}
