package d28_02_2024.Clases;

public class Carreras implements java.io.Serializable{
    private int id;
    private String nombre;
    private int duracion;

    public Carreras() {
    }

    public Carreras(int id, String nombre, int duracion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-15s %-5d", id, nombre, duracion);
    }

}
