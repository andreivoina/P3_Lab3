public class Banana extends Fruit implements Peelable {

    private boolean hasPeel = true;

    public Banana (double weight, double sugarContent, double waterContent) {
        super(weight, sugarContent, waterContent, Color.YELLOW);
    }

    public String getName() {
        return "Banana";
    }

    public boolean hasPeel() {
        return hasPeel;
    }

    public void peelOff() {
        if (hasPeel) {
            System.out.println("Peeling off the banana...");
            hasPeel = false; // Set hasPeel to false after peeling
        }
        else System.out.println("The banana is already peeled.");
    }

}
