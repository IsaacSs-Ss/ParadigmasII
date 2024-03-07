package d28_02_2024.Clases.JFrame;

import static Metodos.Panel.*;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mArchivos = new javax.swing.JMenu();
        mnSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnAltaAlum = new javax.swing.JMenu();
        mnAltaAlumno = new javax.swing.JMenuItem();
        mnBajaAlumno = new javax.swing.JMenuItem();
        mnReporteAlum = new javax.swing.JMenuItem();
        mnActualizarAlumn = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnAltaProfe = new javax.swing.JMenuItem();
        mnBajaProf = new javax.swing.JMenuItem();
        mnReporteProf = new javax.swing.JMenuItem();
        mnActualizarProf = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnAltaMateria = new javax.swing.JMenuItem();
        mnBajaMateria = new javax.swing.JMenuItem();
        mnReporteMateria = new javax.swing.JMenuItem();
        mnActualizarMateria = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mnAltaCarrera = new javax.swing.JMenuItem();
        mnBajaCarrera = new javax.swing.JMenuItem();
        mnReporteCarrera = new javax.swing.JMenuItem();
        mnActualizarCarrera = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnAltaGrupo = new javax.swing.JMenuItem();
        mnBajaGrupo = new javax.swing.JMenuItem();
        mnReporteGrupo = new javax.swing.JMenuItem();
        mnActualizarGrupo = new javax.swing.JMenuItem();
        mnAñadirAlGrupo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        mArchivos.setText("Archivos");

        mnSalir.setText("Salir");
        mnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSalirActionPerformed(evt);
            }
        });
        mArchivos.add(mnSalir);

        jMenuBar1.add(mArchivos);

        jMenu2.setText("Catálogo");

        mnAltaAlum.setText("Alumno");

        mnAltaAlumno.setText("Alta");
        mnAltaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAltaAlumnoActionPerformed(evt);
            }
        });
        mnAltaAlum.add(mnAltaAlumno);

        mnBajaAlumno.setText("Baja");
        mnBajaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBajaAlumnoActionPerformed(evt);
            }
        });
        mnAltaAlum.add(mnBajaAlumno);

        mnReporteAlum.setText("Reporte");
        mnReporteAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnReporteAlumActionPerformed(evt);
            }
        });
        mnAltaAlum.add(mnReporteAlum);

        mnActualizarAlumn.setText("Actualizar");
        mnActualizarAlumn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnActualizarAlumnActionPerformed(evt);
            }
        });
        mnAltaAlum.add(mnActualizarAlumn);

        jMenu2.add(mnAltaAlum);

        jMenu4.setText("Profesor");

        mnAltaProfe.setText("Alta");
        mnAltaProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAltaProfeActionPerformed(evt);
            }
        });
        jMenu4.add(mnAltaProfe);

        mnBajaProf.setText("Baja");
        mnBajaProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBajaProfActionPerformed(evt);
            }
        });
        jMenu4.add(mnBajaProf);

        mnReporteProf.setText("Reporte");
        mnReporteProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnReporteProfActionPerformed(evt);
            }
        });
        jMenu4.add(mnReporteProf);

        mnActualizarProf.setText("Actualizar");
        jMenu4.add(mnActualizarProf);

        jMenu2.add(jMenu4);

        jMenu5.setText("Materia");

        mnAltaMateria.setText("Alta");
        mnAltaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAltaMateriaActionPerformed(evt);
            }
        });
        jMenu5.add(mnAltaMateria);

        mnBajaMateria.setText("Baja");
        mnBajaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBajaMateriaActionPerformed(evt);
            }
        });
        jMenu5.add(mnBajaMateria);

        mnReporteMateria.setText("Reporte");
        mnReporteMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnReporteMateriaActionPerformed(evt);
            }
        });
        jMenu5.add(mnReporteMateria);

        mnActualizarMateria.setText("Actualizar");
        jMenu5.add(mnActualizarMateria);

        jMenu2.add(jMenu5);

        jMenu6.setText("Carrera");

        mnAltaCarrera.setText("Alta");
        mnAltaCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAltaCarreraActionPerformed(evt);
            }
        });
        jMenu6.add(mnAltaCarrera);

        mnBajaCarrera.setText("Baja");
        mnBajaCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBajaCarreraActionPerformed(evt);
            }
        });
        jMenu6.add(mnBajaCarrera);

        mnReporteCarrera.setText("Reporte");
        mnReporteCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnReporteCarreraActionPerformed(evt);
            }
        });
        jMenu6.add(mnReporteCarrera);

        mnActualizarCarrera.setText("Actualizar");
        jMenu6.add(mnActualizarCarrera);

        jMenu2.add(jMenu6);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Grupos");

        mnAltaGrupo.setText("Alta");
        mnAltaGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAltaGrupoActionPerformed(evt);
            }
        });
        jMenu1.add(mnAltaGrupo);

        mnBajaGrupo.setText("Baja");
        mnBajaGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBajaGrupoActionPerformed(evt);
            }
        });
        jMenu1.add(mnBajaGrupo);

        mnReporteGrupo.setText("Reporte");
        jMenu1.add(mnReporteGrupo);

        mnActualizarGrupo.setText("Actualizar");
        jMenu1.add(mnActualizarGrupo);

        mnAñadirAlGrupo.setText("Añadir al grupo");
        jMenu1.add(mnAñadirAlGrupo);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnAltaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAltaAlumnoActionPerformed
        d26_02_2024.paneles.pAltaAlumno pa = new d26_02_2024.paneles.pAltaAlumno();
        mostrarPanel(pa, contenedor);
    }//GEN-LAST:event_mnAltaAlumnoActionPerformed

    private void mnBajaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBajaAlumnoActionPerformed
        d26_02_2024.paneles.pBajaAlumno pb = new d26_02_2024.paneles.pBajaAlumno();
        mostrarPanel(pb, contenedor);
    }//GEN-LAST:event_mnBajaAlumnoActionPerformed

    private void mnActualizarAlumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnActualizarAlumnActionPerformed
        d26_02_2024.paneles.pActualizarAlumno pa = new d26_02_2024.paneles.pActualizarAlumno();
        mostrarPanel(pa, contenedor);
    }//GEN-LAST:event_mnActualizarAlumnActionPerformed

    private void mnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnSalirActionPerformed

    private void mnReporteCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnReporteCarreraActionPerformed
        d26_02_2024.paneles.pReporteCarrera pr = new d26_02_2024.paneles.pReporteCarrera();
        mostrarPanel(pr, contenedor);
    }//GEN-LAST:event_mnReporteCarreraActionPerformed

    private void mnAltaProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAltaProfeActionPerformed
        d26_02_2024.paneles.pAltaProfesor pa = new d26_02_2024.paneles.pAltaProfesor();
        mostrarPanel(pa, contenedor);
    }//GEN-LAST:event_mnAltaProfeActionPerformed

    private void mnAltaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAltaMateriaActionPerformed
        d26_02_2024.paneles.pAltaMateria pa = new d26_02_2024.paneles.pAltaMateria();
        mostrarPanel(pa, contenedor);
    }//GEN-LAST:event_mnAltaMateriaActionPerformed

    private void mnAltaCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAltaCarreraActionPerformed
        d26_02_2024.paneles.pAltaCarrera pa = new d26_02_2024.paneles.pAltaCarrera();
        mostrarPanel(pa, contenedor);
    }//GEN-LAST:event_mnAltaCarreraActionPerformed

    private void mnBajaProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBajaProfActionPerformed
        d26_02_2024.paneles.pBajaProfesor pb = new d26_02_2024.paneles.pBajaProfesor();
        mostrarPanel(pb, contenedor);
    }//GEN-LAST:event_mnBajaProfActionPerformed

    private void mnBajaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBajaMateriaActionPerformed
        d26_02_2024.paneles.pBajaMateria pb = new d26_02_2024.paneles.pBajaMateria();
        mostrarPanel(pb, contenedor);
    }//GEN-LAST:event_mnBajaMateriaActionPerformed

    private void mnBajaCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBajaCarreraActionPerformed
        d26_02_2024.paneles.pBajaCarrera pb = new d26_02_2024.paneles.pBajaCarrera();
        mostrarPanel(pb, contenedor);
    }//GEN-LAST:event_mnBajaCarreraActionPerformed

    private void mnAltaGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAltaGrupoActionPerformed
        d26_02_2024.paneles.pAltaGrupo pa = new d26_02_2024.paneles.pAltaGrupo();
        mostrarPanel(pa, contenedor);
    }//GEN-LAST:event_mnAltaGrupoActionPerformed

    private void mnBajaGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBajaGrupoActionPerformed
        d26_02_2024.paneles.pBajaGrupo pb = new d26_02_2024.paneles.pBajaGrupo();
        mostrarPanel(pb, contenedor);
    }//GEN-LAST:event_mnBajaGrupoActionPerformed

    private void mnReporteAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnReporteAlumActionPerformed
        d26_02_2024.paneles.pReporteAlumnos pr = new d26_02_2024.paneles.pReporteAlumnos();
        mostrarPanel(pr, contenedor);
    }//GEN-LAST:event_mnReporteAlumActionPerformed

    private void mnReporteProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnReporteProfActionPerformed
        d26_02_2024.paneles.pReporteProfesor pr = new d26_02_2024.paneles.pReporteProfesor();
        mostrarPanel(pr, contenedor);
    }//GEN-LAST:event_mnReporteProfActionPerformed

    private void mnReporteMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnReporteMateriaActionPerformed
        d26_02_2024.paneles.pReporteMateria pr = new d26_02_2024.paneles.pReporteMateria();
        mostrarPanel(pr, contenedor);
    }//GEN-LAST:event_mnReporteMateriaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    public static javax.swing.JPanel getContenedor(){
        return contenedor;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JPanel contenedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mArchivos;
    private javax.swing.JMenuItem mnActualizarAlumn;
    private javax.swing.JMenuItem mnActualizarCarrera;
    private javax.swing.JMenuItem mnActualizarGrupo;
    private javax.swing.JMenuItem mnActualizarMateria;
    private javax.swing.JMenuItem mnActualizarProf;
    private javax.swing.JMenu mnAltaAlum;
    private javax.swing.JMenuItem mnAltaAlumno;
    private javax.swing.JMenuItem mnAltaCarrera;
    private javax.swing.JMenuItem mnAltaGrupo;
    private javax.swing.JMenuItem mnAltaMateria;
    private javax.swing.JMenuItem mnAltaProfe;
    private javax.swing.JMenuItem mnAñadirAlGrupo;
    private javax.swing.JMenuItem mnBajaAlumno;
    private javax.swing.JMenuItem mnBajaCarrera;
    private javax.swing.JMenuItem mnBajaGrupo;
    private javax.swing.JMenuItem mnBajaMateria;
    private javax.swing.JMenuItem mnBajaProf;
    private javax.swing.JMenuItem mnReporteAlum;
    private javax.swing.JMenuItem mnReporteCarrera;
    private javax.swing.JMenuItem mnReporteGrupo;
    private javax.swing.JMenuItem mnReporteMateria;
    private javax.swing.JMenuItem mnReporteProf;
    private javax.swing.JMenuItem mnSalir;
    // End of variables declaration//GEN-END:variables
}
