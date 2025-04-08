package materiasCorrelativas;

import java.util.HashSet;
import java.util.Set;

public class Materia {
    private Set<Materia> materiasCorrelativas;


    public Materia(){
        this.materiasCorrelativas = new HashSet<>();
    }

    public void agregarCorrelativa(Materia materia) {
        this.materiasCorrelativas.add(materia); }

    public Set<Materia> getMateriasCorrelativas(){
        return this.materiasCorrelativas;
    }
}