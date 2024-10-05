package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    public static Map<String, Shape> map = new HashMap<>();

    public static Shape getShape(String type) {
        Shape shape = null;

        if (map.get(type) != null) {
            shape = map.get(type);
        } else {
            if (type.equals("circle")) {
                shape = new Circle();
            } else if (type.equals("rectangle")) {
                shape = new Rectangle();
            }

            map.put(type, shape);
        }

        return shape;
    }
}
