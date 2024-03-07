package d12_02_2024;

import java.awt.event.KeyEvent;
import static Metodos.Archivos.*;
import d28_02_2024.Clases.Alumno;

public class JDActualizar extends javax.swing.JDialog {

    private java.util.ArrayList<Alumno> alumnos;
    protected static int iterador = 0;

    public JDActualizar(javax.swing.JFrame owner, boolean boleano) {
        super(owner, boleano);
        initComponents();
        alumnos = (java.util.ArrayList<Alumno>) leer(alumnos, "alumnos2.dat");
        llenarCampos(iterador);
    }

    protected void initComponents() {
        java.net.URL iconURL = getClass().getResource("/imgs/actualizar.png");
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(iconURL);
        setIconImage(icon.getImage());

        super.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        super.setTitle("Altas Alumnos");
        super.setSize(400, 350);
        super.setLayout(null);

        lblMatricula = new javax.swing.JLabel("Matricula");
        lblMatricula.setBounds(30, 30, 80, 20);
        txtMatricula = new javax.swing.JTextField();
        txtMatricula.setBounds(130, 30, 120, 20);
        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                txtMatriculaKeyPressed(e);
            }
        });
        lblNombre = new javax.swing.JLabel("Nombre");
        lblNombre.setBounds(30, 70, 80, 20);
        txtNombre = new javax.swing.JTextField();
        txtNombre.setBounds(130, 70, 120, 20);
        lblApellidos = new javax.swing.JLabel("Apellidos");
        lblApellidos.setBounds(30, 110, 80, 20);
        txtApellidos = new javax.swing.JTextField();
        txtApellidos.setBounds(130, 110, 120, 20);
        lblEdad = new javax.swing.JLabel("Edad");
        lblEdad.setBounds(30, 150, 80, 20);
        txtEdad = new javax.swing.JTextField();
        txtEdad.setBounds(130, 150, 120, 20);
        lblCarrera = new javax.swing.JLabel("Carrera");
        lblCarrera.setBounds(30, 190, 80, 20);
        txtCarrera = new javax.swing.JTextField();
        txtCarrera.setBounds(130, 190, 120, 20);
        lblSemestre = new javax.swing.JLabel("Semestre");
        lblSemestre.setBounds(30, 230, 80, 20);
        txtSemestre = new javax.swing.JTextField();
        txtSemestre.setBounds(130, 230, 120, 20);

        btnActualizar = new javax.swing.JButton("Guardar cambios");
        btnActualizar.setBounds(100, 270, 150, 20);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnActualizarActionPerformed(e);
            }
        });

        add(lblMatricula);
        add(txtMatricula);
        add(lblNombre);
        add(txtNombre);
        add(lblApellidos);
        add(txtApellidos);
        add(lblEdad);
        add(txtEdad);
        add(lblCarrera);
        add(txtCarrera);
        add(lblSemestre);
        add(txtSemestre);
        add(btnActualizar);
    }

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int matricula = Integer.parseInt(txtMatricula.getText());
            String nombre = txtNombre.getText();
            String apellidos = txtApellidos.getText();
            byte edad = Byte.parseByte(txtEdad.getText());
            String carrera = txtCarrera.getText();
            byte semestre = Byte.parseByte(txtSemestre.getText());

            if (cargarMatricula() != -1) {
                Alumno alumnoExistente = alumnos.get(cargarMatricula());
                alumnoExistente.setMatricula(matricula);
                alumnoExistente.setNombre(nombre);
                alumnoExistente.setApellidos(apellidos);
                alumnoExistente.setEdad(edad);
                //alumnoExistente.setCarrera(carrera);
                alumnoExistente.setSemestre(semestre);

                System.out.println("Datos actualizados del alumno: " + alumnoExistente);

                guardar(alumnos, "alumnos2.dat");

                this.dispose();
            } else {
                System.err.println("No se encontró al alumno con matrícula " + txtMatricula.getText());
            }
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir los datos: " + e.getMessage());
        }
    }

    private void txtMatriculaKeyPressed(KeyEvent e) {
        if (e.getExtendedKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            cargarMatricula();
            if (cargarMatricula() == 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se ha encontrado ningún registro con la matricula: " + txtMatricula.getText());
            }
        }
    }

    public Alumno cargarAlumno(int i) {
        Alumno a = this.alumnos.get(i);
        return a;
    }

    public void llenarCampos(int iterador) {
        Alumno a = cargarAlumno(iterador);
        txtMatricula.setText(String.valueOf(a.getMatricula()));
        txtNombre.setText(a.getNombre());
        txtApellidos.setText(a.getApellidos());
        txtEdad.setText(String.valueOf(a.getEdad()));
        txtCarrera.setText(a.getCarrera().getNombre());
        txtSemestre.setText(String.valueOf(a.getSemestre()));
    }

    public int cargarMatricula() {
        try {
            int matriculaBuscada = Integer.parseInt(txtMatricula.getText());

            for (int i = 0; i < alumnos.size(); i++) {
                Alumno alumno = alumnos.get(i);
                if (alumno.getMatricula() == matriculaBuscada) {
                    txtMatricula.setText(String.valueOf(alumno.getMatricula()));
                    txtNombre.setText(alumno.getNombre());
                    txtApellidos.setText(alumno.getApellidos());
                    txtEdad.setText(String.valueOf(alumno.getEdad()));
                    txtCarrera.setText(alumno.getCarrera().getNombre());
                    txtSemestre.setText(String.valueOf(alumno.getSemestre()));
                    return i;
                }
            }

            System.out.println("No se encontró ningún alumno con matrícula " + matriculaBuscada);
            this.iterador = 0;
            llenarCampos(this.iterador);
            return -1;

        } catch (NumberFormatException e) {
            System.err.println("Error al convertir la matrícula a un número: " + e.getMessage());
            return -1;
        }
    }

    private javax.swing.JButton btnActualizar;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtSemestre;

}
