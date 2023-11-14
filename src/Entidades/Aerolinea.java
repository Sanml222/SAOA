package Entidades;

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
    
    

    
    


}
