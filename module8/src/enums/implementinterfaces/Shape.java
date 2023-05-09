package enums.implementinterfaces;

import enums.implementinterfaces.Drawable;
import enums.implementinterfaces.Measurable;

public enum Shape implements Measurable, Drawable {
    CIRCLE(10),
    SQUARE(20),
    TRIANGLE(15);

    private final double size;

    Shape(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public double getMeasure() {
        return size;
    }

    @Override
    public void draw() {
        System.out.println("Drawing shape with size " + size);
    }
}

