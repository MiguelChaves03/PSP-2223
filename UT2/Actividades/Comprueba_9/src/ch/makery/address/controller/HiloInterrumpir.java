package ch.makery.address.controller;

public class HiloInterrumpir extends Thread {

    private int c = 0;

    public HiloInterrumpir () {

    }

    public void interrumpirHilo () {

        interrupt ();

    }

    int getContador () {

        return c;

    }

    public void run () {

        try {

            while (!isInterrupted ()) {

                c ++;

                System.out.print (" " + c + " ");

                sleep (500);

            }

        } catch (InterruptedException exception) {

        }

    }

}
