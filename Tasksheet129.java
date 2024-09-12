public class Tasksheet129 {

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}

public class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {        // put gorilla food in cage
        if (timeToEat) {
            System.out.println("\n[You feed the Gorilla.]");
            System.out.println("Gorilla hungry, Gorilla eat now...");
            System.out.println("[Gorilla seem happy]");
            return true;
        } else {
            System.out.println("Gorilla fine, Gorilla go to sleep...ZZZZZzzzzz");
            return false;
        }
    }

    @Override
    public void pet() {                            // pet at your own risk
        System.out.println("\n[You pet the Gorilla.]");
        System.out.println("Hehehe...");
        System.out.println("[Gorilla seem happy]");
    }

    @Override
    public void groom() {                          // lather, rinse, repeat
        System.out.println("\n[You groom the Gorilla.]");
        System.out.println("[Gorilla behaved prim and proper.]");
    }
}

interface Animal {
    boolean feed(boolean timeToEat);  
    void pet();
    void groom();
}
