package d12_02_2024;

import static Metodos.Diseño.animarBoton;

public class JFMenu extends javax.swing.JFrame {

    public JFMenu() {
        initComponents();
        animarBoton(btnAltas, "altas", 0, 0);
        animarBoton(btnEliminar, "eliminar", 0, 0);
        animarBoton(btnActualizar, "actualizar", 0, 0);
        animarBoton(btnReporte, "registros", 0, 0);
    }

    private void initComponents() {
        java.net.URL iconURL = getClass().getResource("/imgs/access.png");
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(iconURL);
        setIconImage(icon.getImage());

        super.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        super.setTitle("Menu");
        super.setSize(350, 350);
        super.setLayout(null);

        btnAltas = new javax.swing.JButton("");
        btnAltas.setBounds(40, 10, 120, 120);
        btnAltas.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnAltasActionPerformed(e);
            }
        });

        btnEliminar = new javax.swing.JButton("Eliminar Alumno");
        btnEliminar.setBounds(180, 10, 120, 120);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnEliminarActionPerformed(e);
            }
        });

        btnReporte = new javax.swing.JButton("Reportes");
        btnReporte.setBounds(40, 140, 120, 120);
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnReporteActionPerformed(e);
            }
        });

        btnActualizar = new javax.swing.JButton("Actualizar valores");
        btnActualizar.setBounds(180, 140, 120, 120);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnActualizarActionPerformed(e);
            }
        });

        btnCerrar = new javax.swing.JButton("Cerrar");
        btnCerrar.setBounds(100, 265, 140, 30);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnCerrarActionPerformed(e);
            }
        });

        add(btnAltas);
        add(btnEliminar);
        add(btnActualizar);
        add(btnCerrar);
        add(btnReporte);
    }

    public void btnAltasActionPerformed(java.awt.event.ActionEvent e) {
        JDAltas v = new JDAltas(this, true);
        v.setVisible(true);
    }

    public void btnEliminarActionPerformed(java.awt.event.ActionEvent e) {
        JDEliminar v = new JDEliminar(this, true);
        v.setVisible(rootPaneCheckingEnabled);
    }

    public void btnReporteActionPerformed(java.awt.event.ActionEvent e) {
        JDReportes v = new JDReportes(this, true);
        v.setVisible(true);
    }

    public void btnActualizarActionPerformed(java.awt.event.ActionEvent e) {
        JDActualizar v = new JDActualizar(this, true);
        v.setVisible(true);
    }

    public void btnCerrarActionPerformed(java.awt.event.ActionEvent e) {
        dispose();
    }

    private javax.swing.JButton btnAltas;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCerrar;
}
