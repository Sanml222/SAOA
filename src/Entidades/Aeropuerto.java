package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {

    private String nombre;
    private Ubicacion ubicacion;
    private List <Aerolinea> aerolineas;
    private List <Torre> torres;

    public Aeropuerto(String nombre1, Ubicacion ubicacion1){

        this.nombre = nombre1;
        this.ubicacion = ubicacion1;
        this.aerolineas = new ArrayList<Aerolinea>();
        this.torres = new ArrayList<Torre>();
    }

    public String getNombre(){

        return nombre;
       }
       public void setNombre(String nombre1){
   
           this.nombre = nombre1;
       }

       public Ubicacion getUbicacion(){

        return ubicacion;
       }
       public void setUbicacion(Ubicacion ubicacion1){
   
           this.ubicacion = ubicacion1;
       }
   
       public List<Aerolinea> getAerolineas(){
   
        return aerolineas;
       }
       public void agregarAerolinea(Aerolinea nuevaAerolinea){
           // a la lista de aerolineas le agregamos una nueva aerolinea
           this.aerolineas.add(nuevaAerolinea);
       }

       public List<Torre> getTorres(){
   
        return torres;
       }
       public void agregarTorre(Torre nuevaTorre){
           // a la lista de torres le agregamos una nueva torre
           this.torres.add(nuevaTorre);
       }

       public Torre buscarTorreDisponible(){

        if(this.torres.size() == 0){

            return null;
        }
        else{

            return this.torres.get(0);
        }
       }  
}
