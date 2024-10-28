public class Main {

    public static void main(String[] args) {

        InputDevice inputDevice = new InputDevice();

        OutputDevice outputDevice = new OutputDevice();

        Application app = new Application(inputDevice, outputDevice);


        Fruit[] fruits = inputDevice.readFruit();

        app.prepareFruit(fruits);


        double totalWeight = app.computeWeight(fruits);
        System.out.println("\nTotal weight of fruits: " + totalWeight + "g");


        double totalSugarContent = app.computeSugarContent(fruits);
        System.out.println("Total sugar content of fruits: " + totalSugarContent + "g");


        System.out.println("\nDetails of each fruit:");
        for (Fruit fruit : fruits) {
            System.out.println("----- Fruit Details -----");
            System.out.println("Fruit name: " + fruit.getName());
            System.out.println("Fruit Color: " + fruit.getColor());
            System.out.println("Fruit Weight: " + fruit.getWeight() + "g");
            System.out.println("Fruit Sugar Content: " + fruit.getSugarContent() + "g");
            System.out.println("Fruit Water Content: " + fruit.getWaterContent() + "ml");
            System.out.println("------------------------");
        }
    }
}