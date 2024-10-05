package flyweight;

public class PaintApp {

    public void render(int numberOfShapes) {

        Shape shape = null;
        for (int i = 1; i <= numberOfShapes; i++) {
            if (i % 2 == 0) {
                shape = ShapeFactory.getShape("circle");
                shape.draw(5, "while", "red");
            } else {
                shape = ShapeFactory.getShape("rectangle");
                shape.draw(10, 10, "dotted");
            }
        }
    }
}


