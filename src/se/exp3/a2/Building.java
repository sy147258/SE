package se.exp3.a2;

/**
 * A1-2 Building（被 College 聚合）
 */
public class Building {
    private String name;     // - name
    private String address;  // - address

    public Building(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /** + getLocation() : string */
    public String getLocation() {
        return name + ", " + address;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
