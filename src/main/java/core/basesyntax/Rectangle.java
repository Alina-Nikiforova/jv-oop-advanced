package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle" + ", "
                + "area: " + getArea() + ", "
                + "width: " + width + ", "
                + "height: " + height + ", "
                + "color: " + getColor());
    }
}
