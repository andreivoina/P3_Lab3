public class Apple extends Fruit implements Peelable, SeedRemovable {

    private boolean hasPeel = true;
    private boolean hasSeeds = true;

    public Apple(double weight, double sugarContent, double waterContent, Color color) {
        super(weight, sugarContent, waterContent, color);
    }

    public String getName() {
        return "Apple";
    }

    public boolean hasPeel() {
        return hasPeel;
    }

    public void peelOff() {
        System.out.println("Apples do not need to be peeled off.");
    }

    public boolean hasSeeds() {
        return hasSeeds;
    }

    public void removeSeeds() {
        if (hasSeeds) {
            System.out.println("Removing seeds from the apple...");
            hasSeeds = false;
        }
        else System.out.println("The apple already has no seeds.");

    }
}
