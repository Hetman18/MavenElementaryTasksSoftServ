package sorter;

import java.util.Scanner;

class InPutTriangleParameters {

    public static String[] inPutTriangleParameters() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter triangle name and parameters sideA, sideB, sideC separating with comma: ");
        String inPutParameters = sc.nextLine();
        String[] triangleParameters = inPutParameters.split(",");
        return triangleParameters;
    }
}













//    double inPutValidDoubleParameters() {
//        double parameter;
//        while (true) {
//            try {
//                parameter = sc.nextDouble();
//                while (parameter <= 0) {
//                    System.err.println("Please enter float parameter more than 0:");
//                    parameter = sc.nextDouble();
//                }
//            } catch (IllegalArgumentException e) {
//                System.out.println("Enter float number please!");
//                continue;
//            }
//            return parameter;
//        }
//    }
//
//    String inPutValisStringParameters() {
//        return sc.nextLine();
//    }
