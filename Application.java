public class Application {

    private InputDevice inputDevice;
    private OutputDevice outputDevice;

    public Application(InputDevice inputDevice, OutputDevice outputDevice) {
        this.inputDevice = inputDevice;
        this.outputDevice = outputDevice;
    }

    public double computeWeight(Fruit[] fruits) {
        double totalWeight = 0;
        for (Fruit fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public double computeSugarContent(Fruit[] fruits) {
        double totalSugarContent = 0;

        // Iterate through the array of fruits and sum up the sugar content of each fruit
        for (Fruit fruit : fruits) {
            totalSugarContent += fruit.getSugarContent();
        }

        return totalSugarContent;
    }
    public void prepareFruit(Fruit[] fruits) {
        for (Fruit fruit : fruits) {
            if (fruit instanceof Peelable) {
                Peelable peelableFruit = (Peelable) fruit;
                if (peelableFruit.hasPeel()) {
                    System.out.println("\nPeeling " + fruit.getName() + "...");
                    peelableFruit.peelOff();
                }
            }

            if (fruit instanceof SeedRemovable) {
                SeedRemovable seedRemovableFruit = (SeedRemovable) fruit;
                if (seedRemovableFruit.hasSeeds()) {
                    System.out.println("Removing seeds from " + fruit.getName() + "...");
                    seedRemovableFruit.removeSeeds();
                }
            }
        }
    }
}