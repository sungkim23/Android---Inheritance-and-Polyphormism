package mooc.vandy.java4android.buildings.logic;

public class House extends Building {

    private String owner;
    private boolean pool;

    // base constructor
    public House (int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
    }

    // calls base constructor and adds owner
    public House (int length, int width, int lotLength, int lotWidth, String owner) {
        this(length, width, lotLength, lotWidth);
        setOwner(owner);
    }

    // calls contructor to add owner name, which calls the base constructor, and adds pool status
    public House (int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        this(length, width, lotLength, lotWidth, owner);
        setPool(pool);

    }
    public String getOwner() { return owner; }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean hasPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    @Override
    public String toString() {
        String s = "Owner: " + getOwner();
        if (calcBuildingArea() < calcLotArea()) { s = s + "; has a big open space"; }
        else { s = s + " has a small open space"; }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof House) {
            House that = (House)o;
            return (this.calcBuildingArea() == that.calcBuildingArea() &&
                    this.hasPool() == that.hasPool());
        }
        return false;
    }
}
