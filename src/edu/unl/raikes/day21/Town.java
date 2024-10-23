package edu.unl.raikes.day21;

// classes are the blueprints
public class Town {
    // public means anyone has access to read or modify
    // no private/public means any in same package can modify the variables
    // private keyword restricts access and modifying to only within class
    private String name;
    private String mayorName;
    private double xCoord;
    private double yCoord;

    // constructor function
    public Town(String name, String mayorName, double xCoord, double yCoord) {
        this.name = name;
        this.mayorName = mayorName;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }
    
    // nonstatic because it relies on town data(dependent on object, not class)
    public double getDistance(Town otherTown) {
        double deltaX = otherTown.xCoord - this.xCoord;
        double deltaY = otherTown.yCoord - this.yCoord;
        double square = Math.pow(deltaX, 2) + Math.pow(deltaY, 2);
        
        return Math.sqrt(square);
    }
    
    // This is static because it doesn't rely on a single object
    public static double distance(Town townA, Town townB) {
        return townA.xCoord;
    }

    public double getxCoord() {
        return xCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMayorName(String mayorName) {
        this.mayorName = mayorName;
    }

    public String getName() {
        return name;
    }

    public String getMayorName() {
        return mayorName;
    }
    
}
