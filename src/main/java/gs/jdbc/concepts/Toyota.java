package gs.jdbc.concepts;

public class Toyota implements ICar{

    @Override
    public void accelerate() {
        System.out.println("Toyota accelerates");
    }
}
