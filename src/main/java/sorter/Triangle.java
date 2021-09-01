package sorter;

import java.util.ArrayList;

class Triangle implements Comparable<Triangle> {
    private String name;
    private double sideA;
    private double sideB;
    private double sideC;
    static ArrayList<Triangle> triangleParameters = new ArrayList<>();

    public Triangle(String name, double sideA, double sideB, double sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculateTriangleSquare() {
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        double squareTriangle = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
        return squareTriangle;
    }

    public String toString() {
        return ("[" + name + "] " + ":" + calculateTriangleSquare() + " cm");
    }

    @Override
    public int compareTo(Triangle o) {
        return Double.compare(this.calculateTriangleSquare(), o.calculateTriangleSquare());
    }
}



