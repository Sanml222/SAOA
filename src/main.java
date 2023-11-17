import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Entidades.Aerolinea;
import Entidades.Aeropuerto;
import Entidades.Avion;
import Entidades.CategoriaVuelo;
import Entidades.Piloto;
import Entidades.Torre;
import Entidades.Ubicacion;

public class Main {

    public static void main(String[] args) {
        // Creamos objetos básicos para la aplicación.
        App app = new App();
        app.cargarDatos();

        // Valor opcion de salida
        int salir = 0;
        while (salir == 0) {
            // Mostramos el menú de opciones de la aplicación.
            System.out.println("\nMenú de opciones:");
            // Imprimir listado de operaciones.
            System.out.println("1. Programar un vuelo.");     // 1. Programar un vuelo.
           
            System.out.println("8. Mostrar número de vuelos.");     // 8. Mostrar número de vuelos.
            System.out.println("9. Mostrar número de vuelos programados.");     // 9. Mostrar número de vuelos programados.
            System.out.println("10. Mostrar número de vuelos cancelados.");     // 10. Mostrar número de vuelos cancelados.
            System.out.println("11. Mostrar número de vuelos en operados.");     // 11. Mostrar número de vuelos en operados.
            System.out.println("\n0. Salir.");     // 0. Salir.

            // Solicitamos la opción al usuario.
            Scanner scanner = new Scanner(System.in);
            scanner.useDelimiter("\n");
            System.out.println("Ingrese la opción: ");
            int opcion = scanner.nextInt();

            // Ejecutamos la opción seleccionada por el usuario.
            switch (opcion) {
                case 0:
                    System.out.println("Gracias por usar nuestra aplicación.");
                    salir = 1;
                    break;
                case 1:
                    System.out.println("\nProgramar un vuelo.");
                    Scanner info = new Scanner(System.in);
                    info.useDelimiter("\n");

                    System.out.println("Ingrese nombre de la aerolinea: ");
                    String nombreAerolinea = info.nextLine();
                    Aerolinea aerolinea = app.buscarAerolinea(nombreAerolinea);

                    System.out.println("Ingrese la categoria del vuelo: ");
                    String categoria = info.nextLine();
                    CategoriaVuelo categoriaVuelo = app.buscarCategoriaVuelo(categoria);

                    System.out.println("Ingrese la licencia del piloto: ");
                    String licenciaPiloto = info.nextLine();
                    Piloto piloto = app.buscarPiloto(licenciaPiloto);

                    System.out.println("Ingrese la fecha/hora del despegue: ");
                    String fechaDespegue = info.nextLine();
                    LocalDateTime fechaHoraDespegue = LocalDateTime.parse(fechaDespegue, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

                    System.out.println("Ingrese la fecha/hora aproximada del aterrizaje: ");
                    String fechaAterrizaje = info.nextLine();
                    LocalDateTime fechaHoraAterrizaje = LocalDateTime.parse(fechaAterrizaje, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

                    System.out.println("Ingrese el nombre del aeropuerto de origen: ");
                    String nombreAeropuertoOrigen = info.nextLine();
                    Aeropuerto aeropuertoOrigen = app.buscarAeropuerto(nombreAeropuertoOrigen);

                    Torre torreOrigen = aeropuertoOrigen.buscarTorreDisponible();

                    System.out.println("Ingrese el nombre del aeropuerto de destino: ");
                    String nombreAeropuertoDestino = info.nextLine();
                    Aeropuerto aeropuertoDestino = app.buscarAeropuerto(nombreAeropuertoDestino);

                    Torre torreDestino = aeropuertoDestino.buscarTorreDisponible();
                    
                    System.out.println("Ingrese la referencia del avion: ");
                    String referenciaAvion = info.nextLine();
                    Avion avion = app.buscarAvion(referenciaAvion);

                    System.out.println("Ingrese el tipo de ruta (Nacional o Internacional): ");
                    String tipoRuta = info.nextLine();

                    System.out.println("Ingrese terminal de salida: ");
                    String terminalSalida = info.nextLine();

                    System.out.println("Ingrese la puerta de embarque: ");
                    String puertaEmbarque = info.nextLine();

                    System.out.println("Ingrese el numero de pasajeros: ");
                    int numeroPasajeros = info.nextInt();

                    aerolinea.programarVuelo(tipoRuta, categoriaVuelo, piloto, terminalSalida, puertaEmbarque, fechaHoraDespegue, fechaHoraAterrizaje, aeropuertoOrigen, aeropuertoDestino, torreOrigen, torreDestino, numeroPasajeros, avion);
                    break;
                case 8:
                    System.out.println("\nMostrar número de vuelos.");
                    for (Aerolinea aero : app.aerolineas) {
                        System.out.println(aero.getNombre() + " ha creado " + aero.obtenerTotalVuelos()  + " vuelos.");
                    }
                    break;
                case 9:
                    System.out.println("\nMostrar número de vuelos programados.");
                    for (Aerolinea aero : app.aerolineas) {
                        System.out.println(aero.getNombre() + ": " + aero.vuelosProgramados());
                    }
                    System.out.println("\n");
                    break;
                case 10:
                    System.out.println("\nMostrar número de vuelos cancelados.");
                    for (Aerolinea aero : app.aerolineas) {
                        System.out.println(aero.getNombre() + ": " + aero.vuelosCancelados());
                    }
                    System.out.println("\n");
                    break;
                case 11:
                    System.out.println("\nMostrar número de vuelos en operados.");
                     for (Aerolinea aero : app.aerolineas) {
                        System.out.println(aero.getNombre() + ": " + aero.vuelosOperados());
                    }
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
    
}
