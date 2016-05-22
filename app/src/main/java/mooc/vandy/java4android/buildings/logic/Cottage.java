package mooc.vandy.java4android.buildings.logic;

public class Cottage extends House {

    private boolean secondFloor;

    // base constructor
    public Cottage (int dimension, int lotLength, int lotWidth) {
        super(dimension, dimension, lotLength, lotWidth);
    }

    // constructor that calls base constructor and adds status of secondFloor
    public Cottage (int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor) {
        super(dimension, dimension, lotLength, lotWidth, owner);
        this.secondFloor = secondFloor;
    }

    @Override
    public String toString() { return "Cottage: has building area of " + calcBuildingArea(); }

    public boolean hasSecondFloor() { return secondFloor; }
}