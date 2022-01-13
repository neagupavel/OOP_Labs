package Lab8;

public class Sphere implements GeometricBody {
    private final double radius;

    public Sphere(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Invalid radius length value");
        }
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return Math.PI * radius * radius * 4;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * radius * 4 / 3;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}';
    }
}
