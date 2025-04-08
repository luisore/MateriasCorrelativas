package materiasCorrelativas;

import java.awt.image.ImageProducer;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Inscripcion {
    private Set<Materia> materiasAInscribir;
    private Alumno alumno;

    public Inscripcion(Alumno alumno){

        this.materiasAInscribir = new HashSet<>();
        this.alumno = alumno;
    }

    public void agregarMateria(Materia materia){
        this.materiasAInscribir.add(materia);
    }

    public Set<Materia> getMateriasAInscribir(){
        return this.materiasAInscribir;
    }

    public Boolean aprobada(){
        return materiasAInscribir.stream()
            .flatMap(materia -> materia.getMateriasCorrelativas().stream())
            .allMatch(materia -> alumno.getMateriasAprobadas().contains(materia));
    }

}
