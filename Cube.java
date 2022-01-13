package Lab8;


public class Cube implements GeometricBody {
    private final double length;

    public Cube(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Invalid cube length value");
        }
        this.length = length;
    }

    @Override
    public double getSurface() {
        return length * length * 6;
    }

    @Override
    public double getVolume() {
        return length * length * length;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "length=" + length +
                '}';
    }
}
