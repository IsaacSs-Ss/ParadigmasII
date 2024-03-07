package d28_02_2024.Clases;

public class Materia implements java.io.Serializable{

    private int id;
    private String nombre;
    private int creditos;

    public Materia() {
    }

    public Materia(int id, String nombre, int creditos) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
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

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-15s %-7d", id, nombre, creditos);
    }

}
