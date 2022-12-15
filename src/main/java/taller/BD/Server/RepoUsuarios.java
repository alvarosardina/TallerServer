package taller.BD.Server;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")

public interface RepoUsuarios extends CrudRepository<Usuario,String> {

}