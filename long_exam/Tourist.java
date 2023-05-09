import javax.sound.sampled.SourceDataLine;

interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Boracay boracay);

    void visit (Siargao siargao);

    void visit (Iceland iceland);

    void visit (JejuIsland jejuIsland);
    
    void visit (Rome rome);


  

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}