package taller.BD.Server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(RepoUsuarios repository,
	RepoSolicitudes X, RepoReclamos Y)
	 {
  	  return (args) -> {
		//System.out.println("Estoy añadiendo un usuario");
		Usuario t = new Usuario();
		t.setUsr("Octavio");t.setClave("12345678");
		repository.save(t);
		/*Solicitudes tmp = new Solicitudes();
		tmp.setDetalle("Prueba2");
		tmp.setAtendido(true);
		X.save(tmp);
		Reclamos tmp2 = new Reclamos();
		tmp2.setResultado("Pendiente");
		Y.save(tmp2);
		*/
	  };
	}
}
