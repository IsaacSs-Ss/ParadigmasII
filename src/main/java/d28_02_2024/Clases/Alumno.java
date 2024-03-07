package d28_02_2024.Clases;

public class Alumno implements java.io.Serializable {

    private int matricula;
    private String nombre;
    private String apellidos;
    private byte edad;
    private Carreras carrera;
    private byte semestre;

    public Alumno() {
    }

    public Alumno(int matricula, String nombre, String apellidos, byte edad, Carreras carrera, byte semestre) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public Carreras getCarrera() {
        return carrera;
    }

    public void setCarrera(Carreras carrera) {
        this.carrera = carrera;
    }

    public byte getSemestre() {
        return semestre;
    }

    public void setSemestre(byte semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-15s %-20s %-5d %-20s %-12d",
                matricula, nombre, apellidos, edad, carrera.getNombre(), semestre);
    }
}
