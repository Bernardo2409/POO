package aula09.Ex2;

import java.util.ArrayList;

public class PlaneManager {

    ArrayList<Plane> frota = new ArrayList<>();

    public void addPlane(Plane plane) {

        frota.add(plane);

    }

    public void removePlane(String id) {
    for (int i = 0; i < frota.size(); i++) {
        if (frota.get(i).hasId(id)) {
            frota.remove(i);
            break;
        }
    }

    }

    public Plane searchPlane(String id) {
    for (Plane plane : frota) {
        if (plane.hasId(id)) {
            return plane;
        }
    }
    return null;
    }


    public ArrayList<CommercialPlane> getCommercialPlanes() {
        ArrayList<CommercialPlane> result = new ArrayList<>();
        for (Plane plane : frota) {
            if (plane instanceof CommercialPlane) {
                result.add((CommercialPlane) plane);
            }
        }
        return result;
    }

    public ArrayList<MilitaryPlane> getMilitaryPlanes() {
        ArrayList<MilitaryPlane> result = new ArrayList<>();
        for (Plane plane : frota) {
            if (plane instanceof MilitaryPlane) {
                result.add((MilitaryPlane) plane);
            }
        }
        return result;
    }



}
