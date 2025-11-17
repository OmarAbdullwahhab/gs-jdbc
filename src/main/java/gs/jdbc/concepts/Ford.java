package gs.jdbc.concepts;

public class Ford implements  ICar {
    @Override
    public void accelerate() {
        System.out.println("Ford accelerates");
    }

    public void brake(){
        System.out.println("Ford brakes");
    }
}
