import java.util.ArrayList;
import java.util.List;

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

    public void cargarDatos()
    {
        // Creamos tres ubicaciones.
        Ubicacion ubicacion1 = new Ubicacion("4.7016", "-74.1469", "Bogotá", "Av. El Dorado #103-9, Fontibón");
        Ubicacion ubicacion2 = new Ubicacion("4.4527", "-75.7664", "Armenia", "Cl. 23 #22-08, Armenia, El Eden, Armenia, Quindío");
        Ubicacion ubicacion3 = new Ubicacion("4.8126", "-75.7395", "Pereira", "Km 4 Vía Cerritos, Pereira, Risaralda");
        this.ubicaciones.add(ubicacion1);
        this.ubicaciones.add(ubicacion2);
        this.ubicaciones.add(ubicacion3);

        // Creamos tres aviones.
        Avion avion1 = new Avion(246, "Boeig", "787-9");
        Avion avion2 = new Avion(364, "Boeig", "777");
        Avion avion3 = new Avion(288, "Airbus", "A330");
        this.aviones.add(avion1);
        this.aviones.add(avion2);
        this.aviones.add(avion3);

        // Creamos tres torres.
        Torre torre1 = new Torre(1, ubicacion1, "eldorado@aeropuerto.gov.co", "1234567");
        Torre torre2 = new Torre(2, ubicacion2, "eleden@aeropuerto.go.co", "7654321");
        Torre torre3 = new Torre(3, ubicacion3, "matecana@aeropuerto.gov.co", "135792468");
        this.torres.add(torre1);
        this.torres.add(torre2);
        this.torres.add(torre3);


        // Creamos las categorías de los vuelos.
        CategoriaVuelo categoriaVuelo1 = new CategoriaVuelo("Comercial");
        CategoriaVuelo categoriaVuelo2 = new CategoriaVuelo("Carga");
        CategoriaVuelo categoriaVuelo3 = new CategoriaVuelo("Privado");
        this.categoriasVuelo.add(categoriaVuelo1);
        this.categoriasVuelo.add(categoriaVuelo2);
        this.categoriasVuelo.add(categoriaVuelo3);

        // Creamos pilotos.
        Piloto piloto1 = new Piloto("Juan Perez", "123456789", "123456789", categoriaVuelo1);
        Piloto piloto2 = new Piloto("Maria Lopez", "987654321", "987654321", categoriaVuelo2);
        Piloto piloto3 = new Piloto("Pedro Martinez", "135792468", "135792468", categoriaVuelo3);
        Piloto piloto4 = new Piloto("Maria Martinez", "246813579", "246813579", categoriaVuelo1);
        Piloto piloto5 = new Piloto("Pedro Lopez", "357924681", "357924681", categoriaVuelo1);
        Piloto piloto6 = new Piloto("Juan Martinez", "468135792", "468135792", categoriaVuelo2);
        Piloto piloto7 = new Piloto("Maria Perez", "579246813", "579246813", categoriaVuelo3);
        this.pilotos.add(piloto1);
        this.pilotos.add(piloto2);
        this.pilotos.add(piloto3);
        this.pilotos.add(piloto4);   
        this.pilotos.add(piloto5);
        this.pilotos.add(piloto6);
        this.pilotos.add(piloto7);

        // Creamos Aerolineas.
        Aerolinea aerolinea1 = new Aerolinea("Avianca");
        Aerolinea aerolinea2 = new Aerolinea("LATAM");
        Aerolinea aerolinea3 = new Aerolinea("Viva Colombia");
        this.aerolineas.add(aerolinea1);
        this.aerolineas.add(aerolinea2);
        this.aerolineas.add(aerolinea3);

        // Creamos Aeropuertos.
        Aeropuerto aeropuerto1 = new Aeropuerto("El Dorado", ubicacion1);
        Aeropuerto aeropuerto2 = new Aeropuerto("El Eden", ubicacion2);
        Aeropuerto aeropuerto3 = new Aeropuerto("Matecana", ubicacion3);
        this.aeropuertos.add(aeropuerto1);
        this.aeropuertos.add(aeropuerto2);
        this.aeropuertos.add(aeropuerto3);

        // agregamos las torres a los aeropuertos.
        aeropuerto1.agregarTorre(torre1);
        aeropuerto2.agregarTorre(torre2);
        aeropuerto3.agregarTorre(torre3);
    }

    public Aerolinea buscarAerolinea(String nombreAerolinea){
        Aerolinea aerolineaEncontrada = null;
        for (Aerolinea aerolinea : aerolineas) {
            if(aerolinea.getNombre().equals(nombreAerolinea)){
                aerolineaEncontrada = aerolinea;
            }
        }
        return aerolineaEncontrada;
    }

    public CategoriaVuelo buscarCategoriaVuelo(String nombreCategoria){
        CategoriaVuelo categoriaEncontrada = null;
        for (CategoriaVuelo categoria : categoriasVuelo) {
            if(categoria.getNombre().equals(nombreCategoria)){
                categoriaEncontrada = categoria;
            }
        }
        return categoriaEncontrada;
    }

    public Piloto buscarPiloto(String licencia){
        Piloto pilotoEncontrado = null;
        for (Piloto piloto : pilotos) {
            if(piloto.getLicencia().equals(licencia)){
                pilotoEncontrado = piloto;
            }
        }
        return pilotoEncontrado;
    }

    public Aeropuerto buscarAeropuerto(String nombreAeropuerto){
        Aeropuerto aeropuertoEncontrado = null;
        for (Aeropuerto aeropuerto : aeropuertos) {
            if(aeropuerto.getNombre().equals(nombreAeropuerto)){
                aeropuertoEncontrado = aeropuerto;
            }
        }
        return aeropuertoEncontrado;
    }

    public Avion buscarAvion(String referencia){
        Avion avionEncontrado = null;
        for (Avion avion : aviones) {
            if(avion.getReferencia().equals(referencia)){
                avionEncontrado = avion;
            }
        }
        return avionEncontrado;
    }

}
