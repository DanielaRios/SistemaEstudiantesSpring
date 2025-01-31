package gm.estudiantes;

import gm.estudiantes.servicio.EstudianteServicio;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {

	@Autowired
	private EstudianteServicio estudianteServicio;

	private static  final Logger logger =
			LoggerFactory.getLogger(EstudiantesApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(EstudiantesApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

	}
}
