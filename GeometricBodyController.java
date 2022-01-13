package Lab8;


import java.util.ArrayList;

public class GeometricBodyController {
    public static GeometricBody getMaxVolume(ArrayList<GeometricBody> geometricBodies) {
        if (geometricBodies == null || geometricBodies.size() == 0) {
            throw new IllegalArgumentException("Empty list");
        }

        var maxVolumeGeometricBody = geometricBodies.get(0);
        for (var geometricBody : geometricBodies) {
            if (maxVolumeGeometricBody.getVolume() < geometricBody.getVolume()) {
                maxVolumeGeometricBody = geometricBody;
            }
        }
        return maxVolumeGeometricBody;
    }

    public static GeometricBody getMaxSurface(ArrayList<GeometricBody> geometricBodies) {
        if (geometricBodies == null || geometricBodies.size() == 0) {
            throw new IllegalArgumentException("Empty list");
        }

        var maxSurfaceGeometricBody = geometricBodies.get(0);
        for (var geometricBody : geometricBodies) {
            if (maxSurfaceGeometricBody.getSurface() < geometricBody.getSurface()) {
                maxSurfaceGeometricBody = geometricBody;
            }
        }
        return maxSurfaceGeometricBody;
    }
}