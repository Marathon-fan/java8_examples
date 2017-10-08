package java8_sample.concurrency;

public class BoxOffice implements Runnable {

    public static void static_run() {
        BoxOffice BO = new BoxOffice();
        Thread[] thArray = new Thread[5];
        for (int i = 0; i < 5; i++) {
            thArray[i] = new Thread(BO, "ticketOffice" + i);
            thArray[i].setPriority( (i % 10) + 1);
        }
        thArray[4].setPriority(10);
        for (int i = 0; i < 5; i++) {
            thArray[i].start();
        }
    }

    private int ticketLeft = 100;

    @Override
    public void run() {

        while (ticketLeft > 0) {
            sailTicket();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public synchronized void sailTicket() {
        if (ticketLeft > 0) {
            System.out.println(Thread.currentThread().getName() + " with priority" + Thread.currentThread().getPriority() + " sells " + (this.ticketLeft--) );
        } else {
            System.out.println(Thread.currentThread().getName() + " no ticket left!");
        }
    }

}
