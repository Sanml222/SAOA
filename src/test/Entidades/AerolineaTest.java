package test.Entidades;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import java.util.List;

import Entidades.Aerolinea;
import Entidades.Vuelo;

/*
    Método a Probar                    | Entrada                | Salida Esperada
    -----------------------------------|------------------------|-----------------
    testObtenerVuelosListaVacia()      | 0 vuelos registrados   | 0
    testObtenerVuelos()                | 2 vuelos registrados   | 2
    testObtenerVuelosErroneos()        | 2 vuelos registrados   | !2
    testVuelosProgramadosListaVacia()  | 0 vuelos Programados   | 0
    testVuelosProgramados()            | 2 vuelos Programados   | 2
    testVuelosProgramadosErroneos()    | 2 vuelos Programados   | !2
    testVuelosOperadosListaVacia()     | 0 vuelos Operados      | 0
    testVuelosOperados()               | 1 vuelos Operados      | 1
    testVuelosOperadosErroneos()       | 1 vuelos Operados      | !1
    testVuelosCanceladosListaVacia()   | 0 vuelos Operados      | 0
    testVuelosCancelados()             | 3 vuelos Operados      | 3
    testVuelosCanceladosErroneos()     | 3 vuelos Operados      | !3
*/

public class AerolineaTest {

    @Test
    public void testObtenerVuelosListaVacia() {

        Aerolinea aerolinea1 = new Aerolinea("Avianca");

        int numeroDeVuelos = aerolinea1.obtenerTotalVuelos();

        assertEquals(0, numeroDeVuelos);
    }

    @Test
    public void testObtenerVuelos() {

        Aerolinea aerolinea1 = new Aerolinea("Avianca");

        Vuelo vuelo1 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, null, null);
        Vuelo vuelo2 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, null, null);

        // Simulamos que existen dos vuelos creados
        aerolinea1.getVuelos().add(vuelo1);
        aerolinea1.getVuelos().add(vuelo2);

        int numeroDeVuelos = aerolinea1.obtenerTotalVuelos();

        assertEquals(2, numeroDeVuelos);
    }     

    @Test
    public void testObtenerVuelosErroneos() {

        Aerolinea aerolinea1 = new Aerolinea("Avianca");

        Vuelo vuelo1 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, null, null);
        Vuelo vuelo2 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, null, null);

        // Simulamos que existen dos vuelos creados
        aerolinea1.getVuelos().add(vuelo1);
        aerolinea1.getVuelos().add(vuelo2);

        int numeroDeVuelos = aerolinea1.obtenerTotalVuelos();

        assertNotEquals(9, numeroDeVuelos);
    }

    @Test
    public void testVuelosProgramadosListaVacia() {

        Aerolinea aerolinea1 = new Aerolinea("Avianca");

        Vuelo vuelo1 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Cancelado", null);
        Vuelo vuelo2 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "En Aire", null);

        // Simulamos que existen dos vuelos creados
        aerolinea1.getVuelos().add(vuelo1);
        aerolinea1.getVuelos().add(vuelo2);

        List<Vuelo> programados = aerolinea1.vuelosProgramados();

        assertEquals(0, programados.size());
    }  

    @Test
    public void testVuelosProgramados() {

        Aerolinea aerolinea1 = new Aerolinea("Avianca");

        Vuelo vuelo1 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Programado", null);
        Vuelo vuelo2 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "En Aire", null);
        Vuelo vuelo3 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Programado", null);
       
        // Simulamos que existen dos vuelos creados
        aerolinea1.getVuelos().add(vuelo1);
        aerolinea1.getVuelos().add(vuelo2);
        aerolinea1.getVuelos().add(vuelo3);

        List<Vuelo> programados = aerolinea1.vuelosProgramados();

        assertEquals(2, programados.size());
    } 

    @Test
    public void testVuelosProgramadosErroneos() {

        Aerolinea aerolinea1 = new Aerolinea("Avianca");

        Vuelo vuelo1 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Programado", null);
        Vuelo vuelo2 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "En Aire", null);
        Vuelo vuelo3 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Programado", null);
       
        // Simulamos que existen dos vuelos creados
        aerolinea1.getVuelos().add(vuelo1);
        aerolinea1.getVuelos().add(vuelo2);
        aerolinea1.getVuelos().add(vuelo3);

        List<Vuelo> programados = aerolinea1.vuelosProgramados();

        assertNotEquals(9, programados.size());
    }

    @Test
    public void testVuelosOperadosListaVacia() {

        Aerolinea aerolinea1 = new Aerolinea("Avianca");

        Vuelo vuelo1 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Cancelado", null);
        Vuelo vuelo2 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Programado", null);

        // Simulamos que existen dos vuelos creados
        aerolinea1.getVuelos().add(vuelo1);
        aerolinea1.getVuelos().add(vuelo2);

        List<Vuelo> operados = aerolinea1.vuelosOperados();

        assertEquals(0, operados.size());
    }

    @Test
    public void testVuelosOperados() {

        Aerolinea aerolinea1 = new Aerolinea("Avianca");

        Vuelo vuelo1 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Programado", null);
        Vuelo vuelo2 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "En Aire", null);
        Vuelo vuelo3 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Aterrizado", null);
       
        // Simulamos que existen dos vuelos creados
        aerolinea1.getVuelos().add(vuelo1);
        aerolinea1.getVuelos().add(vuelo2);
        aerolinea1.getVuelos().add(vuelo3);

        List<Vuelo> operados = aerolinea1.vuelosOperados();

        assertEquals(1, operados.size());
    }

    @Test
    public void testVuelosOperadosErroneos() {


        Aerolinea aerolinea1 = new Aerolinea("Avianca");

        Vuelo vuelo1 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Programado", null);
        Vuelo vuelo2 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "En Aire", null);
        Vuelo vuelo3 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Operados", null);
       
        // Simulamos que existen dos vuelos creados
        aerolinea1.getVuelos().add(vuelo1);
        aerolinea1.getVuelos().add(vuelo2);
        aerolinea1.getVuelos().add(vuelo3);

        List<Vuelo> Operados = aerolinea1.vuelosOperados();

        assertNotEquals(7, Operados.size());
    }

    @Test
    public void testVuelosCanceladosListaVacia() {

        Aerolinea aerolinea1 = new Aerolinea("Avianca");

        Vuelo vuelo1 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Aterrizado", null);
        Vuelo vuelo2 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Programado", null);

        // Simulamos que existen dos vuelos creados
        aerolinea1.getVuelos().add(vuelo1);
        aerolinea1.getVuelos().add(vuelo2);

        List<Vuelo> cancelados = aerolinea1.vuelosCancelados();

        assertEquals(0, cancelados.size());
    }

        @Test
    public void testVuelosCanceladoss() {

        Aerolinea aerolinea1 = new Aerolinea("Avianca");

        Vuelo vuelo1 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Cancelado", null);
        Vuelo vuelo2 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Cancelado", null);
        Vuelo vuelo3 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Cancelado", null);
       
        // Simulamos que existen dos vuelos creados
        aerolinea1.getVuelos().add(vuelo1);
        aerolinea1.getVuelos().add(vuelo2);
        aerolinea1.getVuelos().add(vuelo3);

        List<Vuelo> cancelados = aerolinea1.vuelosCancelados();

        assertEquals(3, cancelados.size());
    }

    @Test
    public void testVuelosCanceladosErroneos() {


        Aerolinea aerolinea1 = new Aerolinea("Avianca");

        Vuelo vuelo1 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Cancelado", null);
        Vuelo vuelo2 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Cancelado", null);
        Vuelo vuelo3 = new Vuelo(null, aerolinea1, null, null, null, null, null, null, null, null, null, null, 0, "Cancelado", null);
       
        // Simulamos que existen dos vuelos creados
        aerolinea1.getVuelos().add(vuelo1);
        aerolinea1.getVuelos().add(vuelo2);
        aerolinea1.getVuelos().add(vuelo3);

        List<Vuelo> cancelados = aerolinea1.vuelosCancelados();

        assertNotEquals(4, cancelados.size());
    }
}

  