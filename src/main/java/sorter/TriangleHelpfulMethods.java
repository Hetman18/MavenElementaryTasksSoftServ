package sorter;

import java.util.Collections;
import java.util.Scanner;

class TriangleHelpfulMethods {
    private Scanner sc = new Scanner(System.in);

    public Triangle createTriangles() throws IllegalArgumentException {
        String[] trianglesParameters = InPutTriangleParameters.inPutTriangleParameters();
        if (trianglesParameters.length == 4) {
            String name = trianglesParameters[0];
            double sideA = Double.parseDouble(trianglesParameters[1]);
            double sideB = Double.parseDouble(trianglesParameters[2]);
            double sideC = Double.parseDouble(trianglesParameters[3]);
            if (validationTriangle(sideA, sideB, sideC)) {

                return new Triangle(name, sideA, sideB, sideC);
            }
            throw new IllegalArgumentException("Enter wrong double parameters!");
        } else {
            throw new IllegalArgumentException("Enter wrong parameters!");
        }
    }

    public boolean validationTriangle(double sideA, double sideB, double sideC) {
        if (sideA + sideB <= sideC &&
                sideA + sideC <= sideB && sideB + sideC <= sideA) {
            System.out.println("Triangle with this parameters can't be.");
            return false;
        }
        return true;
    }

    public boolean areYouWantToContinueAnalyse() {
        String strAnswer;
        Triangle.triangleParameters.add(createTriangles());
        while (true) {
            try {
                System.out.println("If you want to continue build triangles enter 'y' or 'yes': ");
                strAnswer = sc.nextLine();
                if (!(strAnswer.equals("y") || strAnswer.equals("yes") || strAnswer.equals("Y") || strAnswer.equals("YES"))) {
                    outPutTriangles();
                    System.exit(0);
                } else {
                    Triangle.triangleParameters.add(createTriangles());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void outPutTriangles() {
        System.out.println("============= Triangles list: ===============");
        Collections.sort(Triangle.triangleParameters, Collections.reverseOrder());
        for (int i = 0; i < Triangle.triangleParameters.size(); i++) {
            System.out.println(Triangle.triangleParameters.get(i));
        }
    }
}

