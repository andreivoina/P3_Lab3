public class Mango extends Fruit implements Peelable, SeedRemovable {

    private boolean hasPeel = true;
    private boolean hasSeeds = true;

    public Mango(double weight, double sugarContent, double waterContent, Color color) {
        super(weight, sugarContent, waterContent, color);
    }

    public String getName() {
        return "Mango";
    }

    public boolean hasPeel() {
        return hasPeel;
    }

    public void peelOff() {
        if (hasPeel) {
            System.out.println("Peeling off the mango...");
            hasPeel = false; // Set hasPeel to false after peeling
        }
        else System.out.println("The mango is already peeled.");
    }

    public boolean hasSeeds() {
        return hasSeeds;
    }

    public void removeSeeds() {
        if (hasSeeds) {
            System.out.println("Removing the mango seed...");
            hasSeeds = false; // Set hasSeed to false after "removing seeds"
        }
        else System.out.println("The mango has no seed.");

    }
}
