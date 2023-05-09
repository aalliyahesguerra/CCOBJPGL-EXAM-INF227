public class Me implements Tourist  {

    static int budget = 1000;

    

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        System.out.println("-----BORACAY-----");
        System.out.println("Flight Price: P" + boracay.airFare);
        System.out.println("Current Budget: P" + budget);
    
        if(budget<=boracay.airFare) {
            System.out.println("You do not have enough budget to continue your flight." + "\n");
        } else {
        System.out.println("Yay! I can go to Boracay!");
        System.out.println("Arriving...");
        System.out.println("I have arrived in Boracay!");
        budget = budget-boracay.airFare;
        System.out.println("Surfing and swimming at the moment :p");
        System.out.println("Budget left: P" + budget + "\n");
        // Define your visit
        }
    }

    public void visit (Siargao siargao){
        System.out.println("-----SIARGAO-----");
        System.out.println("Flight Price: P" + siargao.airFare);
        System.out.println("Current Budget: P" + budget);
        if(budget<siargao.airFare) {
            System.out.println("You do not have enough budget to continue your flight.");
        } else {
        System.out.println("Yey! I can go to Siargao <3");
        System.out.println("Arriving...");
        System.out.println("I have arrived in Siargao!");
        budget = budget-siargao.airFare;
       
            System.out.println("Having fun with my summer vacation in Siargao!");
            System.out.println("Budget left: P" + budget + "\n");
        }
        

    }

    public void visit (Iceland iceland){
        System.out.println("-----ICELAND-----");
        System.out.println("Flight Price: P" + iceland.airFare);
        System.out.println("Current Budget P" + budget);
        if(budget<iceland.airFare) {
            System.out.println("You do not have enough budget to continue your flight."+ "\n");
        } else {
            System.out.println("Wooooh! I can go to Iceland!");
            System.out.println("Arriving...");
            System.out.println("I have arrived in Iceland!");
            budget = budget-iceland.airFare;

            System.out.println("Having fun seeing the Northern Lights ~");
            System.out.println("Budget left: P" + budget+ "\n");
        }

    }

    public void visit (JejuIsland jejuIsland){
        System.out.println("-----JEJU ISLAND-----");
        System.out.println("Flight Price: P" + jejuIsland.airFare);
        System.out.println("Current Budget P" + budget);
        if(budget<jejuIsland.airFare) {
            System.out.println("You do not have enough budget to continue your flight.");
        } else {
            System.out.println("Yay! I can go to Jeju Island!");
            System.out.println("Arriving...");
            System.out.println("I have arrived in Jeju Island!");
            budget = budget-jejuIsland.airFare;

            System.out.println("Enjoying my visit to Jeongbang Waterfalls in JejuIsland!");
            System.out.println("Budget left: P" + budget + "\n");
        }

    }
    
   public void visit (Rome rome){
    System.out.println("-----ROME-----");
    System.out.println("Flight Price: P" + rome.airFare);
    System.out.println("Current Budget P" + budget);
    if(budget<rome.airFare) {
        System.out.println("You do not have enough budget to continue your flight.");
    } else {
        System.out.println("I can still go to Rome, yay!");
        System.out.println("Arriving...");
        System.out.println("I have arrived in Rome!");
        budget = budget-rome.airFare;
        System.out.println("Visiting museums and the Colosseum Arena in Rome!");
        System.out.println("Budget left: P" + budget);
    }


   }

    public void checkBudget(int currentBudget) {
        System.out.println("my current budget is " + budget);
    }

}