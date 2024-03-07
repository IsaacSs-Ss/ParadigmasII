package d12_02_2024;

import static Metodos.Archivos.*;
import d28_02_2024.Clases.Alumno;

public class JDAltas extends javax.swing.JDialog {

    private java.util.ArrayList<Alumno> alumnos;

    public JDAltas(javax.swing.JFrame owner, boolean boleano) {
        super(owner, boleano);
        initComponents();
    }

    private void initComponents() {
        java.net.URL iconURL = getClass().getResource("/imgs/altas.png");
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(iconURL);
        setIconImage(icon.getImage());

        super.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        super.setTitle("Altas Alumnos");
        super.setSize(400, 400);
        super.setLayout(null);

        lblMatricula = new javax.swing.JLabel("Matricula");
        lblMatricula.setBounds(50, 30, 80, 20);
        txtMatricula = new javax.swing.JTextField();
        txtMatricula.setBounds(130, 30, 120, 20);
        lblNombre = new javax.swing.JLabel("Nombre");
        lblNombre.setBounds(50, 70, 80, 20);
        txtNombre = new javax.swing.JTextField();
        txtNombre.setBounds(130, 70, 120, 20);
        lblApellidos = new javax.swing.JLabel("Apellidos");
        lblApellidos.setBounds(50, 110, 80, 20);
        txtApellidos = new javax.swing.JTextField();
        txtApellidos.setBounds(130, 110, 120, 20);
        lblEdad = new javax.swing.JLabel("Edad");
        lblEdad.setBounds(50, 150, 80, 20);
        txtEdad = new javax.swing.JTextField();
        txtEdad.setBounds(130, 150, 120, 20);
        lblCarrera = new javax.swing.JLabel("Carrera");
        lblCarrera.setBounds(50, 190, 80, 20);
        txtCarrera = new javax.swing.JTextField();
        txtCarrera.setBounds(130, 190, 120, 20);
        lblSemestre = new javax.swing.JLabel("Semestre");
        lblSemestre.setBounds(50, 230, 80, 20);
        txtSemestre = new javax.swing.JTextField();
        txtSemestre.setBounds(130, 230, 120, 20);

        btnMostrar = new javax.swing.JButton("Mostrar regitros");
        btnMostrar.setBounds(75, 310, 150, 30);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnMostrarActionPerformed(e);

            }
        });

        btnGuardar = new javax.swing.JButton("Guardar");
        btnGuardar.setBounds(50, 270, 100, 30);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnGuardarActionPerformed(e);
            }
        });

        btnCerrar = new javax.swing.JButton("Cerrar");
        btnCerrar.setBounds(160, 270, 100, 30);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnCerrarActionPerformed(e);
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
        add(btnGuardar);
        add(btnCerrar);
        add(btnMostrar);
    }

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent e) {
        dispose();
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent e) {
        try {
            this.alumnos = (java.util.ArrayList<Alumno>) leer(alumnos, "alumnos2.dat");
            int matricula = Integer.parseInt(txtMatricula.getText());
            String nombre = txtNombre.getText();
            String apellidos = txtApellidos.getText();
            byte edad = Byte.parseByte(txtEdad.getText());
            //Carreras carrera = txtCarrera.getText();
            byte semestre = Byte.parseByte(txtSemestre.getText());

            /*Alumno registro = new Alumno(matricula, nombre, apellidos, edad, carrera, semestre);
            alumnos.add(registro);

            guardar(alumnos, "alumnos2.dat");
            this.dispose();
            javax.swing.JOptionPane.showMessageDialog(this, "El alumno " + registro.getNombre() + " se ha agregado correctamente :)");
*/
        } catch (NumberFormatException e1) {
            javax.swing.JOptionPane.showMessageDialog(JDAltas.this, "Error: La matrícula, edad o semestre no es un número válido.");
        }
    }

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent e) {
        JDReportes v = new JDReportes(this, true);
        v.setVisible(true);
        this.dispose();
    }

    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnGuardar;
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
