package Entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vuelo {

    public final List <String> estados = new ArrayList <String> (Arrays.asList("Programado","En Aire","Aterrizado","Cancelado" ));

    private String tipoRuta;
    private Aerolinea aerolinea;
    private CategoriaVuelo categoria;
    private Piloto piloto;
    private String terminal;
    private String puertaEmbarque;
    private LocalDateTime fechaDespegue;
    private LocalDateTime fechaAterrizaje;
    private Aeropuerto origen;
    private Aeropuerto destino;
    private Torre torreControl;
    private Torre torreControlDestino;
    private int numeroPasajeros;
    private String estado;
    private Avion avion;

    public Vuelo(String tipoRuta1,Aerolinea aerolinea1,CategoriaVuelo categoria1,Piloto piloto1,String terminal1, String puertaEmbarque1, LocalDateTime fechaDespegue1, LocalDateTime fechaAterrizaje1, Aeropuerto origen1, Aeropuerto destino1, Torre torreControl1, Torre torreControlDestino1, int numpasajeros1, String estado1, Avion avion1){

        this.tipoRuta = tipoRuta1;
        this.aerolinea = aerolinea1;
        this.categoria = categoria1;
        this.piloto = piloto1;
        this.terminal = terminal1;
        this.puertaEmbarque = puertaEmbarque1;
        this.fechaDespegue = fechaDespegue1;
        this.fechaAterrizaje = fechaAterrizaje1;
        this.origen = origen1;
        this.destino = destino1;
        this.torreControl = torreControl1;
        this.torreControlDestino = torreControlDestino1;
        this.numeroPasajeros = numpasajeros1;
        this.estado = estado1;
        this.avion = avion1;
    }

    public String getTipoRuta() {
        return tipoRuta;
    }

    public void setTipoRuta(String tipoRuta) {
        this.tipoRuta = tipoRuta;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public CategoriaVuelo getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaVuelo categoria) {
        this.categoria = categoria;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getPuertaEmbarque() {
        return puertaEmbarque;
    }

    public void setPuertaEmbarque(String puertaEmbarque) {
        this.puertaEmbarque = puertaEmbarque;
    }

    public LocalDateTime getFechaDespegue() {
        return fechaDespegue;
    }

    public void setFechaDespegue(LocalDateTime fechaDespegue) {
        this.fechaDespegue = fechaDespegue;
    }

    public LocalDateTime getFechaAterrizaje() {
        return fechaAterrizaje;
    }

    public void setFechaAterrizaje(LocalDateTime fechaAterrizaje) {
        this.fechaAterrizaje = fechaAterrizaje;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public void setOrigen(Aeropuerto origen) {
        this.origen = origen;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public void setDestino(Aeropuerto destino) {
        this.destino = destino;
    }

    public Torre getTorreControl() {
        return torreControl;
    }

    public void setTorreControl(Torre torreControl) {
        this.torreControl = torreControl;
    }

    public Torre getTorreControlDestino() {
        return torreControlDestino;
    }

    public void setTorreControlDestino(Torre torreControldestino1) {
        this.torreControlDestino = torreControldestino1;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    

    
}
