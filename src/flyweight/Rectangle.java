package flyweight;

public class Rectangle extends Shape  {

    private String label;

    public Rectangle() {
        this.label = "Rectangle";
    }

    @Override
    public void draw(int length, int breadth, String fillstyle) {
        System.out.println("Drawing " + label + " with length " + length + " breadth " + breadth + " and fillstyle " + fillstyle);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


}
