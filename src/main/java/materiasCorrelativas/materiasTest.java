package materiasCorrelativas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.util.HashSet;
import java.util.Set;

public class materiasTest {


    private Alumno ricardo = new Alumno("ricardo");

    Materia materiaVacia = new Materia("MateriaVacia");

    Materia SistemasYProcesosDeNegocio = new Materia("Sistemas Y Procesos De Negocio");
    Materia AnalisisMatematico1 = new Materia("Analisis Matematico 1");
    Materia LogicaYEstructurasDiscretas = new Materia("Logica Y Estructuras Discretas");
    Materia AlgoritmosYEstructurasDeDatos = new Materia("Algoritmos Y Estructuras De Datos");
    Materia ArquitecturaDeComputadores = new Materia("Arquitectura De Computadores");
    Materia AlgebraYGeometriaAnalitica = new Materia("Algebra Y Geometria Analitica");
    Materia Fisica1 = new Materia("Fisica 1");
    Materia IngenieriaYSociedad = new Materia("Ingenieria Y Sociedad");

    Materia AnalisisDeSistemasDeInformacion = new Materia("Analisis De Sistemas De Informacion");
    Materia AnalisisMatematico2 = new Materia("Analisis Matematico 2");
    Materia SintaxisYSemanticaDeLosLenguajes = new Materia("Sintaxis Y Semantica De Los Lenguajes");
    Materia ParadigmasDeProgramacion = new Materia("Paradigmas De Programacion");
    Materia Ingles1 = new Materia("Ingles 1");
    Materia Fisica2 = new Materia("Fisica 2");
    Materia SistemasOperativos = new Materia("Sistemas Operativos");
    Materia ProbabilidadYEstadistica = new Materia("Probabilidad Y Estadistica");

    Materia DisenioDeSistemasDeInformacion = new Materia("Disenio De Sistemas De Informacion");
    Materia Ingles2 = new Materia("Ingles 2");
    Materia Economia = new Materia("Economia");
    Materia DesarrolloDeSoftware = new Materia("Desarrollo De Software");
    Materia BasesDeDatos = new Materia("Bases De Datos");
    Materia SeminarioIntegrador = new Materia("Seminario Integrador");
    Materia ComunicacionDeDatos = new Materia("Comunicacion De Datos");
    Materia RedesDeDatos = new Materia("Redes De Datos");

    public materiasTest() {
        AnalisisDeSistemasDeInformacion.agregarMateriaCorrelativa(SistemasYProcesosDeNegocio);
    }

}
