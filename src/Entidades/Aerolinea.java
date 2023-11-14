package Entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Aerolinea {

    private String nombre;
    private List <Piloto> pilotos;
    private List <Vuelo> vuelos;

    public Aerolinea(String nombre1){

        this.nombre = nombre1;
        // se crea una lista de pilotos vacia
        this.pilotos = new ArrayList<Piloto>();
        // se crea una lista de vuelos vacia
        this.vuelos = new ArrayList<Vuelo>();

    }
    public String getNombre(){

     return nombre;
    }
    public void setNombre(String nombre1){

        this.nombre = nombre1;
    }

    public List <Piloto> getPilotos(){

     return pilotos;
    }
    public void agregarPilotos(Piloto nuevoPiloto){
        // a la lista de pilotos le agregamos un nuevo piloto
        this.pilotos.add(nuevoPiloto);
    }
    
    public List <Vuelo> getVuelos(){

        return vuelos;
    }
    
    public int obtenerTotalVuelos(){
        // devolvemos la cantidad de elementos que tiene la lista de vuelos
        return vuelos.size(); 
    }

    public List <Vuelo> vuelosProgramados(){
        //creamos la nueva lista vuelos programados
        List <Vuelo> vuelosProgramados = new ArrayList <Vuelo>();
        //recorremos la lista
        for(Vuelo vuelo: vuelos){
            //preguntamos si el estado es programado 
            if ("Programado".equals(vuelo.getEstado())){
                // si lo es, lo agregamos a la lista
                vuelosProgramados.add(vuelo);
            }           
        }

        return vuelosProgramados;
    }

    public List <Vuelo> vuelosOperados(){

        List <Vuelo> vuelosOperados = new ArrayList<Vuelo>();

        for(Vuelo vuelo: vuelos){

            if("Aterrizado".equals(vuelo.getEstado())){

                vuelosOperados.add(vuelo);
            }
        }
        
        return vuelosOperados;
    }

    public List <Vuelo> vuelosCancelados(){

        List <Vuelo> vuelosCancelados = new ArrayList<Vuelo>();

        for(Vuelo vuelo: vuelos){

            if("Cancelado".equals(vuelo.getEstado())){

                vuelosCancelados.add(vuelo);
            }
        }
        
        return vuelosCancelados;
    }

    public Vuelo programarVuelo(String tipoRuta, CategoriaVuelo categoria, Piloto piloto, String terminal, String puertaEmbarque, LocalDateTime fechaDespegue, LocalDateTime fechaAterrizaje, Aeropuerto origen, Aeropuerto destino, Torre torreControl, Torre torreControlDestino, int numPasajeros, Avion avion){
        // se pregunta si la categoria del vuelo no es igual(!) a la del piloto
        if(!categoria.equals(piloto.getTipoCategoriaVuelo())){
            // si no es igual se muestra el mensaje de que no se puede continuar y finaliza la funcion retornando null
            System.out.println("no se puede crer el vuelo porque el piloto no maneja esa categoria");

            return null;
        }

        if(origen.equals(destino)){

            System.out.println("no se puede crear el vuelo porque el origen es el mismo que el destino");

            return null;
        }
        if(fechaAterrizaje.isBefore(fechaDespegue)){

            System.out.println("no se puede crear el vuelo porque la fecha/hora de aterrizaje esta antes a la de despegue");

            return null;
        }

        if(fechaAterrizaje.isEqual(fechaDespegue)){

            System.out.println("no se puede crear el vuelo porque la fecha/hora de aterrizaje es igual a la de despegue");

            return null;
        }

        if(!origen.getTorres().contains(torreControl)){

            System.out.println("no se puede crear el vuelo porque la torre de control no pertenece al aeropuerto de origen");

            return null;
        }

        if(!destino.getTorres().contains(torreControlDestino)){

            System.out.println("no se puede crear el vuelo porque la torre de control de destino no pertenece al aeropuerto de destino");

            return null;
        }
        
        if(numPasajeros < 0){

            System.out.println("no se puede crear el vuelo porqu el numero de pasajeros debe ser igual o mayor a 0");

            return null;
        }

        Vuelo nuevoVuelo = new Vuelo(tipoRuta, this, categoria, piloto, terminal, puertaEmbarque, fechaDespegue, fechaAterrizaje, origen, destino, torreControl, torreControlDestino, numPasajeros, "Programado", avion);

        vuelos.add(nuevoVuelo);

        return nuevoVuelo;

    }

    public List <Vuelo> vuelosPorPiloto(String licencia){

        List <Vuelo> vuelosPorPiloto = new ArrayList<Vuelo>();

        for(Vuelo vuelo: vuelos){

          if(licencia.equals(vuelo.getPiloto().getLicencia())){

            vuelosPorPiloto.add(vuelo);

          }
        }
        
        return vuelosPorPiloto;
    }

}
