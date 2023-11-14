package Entidades;

public class Piloto {

    private String nombre;
    private String identificacion;
    private String licencia;
    private CategoriaVuelo TipoCategoriaVuelo;

    public Piloto(String nombre1, String identificacion1, String licencia1,CategoriaVuelo TipoCategoriaVuelo1){

        this.nombre = nombre1;
        this.identificacion = identificacion1;
        this.licencia = licencia1;
        this.TipoCategoriaVuelo = TipoCategoriaVuelo1;
    }

    public String getNombre(){

        return nombre;
    }

    public void setNombre(String nombre1){

        this.nombre = nombre1;
    }

    public String getIdentificacion(){

        return identificacion;
    }

    public void setIdentificacion(String identificacion1){

        this.identificacion = identificacion1;
    }

    public String getLicencia(){

        return licencia;
    }

    public void setLicencia(String licencia1){

        this.licencia = licencia1;
    }

    public CategoriaVuelo getTipoCategoriaVuelo(){

        return TipoCategoriaVuelo;
    }

    public void setTipoCategoriaVuelo(CategoriaVuelo TipoCategoriaVuelo1){

        this.TipoCategoriaVuelo = TipoCategoriaVuelo1;
    }


    
}
