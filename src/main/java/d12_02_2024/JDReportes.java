package d12_02_2024;

import static Metodos.Archivos.*;
import d28_02_2024.Clases.Alumno;

public class JDReportes extends javax.swing.JDialog {

    private java.util.ArrayList<Alumno> alumnos;
    protected static int iterador = 0;

    public JDReportes(javax.swing.JDialog owner, boolean boleano) {
        super(owner, boleano);
        initComponents();
        alumnos = (java.util.ArrayList<Alumno>) leer(alumnos, "alumnos2.dat");
        llenarCampos();
    }

    public JDReportes(javax.swing.JFrame owner, boolean boleano) {
        super(owner, boleano);
        initComponents();
        alumnos = (java.util.ArrayList<Alumno>) leer(alumnos, "alumnos2.dat");
        llenarCampos();
    }

    protected void initComponents() {
        java.net.URL iconURL = getClass().getResource("/imgs/registros.jpg");
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
        txtMatricula.setEnabled(false);
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

        btn1ro = new javax.swing.JButton("1ro");
        btn1ro.setBounds(15, 270, 70, 20);
        btn1ro.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btn1roActionPerformed(e);
            }
        });

        btnAnterior = new javax.swing.JButton("<--");
        btnAnterior.setBounds(100, 270, 70, 20);
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnAnteriorActionPerformed(e);
            }
        });

        btnSiguiente = new javax.swing.JButton("-->");
        btnSiguiente.setBounds(185, 270, 70, 20);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnSiguienteActionPerformed(e);
            }
        });

        btnUltimo = new javax.swing.JButton("Últm.");
        btnUltimo.setBounds(270, 270, 70, 20);
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnUltimoActionPerformed(e);
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
        add(btnAnterior);
        add(btnSiguiente);
        add(btn1ro);
        add(btnUltimo);
    }

    private void btn1roActionPerformed(java.awt.event.ActionEvent e) {
        if (iterador >= 0) {
            iterador = 0;
            llenarCampos();
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Haz llegado al primer registro");
        }
    }

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent e) {
        if (iterador > 0) {
            iterador--;
            llenarCampos();
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Haz llegado al último registro");
        }
    }

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent e) {
        if (iterador < alumnos.size() - 1) {
            iterador++;
            llenarCampos();
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Haz llegado al último registro");
        }
    }

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent e) {
        if (iterador < alumnos.size()) {
            iterador = alumnos.size() - 1;
            llenarCampos();
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Haz llegado al último registro");
        }
    }

    public Alumno cargarAlumno(int i) {
        Alumno a = this.alumnos.get(i);
        return a;
    }

    public void llenarCampos() {
        Alumno a = cargarAlumno(iterador);
        txtMatricula.setText(String.valueOf(a.getMatricula()));
        txtNombre.setText(a.getNombre());
        txtApellidos.setText(a.getApellidos());
        txtEdad.setText(String.valueOf(a.getEdad()));
        txtCarrera.setText(a.getCarrera().getNombre());
        txtSemestre.setText(String.valueOf(a.getSemestre()));
    }

    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btn1ro;
    private javax.swing.JButton btnUltimo;
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
