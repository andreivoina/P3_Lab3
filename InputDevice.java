import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.List;


public class InputDevice {

    public Fruit[] readFruit() {
        List<Fruit> fruits = new ArrayList<>();

        Banana banana = new Banana(120, 12, 85);
        Apple redApple = new Apple(150, 15, 80, Fruit.Color.RED);
        Apple greenApple = new Apple(140, 14, 82, Fruit.Color.GREEN);
        Mango mango = new Mango(200, 20, 90, Fruit.Color.YELLOW);

        //return new Fruit[] {banana, redApple, greenApple, mango};

        fruits.add(banana);
        fruits.add(redApple);
        fruits.add(greenApple);
        fruits.add(mango);

        return fruits.toArray(new Fruit[0]);
    }

}