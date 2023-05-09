public class Siargao implements Locations{
    
    int airFare = 90;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
} 
