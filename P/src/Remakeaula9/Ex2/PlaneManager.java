package Remakeaula9.Ex2;

import java.util.ArrayList;

public class PlaneManager {

    ArrayList<Plane> frota = new ArrayList<>();

    public void addPlane(Plane plane) {

        frota.add(plane);
    }

    public void removePlane(String id) {

        for(Plane plane : frota) {

            if(plane.getId() == id) {

                frota.remove(plane);
            }
        }
    }

    public Plane searchPlane(String id) {

        for(Plane plane : frota) {

            if(plane.getId() == id) {

                return plane;
            }
        }
        return null;
    }

    public ArrayList<Plane> getCommercialPlanes() {

        ArrayList<Plane> commercialplanes = new ArrayList<>();
        for(Plane plane : frota) {

            if(plane.getPlaneType() == "Comercial") {
                commercialplanes.add(plane);

            }
        }
        return commercialplanes;
    }

    public ArrayList<Plane> getMilitaryPlanes() {

        ArrayList<Plane> militaryplanes = new ArrayList<>();
        for(Plane plane : frota) {

            if(plane.getPlaneType() == "Military") {
                militaryplanes.add(plane);

            }
        }
        return militaryplanes;
    }

    public void printAllPlanes() {

        for(Plane plane : frota) {

            System.out.println(plane);
        }
    }

    public Plane getFastestPlane() {

        Plane maisrapido = null;
        int velocidade = 0;
        for (Plane p : frota) {
            if ( p.getVel_max() > velocidade) {

                maisrapido = p;
            }
        }
        return maisrapido;
    }
}
