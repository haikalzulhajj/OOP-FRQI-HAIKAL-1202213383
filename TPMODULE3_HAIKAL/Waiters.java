public class Waiters implements Runnable {

    private final int orderQty;

    private final int customerID;

    static int foodPrice = 25000;

    public Waiters(int customerID, int orderQty) {
        this.orderQty = orderQty;
        this.customerID = customerID;
        
    }

    @Override
    public void run() {
        
        while (true) {
            getFood();
            try {
                Thread.sleep(1000);
            } 
            
            catch (InterruptedException e) {
                e.printStackTrace();

            }

        }

    }

    public void orderInfo() {

        int totalPrice = orderQty * foodPrice;
        System.out.println("==========================================================");

        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Numbeer of Food: " + this.orderQty);
        System.out.println("Total Price: " + totalPrice);

        System.out.println("==========================================================");

    }
    
    public void getFood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter: Food is ready to deliver");
            Restaurant restoran = new Restaurant();
            restoran.setWaitingForPickup(false);

            
            if (Restaurant.getfoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);

            }

            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the Restaurant to make another food\n");

        }

    }

}

