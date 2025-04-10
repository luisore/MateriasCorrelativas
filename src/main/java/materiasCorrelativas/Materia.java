package materiasCorrelativas;

import java.util.HashSet;
import java.util.Set;

public class Materia {
    private String nombre;


    private Set<Materia> materiasCorrelativas = new HashSet<>();

    public Materia(String nombre) {
        this.nombre = nombre;
        this.materiasCorrelativas = new HashSet<>();
    }



    public Materia agregarMateriaCorrelativa(Materia materia) {
        this.materiasCorrelativas.add(materia);
        return this;
    }

    public Set<Materia> getMateriasCorrelativas(){
        return this.materiasCorrelativas;
    }
}