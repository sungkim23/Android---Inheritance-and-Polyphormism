package mooc.vandy.java4android.buildings.logic;

public class Office extends Building {

    private String businessName;
    private int parkingSpaces;
    private static int totalOffices = 0;        // class variable to hold number of offices

    // base constructor - all other constructors call this one, which adds 1 to number of offices
    public Office(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        totalOffices++;                         // adds 1 to number of offices
    }

    // constructor that calls the base constructor and adds the business name
    public Office(int length, int width, int lotLength, int lotWidth, String businessName) {
        this(length, width, lotLength, lotWidth);
        setBusinessName(businessName);
    }

    // constructor that calls constructor with business name, which calls the base constructor
    // then sets the number of parking spaces
    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces) {
        this(length, width, lotLength, lotWidth, businessName);
        setParkingSpaces(parkingSpaces);
    }

    public String getBusinessName() { return businessName; }

    public void setBusinessName(String businessName) { this.businessName = businessName; }

    public int getParkingSpaces() { return parkingSpaces; }

    public void setParkingSpaces(int parkingSpaces) { this.parkingSpaces = parkingSpaces; }


    @Override
    public String toString() {
        String s = "Business: ";
        if (getBusinessName() != null) { s = s + getBusinessName(); }
        else { s = s + "unoccupied"; }
        s = s + " (total offices: " + totalOffices + ")";
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Office) {
            Office that = (Office)o;
            return (this.calcBuildingArea() == that.calcBuildingArea() &&
                    this.getParkingSpaces() == that.getParkingSpaces());
        }
        return false;
    }
}
