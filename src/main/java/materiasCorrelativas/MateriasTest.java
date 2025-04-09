package materiasCorrelativas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MateriasTest {


    Alumno ricardo = new Alumno("ricardo");

    Materia materiaVacia = new Materia("MateriaVacia");

    Materia SistemasYProcesosDeNegocio = new Materia("Sistemas Y Procesos De Negocio");
    Materia AnalisisMatematico1 = new Materia("Analisis Matematico 1");
    Materia LogicaYEstructurasDiscretas = new Materia("Logica Y Estructuras Discretas");
    Materia AlgoritmosYEstructurasDeDatos = new Materia("Algoritmos Y Estructuras De Datos");
    Materia ArquitecturaDeComputadores = new Materia("Arquitectura De Computadores");
    Materia AlgebraYGeometriaAnalitica = new Materia("Algebra Y Geometria Analitica");
    Materia Fisica1 = new Materia("Fisica 1");
    Materia IngenieriaYSociedad = new Materia("Ingenieria Y Sociedad");



    Materia AnalisisDeSistemasDeInformacion = new Materia("Analisis De Sistemas De Informacion")
            .agregarMateriaCorrelativa(SistemasYProcesosDeNegocio)
            .agregarMateriaCorrelativa(AlgoritmosYEstructurasDeDatos);

    Materia AnalisisMatematico2 = new Materia("Analisis Matematico 2")
            .agregarMateriaCorrelativa(AlgebraYGeometriaAnalitica)
            .agregarMateriaCorrelativa(AnalisisMatematico1);

    Materia SintaxisYSemanticaDeLosLenguajes = new Materia("Sintaxis Y Semantica De Los Lenguajes")
            .agregarMateriaCorrelativa(LogicaYEstructurasDiscretas)
            .agregarMateriaCorrelativa(AlgebraYGeometriaAnalitica);

    Materia ParadigmasDeProgramacion = new Materia("Paradigmas De Programacion")
            .agregarMateriaCorrelativa(LogicaYEstructurasDiscretas)
            .agregarMateriaCorrelativa(AlgoritmosYEstructurasDeDatos);

    Materia Ingles1 = new Materia("Ingles 1");

    Materia Fisica2 = new Materia("Fisica 2")
            .agregarMateriaCorrelativa(Fisica1)
            .agregarMateriaCorrelativa(AnalisisMatematico2);

    Materia SistemasOperativos = new Materia("Sistemas Operativos")
            .agregarMateriaCorrelativa(ArquitecturaDeComputadores);

    Materia ProbabilidadYEstadistica = new Materia("Probabilidad Y Estadistica")
            .agregarMateriaCorrelativa(AlgebraYGeometriaAnalitica)
            .agregarMateriaCorrelativa(AnalisisMatematico1);

    Materia DisenioDeSistemasDeInformacion = new Materia("Disenio De Sistemas De Informacion")
            .agregarMateriaCorrelativa(AnalisisDeSistemasDeInformacion)
            .agregarMateriaCorrelativa(ParadigmasDeProgramacion)
            .agregarMateriaCorrelativa(Ingles1)
            .agregarMateriaCorrelativa(AlgoritmosYEstructurasDeDatos)
            .agregarMateriaCorrelativa(SistemasYProcesosDeNegocio);

    Materia Ingles2 = new Materia("Ingles 2")
            .agregarMateriaCorrelativa(Ingles1);

    Materia Economia = new Materia("Economia")
            .agregarMateriaCorrelativa(AlgebraYGeometriaAnalitica)
            .agregarMateriaCorrelativa(AnalisisMatematico1);

    Materia DesarrolloDeSoftware = new Materia("Desarrollo De Software")
            .agregarMateriaCorrelativa(ParadigmasDeProgramacion)
            .agregarMateriaCorrelativa(AnalisisDeSistemasDeInformacion)
            .agregarMateriaCorrelativa(LogicaYEstructurasDiscretas)
            .agregarMateriaCorrelativa(AlgoritmosYEstructurasDeDatos);

    Materia BasesDeDatos = new Materia("Bases De Datos")
            .agregarMateriaCorrelativa(SintaxisYSemanticaDeLosLenguajes)
            .agregarMateriaCorrelativa(AnalisisDeSistemasDeInformacion)
            .agregarMateriaCorrelativa(LogicaYEstructurasDiscretas)
            .agregarMateriaCorrelativa(AlgoritmosYEstructurasDeDatos);


    Materia SeminarioIntegrador = new Materia("Seminario Integrador")
            .agregarMateriaCorrelativa(SistemasOperativos)
            .agregarMateriaCorrelativa(ArquitecturaDeComputadores)
            .agregarMateriaCorrelativa(Ingles1)
            .agregarMateriaCorrelativa(AnalisisDeSistemasDeInformacion)
            .agregarMateriaCorrelativa(SintaxisYSemanticaDeLosLenguajes);

    Materia ComunicacionDeDatos = new Materia("Comunicacion De Datos")
            .agregarMateriaCorrelativa(ArquitecturaDeComputadores)
            .agregarMateriaCorrelativa(Fisica1);

    Materia RedesDeDatos = new Materia("Redes De Datos")
            .agregarMateriaCorrelativa(SistemasOperativos)
            .agregarMateriaCorrelativa(ComunicacionDeDatos);

    @Test
    public void InscribirMateriaTest() {

        ricardo.agregarMateriaAprobada(AnalisisMatematico1);
        ricardo.agregarMateriaAprobada(AlgebraYGeometriaAnalitica);

        Inscripcion Inscripcion = new Inscripcion(ricardo);
        Inscripcion.agregarMateria(AnalisisMatematico2);

        assertEquals(Inscripcion.aprobada(), Boolean.TRUE);

    }

}
