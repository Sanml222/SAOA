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


}

