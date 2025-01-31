package gm.estudiantes.repositorio;

import gm.estudiantes.modelo.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

/* Es una interface que a su vez implementa otra interfaz de Spring JPA
 extends JpaRepository<Estudiante,Integer>
 se especifica con que clase queremos interactuar en este caso
 "Estudiantes" y tamb se especifica el tipo de la PK q es Integer
 */
public interface EstudianteRepositorio extends JpaRepository<Estudiante,Integer> {
}
