public class App {
    public static void main(String[] args) {

        // Long exam 1

        // 1. Add 5 new locations to visit /
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod


        Locations boracay= new Boracay();
        Locations siargao = new Siargao();
        Locations iceland = new Iceland();
        Locations jejuIsland = new JejuIsland();
        Locations rome = new Rome();

        Tourist me = new Me ();

        boracay.accept(me);
        siargao.accept(me);
        iceland.accept(me);
        jejuIsland.accept(me);
        rome.accept(me);

        

    }
}
