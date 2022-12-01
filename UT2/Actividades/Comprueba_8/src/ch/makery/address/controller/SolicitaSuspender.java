package ch.makery.address.controller;

public class SolicitaSuspender {

    private boolean solicitaSuspender = false;

    public synchronized void set (boolean b) {

        solicitaSuspender = b;

        notifyAll ();

    }

    public synchronized void esperandoParaReanudar () throws InterruptedException {

        while (solicitaSuspender) {

            wait ();

        }

    }

}
