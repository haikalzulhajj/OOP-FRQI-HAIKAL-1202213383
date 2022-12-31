public class Calculation implements Runnable {

    public double radius, side, area;

    public final double phi = 3.14;

    @Override
    public void run() {
        System.out.println("====Program Will Start In====");
        System.out.println("");

        for (int i = 3; i > 0; i--) {
            System.out.println("Starting with thread" + i);
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            
        }
    }


    public double getSquare() {
        return this.area;

    }

    public void setSquare(int) {
        if (side < 1) {
            throw new IllegalArgumentException();
        } 
        
        else {
            this.area = side * side;
            
        }

    }

    public double getCircle() {
        return this.area;
    }

    public void setCircle(int) {

        if (radius <= 1) {
            throw new IllegalArgumentException();

        } 
        
        else {
            this.area = this.phi * radius * radius;

        }

    }

    public double getTrapezoid() {
        return this.area;
    }

    public void setTrapezoid(double side1, double side2, double height) {
        if ((side1 < 1 || side2 < 1)) {
            throw new IllegalArgumentException();
        } 
        
        else {
            this.area = (side1 + side2) * height /2;
        
    }

}
