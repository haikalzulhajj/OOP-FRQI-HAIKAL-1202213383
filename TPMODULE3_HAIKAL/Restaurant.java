public class Restaurant implements Runnable {

    private boolean WaitingForPickup = false;

    private static final Object lock = new Object();

    private static int foodNumber = 1;

    @Override
    public void run() {

        while (true) {
            makeFood();

            try {
                Thread.sleep(2000);

            } 
            
            catch (InterruptedException e) {
                e.printStackTrace();

            }
        }

    }

    public void setWaitingForPickup(boolean WaitingForPickup) {
        this.WaitingForPickup = WaitingForPickup;

    }

    public static int getfoodNumber() {
        return foodNumber;

    }

    public void makeFood() {
        synchronized (Restaurant.lock) {

            if (this.WaitingForPickup) {
                try {
                    System.out.println("Restaurant: Waiting for the Waiter to deliver the food");
                    Restaurant.lock.wait();

                } 
                
                catch (InterruptedException e) {
                    e.printStackTrace();

                }

            }

            WaitingForPickup = true;

            System.out.println("Restaurant: Making Food Number " + foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant: Telling the waiter to get the food\n");
        }

    }

    public static Object getLock() {
        return lock;

    }

}