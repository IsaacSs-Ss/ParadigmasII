package d26_02_2024;

public class ConcurrenciaConThread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Hilo " + Thread.currentThread().getId() + ": " + i);
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                System.out.println("El hilo se ha interrumpido");
            }
        }
    }

    public static void main(String[] args) {
        ConcurrenciaConThread hilo1 = new ConcurrenciaConThread();
        ConcurrenciaConThread hilo2 = new ConcurrenciaConThread();

        hilo1.start();
        hilo2.start();
    }
}
