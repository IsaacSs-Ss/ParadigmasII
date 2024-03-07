package d28_02_2024.Clases;

public class Grupo implements java.io.Serializable{

    private int id;
    private String nombre;
    private Profesor profesor;
    private Alumno alumnos[];

    public Grupo() {
    }

    public Grupo(int id, String nombre, Profesor profesor, Alumno alumnos[]) {
        this.id = id;
        this.nombre = nombre;
        this.profesor = profesor;
        this.alumnos = alumnos;
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

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public String obtenerNombresAlumnos() {
        StringBuilder nombres = new StringBuilder();

        for (Alumno alumno : alumnos) {
            nombres.append(alumno.getNombre()).append(", ");
        }
        if (nombres.length() > 0) {
            nombres.delete(nombres.length() - 2, nombres.length());
        }

        return nombres.toString();
    }

    @Override
    public String toString() {
        return String.format("%-10d %-15s %-20s %-100s",
                id, nombre, profesor.getNombre(), obtenerNombresAlumnos());
    }

}
