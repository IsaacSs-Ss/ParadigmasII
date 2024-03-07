package Metodos;

public class Panel {

    public static void mostrarPanel(javax.swing.JPanel panelAbrir, javax.swing.JPanel panelInicial) {
        if (panelAbrir != panelInicial) {
            panelAbrir.setSize(panelInicial.getSize());
            panelAbrir.setLocation(0, 0);

            panelInicial.removeAll();
            panelInicial.setLayout(new java.awt.BorderLayout());
            panelInicial.add(panelAbrir, java.awt.BorderLayout.CENTER);
            panelInicial.revalidate();
            panelInicial.repaint();
        } else {
            System.out.println("Se intento de agregar el mismo panel al contenedor. Evitando la operación.");
        }
    }
}
