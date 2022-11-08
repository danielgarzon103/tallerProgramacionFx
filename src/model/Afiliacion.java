package model;

public class Afiliacion {
    private String codigo;
    private String fecha;
    private String hora;
    private Amigo listaAmigos;

    /**
     * Metodo constructor de afiliacion
     * @param codigo
     * @param fecha
     * @param hora
     * @param listaAmigos
     */
    public Afiliacion(String codigo, String fecha, String hora, Amigo listaAmigos) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.listaAmigos = listaAmigos;
    }

    /**
     * Getters de los atributos de afiliacion
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Amigo getListaAmigos() {
        return listaAmigos;
    }

    /**
     * Setters de los atributos de afiliacion
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setListaAmigos(Amigo listaAmigos) {
        this.listaAmigos = listaAmigos;
    }
    /**
     * este metodo convierte toda la informacion de Afiliacion a String
     * @return
     */
    @Override
    public String toString() {
        return "Afiliacion{" +
                "codigo='" + codigo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", listaAmigos=" + listaAmigos +
                '}';
    }
}
