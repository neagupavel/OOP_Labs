package Lab2.task1;

public class Box {

    double height;
    double width;
    double depth;

    Box() {
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }

    Box(double length) {
        this.height = length;
        this.width = length;
        this.depth = length;
    }

    Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    double getSurface() {
        return 4 * this.height * this.width + 2 * this.width * this.depth;
    }

    double getVolume() {
        return this.depth * this.width * this.height;
    }
}
