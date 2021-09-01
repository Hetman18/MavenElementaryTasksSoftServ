package tickets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tickets {
    private int minTicketNumber;
    private int maxTicketNumber;

    public Tickets(int minTicketNumber, int maxTicketNumber) {
        this.minTicketNumber = minTicketNumber;
        this.maxTicketNumber = maxTicketNumber;
    }

    public int getMinTicketNumber() {
        return minTicketNumber;
    }

    public int getMaxTicketNumber() {
        return maxTicketNumber;
    }

    public List<Integer> addAllTickets() {
        List<Integer> ticketsCounter = new ArrayList<>();
        for (int i = getMinTicketNumber(); i <= getMaxTicketNumber(); i++) {
            ticketsCounter.add(i);
        }
        return ticketsCounter;
    }

    public int HappyTicketsBothMethods(boolean isEasy) {
        int easyLuckyTicketCounter = 0;
        int difficultLuckyTicketCounter = 0;
        List<Integer> allTickets = addAllTickets();
        for (int i = 0; i < allTickets.size(); i++) {
            ArrayList<Integer> number = getNumber(allTickets.get(i));
            if (checkEasyMethod(number)) {
                easyLuckyTicketCounter++;
            }
            if (checkDifficultMethod(number)) {
                difficultLuckyTicketCounter++;
            }
        }
        if (isEasy) {
            return easyLuckyTicketCounter;
        } else {
            return difficultLuckyTicketCounter;
        }
    }

    public boolean checkEasyMethod(ArrayList<Integer> ticketNumber) {
        int valueFirst = ticketNumber.get(0) + ticketNumber.get(1) + ticketNumber.get(2);
        int valueSecond = ticketNumber.get(3) + ticketNumber.get(4) + ticketNumber.get(5);
        return valueFirst == valueSecond;
    }

    public boolean checkDifficultMethod(ArrayList<Integer> ticketNumber) {
        int valueFirstDifficult = ticketNumber.get(0) + ticketNumber.get(2) + ticketNumber.get(4);
        int valueSecondDifficult = ticketNumber.get(1) + ticketNumber.get(3) + ticketNumber.get(5);
        return valueFirstDifficult == valueSecondDifficult;
    }

    public void outHappyEasyTickets() {
        int easyCounter = HappyTicketsBothMethods(true);
        int difficultCounter = HappyTicketsBothMethods(false);
        if (easyCounter > difficultCounter) {
            System.out.println("Easy method has won!");
        } else if (easyCounter < difficultCounter) {
            System.out.println("Difficult method has won!");
        } else {
            System.out.println("Methods are same!");
        }
        System.out.println("Easy counter = " + easyCounter);
        System.out.println("Difficult counter = " + difficultCounter);
    }

    public ArrayList<Integer> getNumber(int number) {
        ArrayList<Integer> numberArray = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            numberArray.add(number % 10);
            number = number / 10;
        }
        Collections.reverse(numberArray);
        return numberArray;
    }
}
