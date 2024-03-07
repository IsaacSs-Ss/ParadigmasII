package Metodos;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Diseño {

    public static void animarBoton(JButton boton, String nombreImagen, int alto, int ancho) {
        try {
            boton.setIcon(setImagenBoton("/imgs/" + nombreImagen + ".png", boton));
            boton.setPressedIcon(setAnimacionPresionado("/imgs/" + nombreImagen + ".png", boton, alto, ancho));
        } catch (Exception e) {
            try {
                boton.setIcon(setImagenBoton("/imgs/" + nombreImagen + ".jpg", boton));
                boton.setPressedIcon(setAnimacionPresionado("/imgs/" + nombreImagen + ".jpg", boton, alto, ancho));
            } catch (Exception ex) {
                System.err.println("No se pudo cargar la imagen en ninguna de las extensiones especificadas.");
            }
        }
    }

    public static Icon setImagenBoton(String url, JButton boton) {
        try {
            ImageIcon icon = new ImageIcon(Diseño.class.getResource(url));
            int width = boton.getWidth();
            int height = boton.getHeight();
            ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
            return icono;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Icon setAnimacionPresionado(String url, JButton boton, int alto, int ancho) {
        try {
            ImageIcon icon = new ImageIcon(Diseño.class.getResource(url));
            int width = boton.getWidth() - ancho;
            int height = boton.getHeight() - alto;
            ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
            return icono;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
