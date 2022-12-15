package taller.BD.Server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")

//@RestResource
@RepositoryRestResource(path="solicitud", collectionResourceRel = "Solicitudes")
public interface RepoSolicitudes extends CrudRepository<Solicitudes, Integer>{
    
}
