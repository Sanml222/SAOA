package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Torre {

    private int numIdentificacion;
    private Ubicacion ubicacion;
    private String correo;
    private String telefono;
    private List <Vuelo> misVuelos;
    

    public Torre(int numIdentificacion1, Ubicacion ubicacion1, String correo1, String telefono1){

        this.misVuelos = new ArrayList <Vuelo>();
        this.numIdentificacion = numIdentificacion1;
        this.ubicacion = ubicacion1;
        this.correo = correo1;
        this.telefono = telefono1;
    }

    public int getNumIdentificacion(){

        return numIdentificacion;
    }

    public void setNumIdentificacion(int numIdentificacion1){

        this.numIdentificacion = numIdentificacion1;
    }

    public Ubicacion getUbicacion(){

        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion1){

        this.ubicacion = ubicacion1;
    }

    public String getCorreo(){

        return correo;
    }

    public void setCorreo(String correo1){

        this.correo = correo1;
    }

    public String getTelefono(){

        return telefono;
    }

    public void setTelefono(String telefono1){

        this.telefono = telefono1;
    }

    public List <Vuelo> getMisVuelos(){

        return misVuelos;
    }

    public void asignarVuelo(Vuelo vuelo){

        misVuelos.add(vuelo);
    }
    
}
