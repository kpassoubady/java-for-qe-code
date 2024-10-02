package com.kavinschool.enums;

import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        int player1 = new Random().nextInt(3);
        int player2 = new Random().nextInt(3);

        HandSignal player1HandSignal = HandSignal.values()[player1];
        HandSignal player2HandSignal = HandSignal.values()[player2];

        System.out.println("player1 HandSignal = " + player1HandSignal);
        System.out.println("player2 HandSignal = " + player2HandSignal);

        if (player1HandSignal == player2HandSignal) {
            System.out.println("Both are tie");
            System.exit(0);
        }

        switch (player1HandSignal) {
            case ROCK:
                if (player2HandSignal == HandSignal.SCISSOR) {
                    System.out.println("Rock breaks scissor!!");
                    System.out.println("player 1 HandSignal " + player1HandSignal + " Wins");
                } else {
                    System.out.println("Paper wraps Rock!!");
                    System.out.println("player 2 HandSignal" + player2HandSignal + " Wins");
                }
                break;
            case PAPER:
                if (player2HandSignal == HandSignal.SCISSOR) {
                    System.out.println("Scissor cuts papper!!");
                    System.out.println("player 2 HandSignal " + player2HandSignal + " Wins");
                } else {
                    System.out.println("Paper wraps Rock!!");
                    System.out.println("player 1 HandSignal " + player1HandSignal + " Wins");
                }
                break;
            case SCISSOR:
                if (player2HandSignal == HandSignal.PAPER) {
                    System.out.println("Scissor cuts papper!!");
                    System.out.println("player 1 HandSignal " + player1HandSignal + " Wins");
                } else {
                    System.out.println("Rock breaks Scissor!!");
                    System.out.println("player 2 HandSignal " + player2HandSignal + " Wins");
                }
                break;
        }
    }
}
