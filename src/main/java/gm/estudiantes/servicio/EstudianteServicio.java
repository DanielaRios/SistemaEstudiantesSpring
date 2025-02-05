package gm.estudiantes.servicio;


import gm.estudiantes.modelo.Estudiante;
import gm.estudiantes.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  //se agregar para que esta clase la pueda reconocer como componente service
public class EstudianteServicio implements IEstudianteServicio {

    @Autowired   //anotación proporcionada por Spring que te permite inyectar dependencias automáticamente, es para no instanciarla utilizando el "new"
    private EstudianteRepositorio estudianteRepositorio;

    @Override
    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> estudiantes = estudianteRepositorio.findAll();
        return estudiantes;
    }

    @Override
    public Estudiante buscarEstudiantePorId(Integer idEstudiante) {
        Estudiante estudiante =
                estudianteRepositorio.findById(idEstudiante).orElse(null);
            // tambien se puede usar .orElseThrow si quiero usar excepciones
        return estudiante;
    }

    @Override
    public void guardarEstudiante(Estudiante estudiante) {
    estudianteRepositorio.save(estudiante);
    //el metodo "save" es el mismo para insertar o actualizar
    }

    @Override
    public void eliminarEstudiante(Estudiante estudiante) {
    estudianteRepositorio.delete(estudiante);
    }
/* Todos estos metodos que usa "estudianteRepositorio" provienen de la
    implementacion "extends JpaRepository<Estudiante,Integer>"
 */

}
