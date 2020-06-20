package lab7_miguelrojas;

import javax.swing.JProgressBar;

public class Hilo_Crear extends Thread {

    private JProgressBar barra;
    private Thread thread = null;
    boolean seguir = false;

    public Hilo_Crear(JProgressBar barra) {
        this.barra = barra;
    }

    public void run() {

        while (seguir == false) {
            barra.setValue(barra.getValue() + 50);
            if (barra.getValue() == 100) {
                seguir = true;
                Thread.interrupted();
                break;

            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
    
}
