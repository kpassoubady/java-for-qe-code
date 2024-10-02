package com.kavinschool.enums;

import java.util.Random;


public class RockPaperScissorVer2 {

    private static final String ROCK_SCISSOR = "Rock breaks scissor!!";
    private static final String PAPER_ROCK = "Paper wraps Rock!!";
    private static final String SCISSOR_PAPER ="Scissor cuts paper!!";

    private static void printWinMessage(String WinMsg, int playerNum, HandSignal playerHandSignal) {
        System.out.println(WinMsg);
        System.out.printf("player %d HandSignal %s Wins ", playerNum, playerHandSignal.name().toLowerCase());
    }

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
                    printWinMessage(ROCK_SCISSOR,1, player1HandSignal);
                } else {
                    printWinMessage(PAPER_ROCK,2, player2HandSignal);
                }
                break;
            case PAPER:
                if (player2HandSignal == HandSignal.SCISSOR) {
                    printWinMessage(SCISSOR_PAPER,2, player2HandSignal);
                } else {
                    printWinMessage(PAPER_ROCK,1, player1HandSignal);
                }
                break;
            case SCISSOR:
                if (player2HandSignal == HandSignal.PAPER) {
                    printWinMessage(SCISSOR_PAPER,1, player1HandSignal);
                } else {
                    printWinMessage(ROCK_SCISSOR,2, player2HandSignal);
                }
                break;
        }
    }
}
