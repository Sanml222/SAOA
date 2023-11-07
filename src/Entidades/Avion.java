package Entidades;

public class Avion {

    private int capacidad;
    private String marca;
    private String referencia;

    public Avion(int capacidad1, String marca1, String referencia1){

        this.capacidad = capacidad1;
        this.marca = marca1;
        this.referencia = referencia1;
    }

    public int getCapacidad(){

        return capacidad;
    }

    public void setCapacidad(int capacidad1){

        this.capacidad = capacidad1;
    }

    public String getMarca(){

        return marca;
    }

    public void setMarca(String marca1){

        this.marca = marca1;
    }

    public String getReferencia(){

        return referencia;
    }

    public void setReferencia(String referencia1){

        this.referencia = referencia1;
    }
}
