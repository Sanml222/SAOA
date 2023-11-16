package test.Entidades;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import com.example.ManipuladorDeArray;

import Entidades.Aerolinea;
import Entidades.Vuelo;

/*
    Método a Probar                    | Entrada                | Salida Esperada
    -----------------------------------|------------------------|-----------------
    testObtenerVuelosListaVacia()      | 0 vuelos registrados   | 0
    testObtenerVuelos()                | 2 vuelos registrados   | 2
    testObtenerVuelosErroneos()        | 2 vuelos registrados   | !2
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
}

