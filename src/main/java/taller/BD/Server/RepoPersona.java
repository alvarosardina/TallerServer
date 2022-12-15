package taller.BD.Server;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
//@CrossOrigin("http://localhost:8100")

@RestResource(path = "pers", rel = "Personas")
public interface RepoPersona extends CrudRepository<Persona,Integer>{
    /* 
    List<Persona> findByApellidos(String param);
    Integer countByApellidos(String param);
    List<Persona> findByApellidosAndNombresAllIgnoreCase(String param1,String param2);
    */
}
