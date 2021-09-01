package board;

public class CreateChessBoard extends InPutAndValidationParametrs {

    private int setChessBoardHeight() {
        System.out.println("Enter Height integer parameter: ");
        return inputValidParameters();
    }

    private int setChessBoardWidth() {
        System.out.println("Enter Width integer parameter: ");
        return inputValidParameters();
    }

    void drawChessBoard() {
        int height = setChessBoardHeight();
        int width = setChessBoardWidth();
        for (int i = 0; i < height; i++) {
            if (i % 2 == 0) {
                System.out.print("");
            } else {
                System.out.print(" ");
            }
            for (int j = 0; j <= width * 2; j++) {
                if (j % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

