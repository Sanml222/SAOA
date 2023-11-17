package test.Entidades;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import Entidades.Aerolinea;
import Entidades.Aeropuerto;
import Entidades.CategoriaVuelo;
import Entidades.Piloto;
import Entidades.Torre;
import Entidades.Vuelo;

/*
    Método a Probar                    | Entrada                | Salida Esperada
    -----------------------------------|------------------------|-----------------
    testObtenerVuelosListaVacia()          | 0 vuelos registrados   | 0
    testObtenerVuelos()                    | 2 vuelos registrados   | 2
    testObtenerVuelosErroneos()            | 2 vuelos registrados   | !2
    testVuelosProgramadosListaVacia()      | 0 vuelos Programados   | 0
    testVuelosProgramados()                | 2 vuelos Programados   | 2
    testVuelosProgramadosErroneos()        | 2 vuelos Programados   | !2
    testVuelosOperadosListaVacia()         | 0 vuelos Operados      | 0
    testVuelosOperados()                   | 1 vuelos Operados      | 1
    testVuelosOperadosErroneos()           | 1 vuelos Operados      | !1
    testVuelosCanceladosListaVacia()       | 0 vuelos Cancelados    | 0
    testVuelosCancelados()                 | 3 vuelos Cancelados    | 3
    testVuelosCanceladosErroneos()         | 3 vuelos Cancelados    | !3
    testProgramarVuelo()                   | 1 vuelos Programado    | 1
    testProgramarVueloErrorCategoriaVuelo()| 0 vuelos Programado    | 0
    testProgramarVueloErrorAeropuertos()   | 0 vuelos Programado    | 0
    testProgramarVueloErrorFechas()        | 0 vuelos Programado    | 0
    testProgramarVueloErrorTorres()        | 0 vuelos Programado    | 0
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

    @Test
    public void testProgramarVuelo() {

        Aerolinea aerolinea1 = new Aerolinea("Avianca");
        CategoriaVuelo categoriaVuelo1 = new CategoriaVuelo("Comercial");
        Piloto piloto1 = new Piloto("Juan Perez", "123456789", "123456789", categoriaVuelo1);

        // Creamos Aeropuertos.
        Aeropuerto aeropuerto1 = new Aeropuerto("El Dorado", null);
        Aeropuerto aeropuerto2 = new Aeropuerto("El Eden", null);

        LocalDateTime fechaHoraDespegue = LocalDateTime.parse("2023-11-17 12:20", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        LocalDateTime fechaHoraAterrizaje = LocalDateTime.parse("2023-11-17 13:20", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        Torre torre1 = new Torre(1, null, "eldorado@aeropuerto.gov.co", "1234567");
        Torre torre2 = new Torre(2, null, "eleden@aeropuerto.go.co", "7654321");
        aeropuerto1.agregarTorre(torre1);
        aeropuerto2.agregarTorre(torre2);

        Vuelo vuelo = aerolinea1.programarVuelo("Nac", categoriaVuelo1, piloto1, "12", null, fechaHoraDespegue, fechaHoraAterrizaje, aeropuerto1, aeropuerto2, torre1, torre2, 123, null);
        assertNotEquals(null, vuelo);
        assertEquals(1, aerolinea1.getVuelos().size());
    }

    @Test
    public void testProgramarVueloErrorCategoriaVuelo()
    {
        Aerolinea aerolinea1 = new Aerolinea("Avianca");
        CategoriaVuelo categoriaVuelo1 = new CategoriaVuelo("Comercial");
        CategoriaVuelo categoriaVuelo2 = new CategoriaVuelo("Domestico");

        Piloto piloto1 = new Piloto("Juan Perez", "123456789", "123456789", categoriaVuelo1);

        // Creamos Aeropuertos.
        Aeropuerto aeropuerto1 = new Aeropuerto("El Dorado", null);
        Aeropuerto aeropuerto2 = new Aeropuerto("El Eden", null);

        LocalDateTime fechaHoraDespegue = LocalDateTime.parse("2023-11-17 12:20", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        LocalDateTime fechaHoraAterrizaje = LocalDateTime.parse("2023-11-17 13:20", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        Torre torre1 = new Torre(1, null, "eldorado@aeropuerto.gov.co", "1234567");
        Torre torre2 = new Torre(2, null, "eleden@aeropuerto.go.co", "7654321");
        aeropuerto1.agregarTorre(torre1);
        aeropuerto2.agregarTorre(torre2);

        Vuelo vuelo = aerolinea1.programarVuelo("Nac", categoriaVuelo2, piloto1, "12", null, fechaHoraDespegue, fechaHoraAterrizaje, aeropuerto1, aeropuerto2, torre1, torre2, 123, null);
        assertNull(vuelo);
        assertEquals(0, aerolinea1.getVuelos().size());
    }

    @Test
    public void testProgramarVueloErrorAeropuertos()
    {
        Aerolinea aerolinea1 = new Aerolinea("Avianca");
        CategoriaVuelo categoriaVuelo1 = new CategoriaVuelo("Comercial");

        Piloto piloto1 = new Piloto("Juan Perez", "123456789", "123456789", categoriaVuelo1);

        // Creamos Aeropuertos.
        Aeropuerto aeropuerto1 = new Aeropuerto("El Dorado", null);
        Aeropuerto aeropuerto2 = aeropuerto1;

        LocalDateTime fechaHoraDespegue = LocalDateTime.parse("2023-11-17 12:20", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        LocalDateTime fechaHoraAterrizaje = LocalDateTime.parse("2023-11-17 13:20", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        Torre torre1 = new Torre(1, null, "eldorado@aeropuerto.gov.co", "1234567");
        Torre torre2 = new Torre(2, null, "eleden@aeropuerto.go.co", "7654321");
        aeropuerto1.agregarTorre(torre1);
        aeropuerto2.agregarTorre(torre2);

        Vuelo vuelo = aerolinea1.programarVuelo("Nac", categoriaVuelo1, piloto1, "12", null, fechaHoraDespegue, fechaHoraAterrizaje, aeropuerto1, aeropuerto2, torre1, torre2, 123, null);
        assertNull(vuelo);
        assertEquals(0, aerolinea1.getVuelos().size());
    }

    @Test
    public void testProgramarVueloErrorFechas()
    {
        Aerolinea aerolinea1 = new Aerolinea("Avianca");
        CategoriaVuelo categoriaVuelo1 = new CategoriaVuelo("Comercial");

        Piloto piloto1 = new Piloto("Juan Perez", "123456789", "123456789", categoriaVuelo1);

        // Creamos Aeropuertos.
        Aeropuerto aeropuerto1 = new Aeropuerto("El Dorado", null);
        Aeropuerto aeropuerto2 = new Aeropuerto("El Eden", null);

        LocalDateTime fechaHoraDespegue = LocalDateTime.parse("2023-11-17 12:20", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        LocalDateTime fechaHoraAterrizaje = LocalDateTime.parse("2023-11-17 10:20", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        Torre torre1 = new Torre(1, null, "eldorado@aeropuerto.gov.co", "1234567");
        Torre torre2 = new Torre(2, null, "eleden@aeropuerto.go.co", "7654321");
        aeropuerto1.agregarTorre(torre1);
        aeropuerto2.agregarTorre(torre2);

        Vuelo vuelo = aerolinea1.programarVuelo("Nac", categoriaVuelo1, piloto1, "12", null, fechaHoraDespegue, fechaHoraAterrizaje, aeropuerto1, aeropuerto2, torre1, torre2, 123, null);
        assertNull(vuelo);
        assertEquals(0, aerolinea1.getVuelos().size());
    }

    @Test
    public void testProgramarVueloErrorTorres()
    {
        Aerolinea aerolinea1 = new Aerolinea("Avianca");
        CategoriaVuelo categoriaVuelo1 = new CategoriaVuelo("Comercial");

        Piloto piloto1 = new Piloto("Juan Perez", "123456789", "123456789", categoriaVuelo1);

        // Creamos Aeropuertos.
        Aeropuerto aeropuerto1 = new Aeropuerto("El Dorado", null);
        Aeropuerto aeropuerto2 = new Aeropuerto("El Eden", null);

        LocalDateTime fechaHoraDespegue = LocalDateTime.parse("2023-11-17 12:20", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        LocalDateTime fechaHoraAterrizaje = LocalDateTime.parse("2023-11-17 13:20", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        Torre torre1 = new Torre(1, null, "eldorado@aeropuerto.gov.co", "1234567");
        Torre torre2 = new Torre(2, null, "eleden@aeropuerto.go.co", "7654321");
        aeropuerto1.agregarTorre(torre1);
        aeropuerto1.agregarTorre(torre2);

        Vuelo vuelo = aerolinea1.programarVuelo("Nac", categoriaVuelo1, piloto1, "12", null, fechaHoraDespegue, fechaHoraAterrizaje, aeropuerto1, aeropuerto2, torre1, torre2, 123, null);
        assertNull(vuelo);
        assertEquals(0, aerolinea1.getVuelos().size());
    }

 }

  