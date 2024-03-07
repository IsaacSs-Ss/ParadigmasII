package d26_02_2024;

public class MultiplicaciónConParalelismo extends Thread {

    public static int resultado;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
        {
            try
            {
                resultado += i * i;
                System.out.println("Multiplicación: " + i + " * " + i + " = " + resultado);
                Thread.sleep(2000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MultiplicaciónConParalelismo hilo1 = new MultiplicaciónConParalelismo();
        SumaConParalelismo hilo2 = new SumaConParalelismo();

        hilo1.start();
        hilo2.start();

        for (int i = 0; i < 10; i++)
        {
            try
            {
                int nuevo = (MultiplicaciónConParalelismo.resultado) - (SumaConParalelismo.resultado);
                System.out.println("La resta de las sumas de los resultado de los hilos es: " + MultiplicaciónConParalelismo.resultado + " - " + SumaConParalelismo.resultado + " = " + nuevo);
                sleep(2001);
            } catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }
        }

    }

}
