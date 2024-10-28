public abstract class Fruit {

    public enum Color {
        RED, YELLOW, BLUE, PURPLE, GREEN, ORANGE, BLACK
    }

    private double weight;
    private double sugarContent;
    private double waterContent;
    private Color color;

    public Fruit(double weight, double sugarContent, double waterContent, Color color) {
        this.weight = weight;
        this.sugarContent = sugarContent;
        this.waterContent = waterContent;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    public double getWaterContent() {
        return waterContent;
    }

    public Color getColor() {
        return color;
    }

    public abstract String getName();

}
