package Metodos;

public class Archivos {

    public static void guardar(java.util.ArrayList arrayList, String nombreArchivo) {
        try {
            java.io.FileOutputStream fos = new java.io.FileOutputStream(nombreArchivo);
            java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos);
            oos.writeObject(arrayList);
            oos.close();
        } catch (java.io.FileNotFoundException ex) {
            System.out.println("Archivo no encontrado :(");
            ex.printStackTrace();
        } catch (java.io.IOException ex) {
            System.out.println("Excepción de archivo");
            ex.printStackTrace();
        }

    }

    public static java.util.ArrayList leer(java.util.ArrayList arrayList, String nombreArchivo) {
        try {
            arrayList = new java.util.ArrayList();
            java.io.FileInputStream fis = new java.io.FileInputStream(nombreArchivo);
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
            arrayList = (java.util.ArrayList) ois.readObject();
            ois.close();
            return arrayList;
        } catch (java.io.IOException ex) {
            System.out.println("Error al leer el archivo:  " + ex.toString());
            ex.printStackTrace();
            return null;
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al ancontrar el archivo: ");
            ex.printStackTrace();
            return null;
        }
    }
}
