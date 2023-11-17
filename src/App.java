import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Aerolinea;
import Entidades.Aeropuerto;
import Entidades.Avion;
import Entidades.CategoriaVuelo;
import Entidades.Piloto;
import Entidades.Torre;
import Entidades.Ubicacion;

public class App {

    List<Aeropuerto> aeropuertos;
    List<Aerolinea> aerolineas;
    List<Avion> aviones;
    List<CategoriaVuelo> categoriasVuelo;
    List<Piloto> pilotos;
    List<Torre> torres;
    List<Ubicacion> ubicaciones;

    public App(){
        this.aeropuertos = new ArrayList<Aeropuerto>();
        this.aerolineas = new ArrayList<Aerolinea>();
        this.aviones = new ArrayList<Avion>();
        this.categoriasVuelo = new ArrayList<CategoriaVuelo>();
        this.pilotos = new ArrayList<Piloto>();
        this.torres = new ArrayList<Torre>();
        this.ubicaciones = new ArrayList<Ubicacion>();
    }


    public static void main(String[] args) {
        // Creamos objetos básicos para la aplicación.
        App app = new App();

        // Creamos tres ubicaciones.
        Ubicacion ubicacion1 = new Ubicacion("4.7016", "-74.1469", "Bogotá", "Av. El Dorado #103-9, Fontibón");
        Ubicacion ubicacion2 = new Ubicacion("4.4527", "-75.7664", "Armenia", "Cl. 23 #22-08, Armenia, El Eden, Armenia, Quindío");
        Ubicacion ubicacion3 = new Ubicacion("4.8126", "-75.7395", "Pereira", "Km 4 Vía Cerritos, Pereira, Risaralda");
        app.ubicaciones.add(ubicacion1);
        app.ubicaciones.add(ubicacion2);
        app.ubicaciones.add(ubicacion3);

        // Creamos tres aviones.
        Avion avion1 = new Avion(246, "Boeig", "787-9");
        Avion avion2 = new Avion(364, "Boeig", "777");
        Avion avion3 = new Avion(288, "Airbus", "A330");
        app.aviones.add(avion1);
        app.aviones.add(avion2);
        app.aviones.add(avion3);

        // Creamos tres torres.
        Torre torre1 = new Torre(1, ubicacion1, "eldorado@aeropuerto.gov.co", "1234567");
        Torre torre2 = new Torre(2, ubicacion2, "eleden@aeropuerto.go.co", "7654321");
        Torre torre3 = new Torre(3, ubicacion3, "matecana@aeropuerto.gov.co", "135792468");
        app.torres.add(torre1);
        app.torres.add(torre2);
        app.torres.add(torre3);


        // Creamos las categorías de los vuelos.
        CategoriaVuelo categoriaVuelo1 = new CategoriaVuelo("Comercial");
        CategoriaVuelo categoriaVuelo2 = new CategoriaVuelo("Carga");
        CategoriaVuelo categoriaVuelo3 = new CategoriaVuelo("Privado");
        app.categoriasVuelo.add(categoriaVuelo1);
        app.categoriasVuelo.add(categoriaVuelo2);
        app.categoriasVuelo.add(categoriaVuelo3);

        // Creamos pilotos.
        Piloto piloto1 = new Piloto("Juan Perez", "123456789", "123456789", categoriaVuelo1);
        Piloto piloto2 = new Piloto("Maria Lopez", "987654321", "987654321", categoriaVuelo2);
        Piloto piloto3 = new Piloto("Pedro Martinez", "135792468", "135792468", categoriaVuelo3);
        Piloto piloto4 = new Piloto("Maria Martinez", "246813579", "246813579", categoriaVuelo1);
        Piloto piloto5 = new Piloto("Pedro Lopez", "357924681", "357924681", categoriaVuelo1);
        Piloto piloto6 = new Piloto("Juan Martinez", "468135792", "468135792", categoriaVuelo2);
        Piloto piloto7 = new Piloto("Maria Perez", "579246813", "579246813", categoriaVuelo3);
        app.pilotos.add(piloto1);
        app.pilotos.add(piloto2);
        app.pilotos.add(piloto3);
        app.pilotos.add(piloto4);   
        app.pilotos.add(piloto5);
        app.pilotos.add(piloto6);
        app.pilotos.add(piloto7);

        // Creamos Aerolineas.
        Aerolinea aerolinea1 = new Aerolinea("Avianca");
        Aerolinea aerolinea2 = new Aerolinea("LATAM");
        Aerolinea aerolinea3 = new Aerolinea("Viva Colombia");
        app.aerolineas.add(aerolinea1);
        app.aerolineas.add(aerolinea2);
        app.aerolineas.add(aerolinea3);

        // Creamos Aeropuertos.
        Aeropuerto aeropuerto1 = new Aeropuerto("El Dorado", ubicacion1);
        Aeropuerto aeropuerto2 = new Aeropuerto("El Eden", ubicacion2);
        Aeropuerto aeropuerto3 = new Aeropuerto("Matecana", ubicacion3);
        app.aeropuertos.add(aeropuerto1);
        app.aeropuertos.add(aeropuerto2);
        app.aeropuertos.add(aeropuerto3);

        // Valor opcion de salida
        int salir = 0;
        while (salir == 0) {
            // Mostramos el menú de opciones de la aplicación.
            System.out.println("Menú de opciones:");
            // Imprimir listado de operaciones.
            System.out.println("1. Programar un vuelo.");     // 1. Programar un vuelo.
           
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
                    System.out.println("Programar un vuelo.");
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
