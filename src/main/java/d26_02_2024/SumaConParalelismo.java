package d26_02_2024;

public class SumaConParalelismo extends Thread {

    public static int resultado;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
        {
            try
            {
                resultado = i + i;
                System.out.println("Multiplicación: " + i + " + " + i + " = " + resultado);
                Thread.sleep(2000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

}
