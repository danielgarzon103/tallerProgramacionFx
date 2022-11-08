package model;

public class Amigo {
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private Afiliacion listaAfiliacion;

    /**
     * Metodo constructo de amigo
     * @param nombre
     * @param apellido
     * @param cedula
     * @param direccion
     * @param listaAfiliacion
     */
    public Amigo(String nombre, String apellido, String cedula, String direccion, Afiliacion listaAfiliacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.listaAfiliacion = listaAfiliacion;
    }

    /**
     * Getters de los atributos de amigo
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public Afiliacion getListaAfiliacion() {
        return listaAfiliacion;
    }

    /**
     * Setters de los atributos de amigo
     * @return
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setListaAfiliacion(Afiliacion listaAfiliacion) {
        this.listaAfiliacion = listaAfiliacion;
    }
    /**
     * este metodo convierte toda la informacion de Amigo a String
     * @return
     */
    @Override
    public String toString() {
        return "Amigo{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", direccion='" + direccion + '\'' +
                ", listaAfiliacion=" + listaAfiliacion +
                '}';
    }
}
