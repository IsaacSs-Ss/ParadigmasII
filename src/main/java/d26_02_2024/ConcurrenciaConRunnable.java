package d26_02_2024;

public class ConcurrenciaConRunnable implements Runnable {

    @Override
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
        ConcurrenciaConRunnable run1 = new ConcurrenciaConRunnable();
        ConcurrenciaConRunnable run2 = new ConcurrenciaConRunnable();

        Thread hilo1 = new Thread(run1);
        Thread hilo2 = new Thread(run2);

        hilo1.start();
        hilo2.start();
    }
}
