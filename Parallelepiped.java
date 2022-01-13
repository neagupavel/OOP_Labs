package Lab8;


public class Parallelepiped implements GeometricBody {
    private final double length;
    private final double width;
    private final double height;

    public Parallelepiped(double length, double width, double height) {
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid parallelepiped side values)");
        }
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSurface() {
        return 2 * (width * length + height * length + height * width);
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
