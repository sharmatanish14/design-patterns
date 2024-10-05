package flyweight;

public class Circle extends Shape {

    private String label;

    public Circle() {
        this.label = "Circle";
    }

    @Override
    public void draw(int radius, String fillcolor, String linecolor) {
        System.out.println("Drawing a " + label + " with radius " + radius + " " + "fillcolor " + fillcolor + " linecolor " + linecolor);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


}
