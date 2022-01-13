package Lab8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var geometricBodies = new ArrayList<GeometricBody>();
        geometricBodies.add(new Cube(5));
        geometricBodies.add(new Parallelepiped(2, 3, 4));
        geometricBodies.add(new Sphere(5));

        var maxSurfaceGeometricBody = GeometricBodyController.getMaxSurface(geometricBodies);
        var maxVolumeGeometricBody = GeometricBodyController.getMaxVolume(geometricBodies);
        System.out.println("Max Surface: " + maxSurfaceGeometricBody.getSurface() + " for " + maxSurfaceGeometricBody);
        System.out.println("Max Volume: " + maxVolumeGeometricBody.getVolume() + " for " + maxVolumeGeometricBody);
    }
}
