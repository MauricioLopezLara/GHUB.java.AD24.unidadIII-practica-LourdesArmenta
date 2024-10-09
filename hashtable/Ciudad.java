package hashtable;

public class Ciudad {
    private String nombre;
    private int poblacion;
    private String pais;
    private String estado;

    public Ciudad(String nombre, int poblacion, String estado, String pais) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pais = pais;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ciudad [nombre=" + nombre + ", poblacion=" + poblacion + ", estado=" + estado + ", pais=" + pais + "]";
    }
    
    
}
