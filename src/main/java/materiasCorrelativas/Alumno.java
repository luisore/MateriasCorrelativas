package materiasCorrelativas;
import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private String nombre;
    public String getNombre(){return nombre;}

    public Alumno(String nombre){
        this.materiasAprobadas = new HashSet<>();
        this.nombre = nombre;
    }

    private Set<Materia> materiasAprobadas;

    public Set<Materia> getMateriasAprobadas(){
        return this.materiasAprobadas;
    }

    public void agregarMateriaAprobada(Materia materia) {
        this.materiasAprobadas.add(materia); }
}
