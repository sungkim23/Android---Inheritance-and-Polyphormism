package mooc.vandy.java4android.buildings.logic;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

public class Neighborhood{

    public static void print (Building[] buildings, String header, OutputInterface out){
        out.println(header + buildings.toString());
    }

    public static int calcArea (Building[] buildings){

        int totalarea = 0;

        for (Building building : buildings){
            totalarea += building.getLotLength()*building.getLotWidth();
        }

        return (totalarea);
    }
}
