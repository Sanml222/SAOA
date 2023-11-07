package Entidades;

public class Ubicacion {
    
    private String longitud;
    private String latitud;
    private String ciudad;
    private String direccion;

    public Ubicacion(String longitud1, String latitud1, String ciudad1, String direccion1 ){

        this.longitud = longitud1;
        this.latitud = latitud1;
        this.ciudad = ciudad1;
        this.direccion = direccion1;
    }

    public String getLongitud(){

        return longitud;
    }

    public void setLongitud(String longitud1){

        this.longitud = longitud1;
    }
        public String getLatitud(){

        return latitud;
    }

    public void setLatitud(String latitud1){

        this.latitud = latitud1;
    }
    
    public String getCiudad(){

        return ciudad;
    }

    public void setCiudad(String ciudad1){

        this.ciudad = ciudad1;
    }

    public String getDireccion(){

        return direccion;
    }

    public void setDireccion(String direccion1){

        this.direccion = direccion1;
    }




 }
