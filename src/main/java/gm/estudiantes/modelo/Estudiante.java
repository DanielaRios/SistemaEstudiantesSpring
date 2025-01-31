package gm.estudiantes.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity     //anotación de base de datos
//anotaciones de codigo repetido lombok
@Data
@NoArgsConstructor //constructor vacio
@AllArgsConstructor //constructor completo
@ToString
public class Estudiante {
    @Id  //anotacion clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para indicar como generar el valor de la PK
    private Integer idEstudiante;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}
