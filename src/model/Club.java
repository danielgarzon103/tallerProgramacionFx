package model;

public class Club {
    private String nombre;
    private Amigo listaAmigos;
    private Afiliacion listaAfiliaciones;

    /**
     * Metodo constructor de club
     * @param nombre
     * @param listaAmigos
     * @param listaAfiliaciones
     */
    public Club(String nombre, Amigo listaAmigos, Afiliacion listaAfiliaciones) {
        this.nombre = nombre;
        this.listaAmigos = listaAmigos;
        this.listaAfiliaciones = listaAfiliaciones;
    }

    /**
     * Getters de los atributos del club
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public Amigo getListaAmigos() {
        return listaAmigos;
    }

    public Afiliacion getListaAfiliaciones() {
        return listaAfiliaciones;
    }
    /**
     * Setters de los atributos del club
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaAmigos(Amigo listaAmigos) {
        this.listaAmigos = listaAmigos;
    }

    public void setListaAfiliaciones(Afiliacion listaAfiliaciones) {
        this.listaAfiliaciones = listaAfiliaciones;
    }

    /**
     * este metodo convierte toda la informacion del club a String
     * @return
     */
    @Override
    public String toString() {
        return "Club{" +
                "nombre='" + nombre + '\'' +
                ", listaAmigos=" + listaAmigos +
                ", listaAfiliaciones=" + listaAfiliaciones +
                '}';
    }
}
