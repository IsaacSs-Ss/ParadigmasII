package d12_02_2024;

import static Metodos.Archivos.*;
import d28_02_2024.Clases.Alumno;

public class JDEliminar extends javax.swing.JDialog {

    private java.util.ArrayList<Alumno> alumnos;
    protected static int iterador = 0;

    public JDEliminar(javax.swing.JDialog owner, boolean boleano) {
        super(owner, boleano);
        this.alumnos = (java.util.ArrayList<Alumno>) leer(alumnos, "alumnos2.dat");
        initComponents();
        llenarCampos(iterador);
    }

    public JDEliminar(javax.swing.JFrame owner, boolean boleano) {
        super(owner, boleano);
        initComponents();
        this.alumnos = (java.util.ArrayList<Alumno>) leer(alumnos, "alumnos2.dat");
        llenarCampos(iterador);
    }

    protected void initComponents() {
        java.net.URL iconURL = getClass().getResource("/imgs/eliminar.png");
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
        txtNombre.setEnabled(false);
        lblApellidos = new javax.swing.JLabel("Apellidos");
        lblApellidos.setBounds(30, 110, 80, 20);
        txtApellidos = new javax.swing.JTextField();
        txtApellidos.setBounds(130, 110, 120, 20);
        txtApellidos.setEnabled(false);
        lblEdad = new javax.swing.JLabel("Edad");
        lblEdad.setBounds(30, 150, 80, 20);
        txtEdad = new javax.swing.JTextField();
        txtEdad.setBounds(130, 150, 120, 20);
        txtEdad.setEnabled(false);
        lblCarrera = new javax.swing.JLabel("Carrera");
        lblCarrera.setBounds(30, 190, 80, 20);
        txtCarrera = new javax.swing.JTextField();
        txtCarrera.setBounds(130, 190, 120, 20);
        txtCarrera.setEnabled(false);
        lblSemestre = new javax.swing.JLabel("Semestre");
        lblSemestre.setBounds(30, 230, 80, 20);
        txtSemestre = new javax.swing.JTextField();
        txtSemestre.setBounds(130, 230, 120, 20);
        txtSemestre.setEnabled(false);

        btnEliminar = new javax.swing.JButton("Eliminar");
        btnEliminar.setBounds(100, 270, 100, 20);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnEliminarActionPerformed(e);
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
        add(btnEliminar);
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent e) {
        llenarCampos(cargarMatricula());
        int opcion = javax.swing.JOptionPane.showConfirmDialog(this,
                "¿Está seguro que desea eliminar a " + cargarAlumno(cargarMatricula()).getNombre() + " " + cargarAlumno(cargarMatricula()).getApellidos() + "?",
                "Confirmar Eliminación",
                javax.swing.JOptionPane.YES_NO_OPTION);
        if (opcion == javax.swing.JOptionPane.YES_OPTION) {
            Alumno a = cargarAlumno(cargarMatricula());
            alumnos.remove(a);
            guardar(alumnos, "alumnos2.dat");
            this.dispose();
            javax.swing.JOptionPane.showMessageDialog(this, "El alumno " + a.getNombre() + " se ha eliminado exitósamente :)");
        }

    }

    private void txtMatriculaKeyPressed(java.awt.event.KeyEvent e) {
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
        for (Alumno alumno : alumnos) {
            if (alumno.getMatricula() == Integer.parseInt(txtMatricula.getText())) {
                txtMatricula.setText(String.valueOf(alumno.getMatricula()));
                txtNombre.setText(alumno.getNombre());
                txtApellidos.setText(alumno.getApellidos());
                txtEdad.setText(String.valueOf(alumno.getEdad()));
                txtCarrera.setText(alumno.getCarrera().getNombre());
                txtSemestre.setText(String.valueOf(alumno.getSemestre()));
                return alumnos.indexOf(alumno);
            } else {
                System.out.println("Ningun registro encontrado");
            }
        }
        iterador = 0;
        return 0;
    }

    private javax.swing.JButton btnEliminar;
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
