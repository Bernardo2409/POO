package aula09.Ex2;

import java.util.ArrayList;

public class PlaneTester {

    public static void main(String[] args) {

        PlaneManager frota = new PlaneManager();

        CommercialPlane cp1 = new CommercialPlane("CP123","Boeing", "A320", 2000, 200, 400, 200 );

        frota.addPlane(cp1);

        MilitaryPlane mp1 = new MilitaryPlane("MP001", "PT-45", "F16", 2010, 2, 600, 1000);

        frota.addPlane(mp1);
    }
}
