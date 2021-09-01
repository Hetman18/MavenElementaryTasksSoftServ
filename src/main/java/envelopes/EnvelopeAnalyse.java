package envelopes;

import java.util.Scanner;

class EnvelopeAnalyse {
    private float sideA;
    private float sideB;
    private float sideC;
    private float sideD;
    private Scanner sc = new Scanner(System.in);

    EnvelopeAnalyse() {
        this.sideA = new InPutValidEnvelopesParameters().getEnvelopeSideA();
        this.sideB = new InPutValidEnvelopesParameters().getEnvelopeSideB();
        this.sideC = new InPutValidEnvelopesParameters().getEnvelopeSideC();
        this.sideD = new InPutValidEnvelopesParameters().getEnvelopeSideD();
    }

    boolean analyseEnvelopesNested() {
        String CDnestedAB = "Envelope CD can be nested to envelope AB!";
        String ABnestedCD = "Envelope AB can be nested to envelope CD!";
        if (sideA > sideC && sideA > sideD && sideB > sideC || sideB > sideD) {
            System.out.println(CDnestedAB);
        } else if (sideB > sideC && sideB > sideD && sideA > sideC || sideA > sideD) {
            System.out.println(CDnestedAB);
        } else if (sideC > sideB && sideC > sideA && sideD > sideB || sideD > sideA) {
            System.out.println(ABnestedCD);
        } else if (sideD > sideB && sideD > sideA && sideC > sideB || sideC > sideA) {
            System.out.println(ABnestedCD);
        } else {
            System.out.println("No one envelope can't be nested to another");
        }
        return areYouWantToContinueAnalyse();
    }

    private boolean areYouWantToContinueAnalyse() {
        String strAnswer;
        while (true) {
            try {
                System.out.println("If you want to continue enter 'y' or 'yes': ");
                strAnswer = sc.nextLine();
                if (!(strAnswer.equals("y") || strAnswer.equals("yes") || strAnswer.equals("Y") || strAnswer.equals("YES"))) {
                    System.exit(0);
                } else {
                    new EnvelopeAnalyse().analyseEnvelopesNested();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}


