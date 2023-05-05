package dev.cw;

public class AnotherCardGame {

    public static void main(String[] args) {

        System.out.println(game(
                new int[]{2, 5, 8, 11},
                new int[]{1, 4, 7, 10},
                new int[]{0, 3, 6, 9}));

        System.out.println(game(
                new int[]{1, 2, 3, 4},
                new int[]{5, 6, 7, 8},
                new int[]{0, 9, 10, 11}));

    }

//    Method validates if Frank have any chances to win a game,
//    depending on given cards.
    public static boolean game(int[] frank, int[] sam, int[] tom) {
        int[] invertedSam = new int[4];
        int[] invertedTom = new int[4];
        int c = 4;
        for (int i = 0; i < 4; i++) {
            invertedSam[c - 1] = sam[i];
            invertedTom[c - 1] = tom[i];
            c -= 1;
        }

        int frankWins = 0;

        for (int i : frank) {
            boolean flagSam = false;
            boolean flagTom = false;
            int samCard = -1;
            int tomCard = -1;
            for (int j : invertedSam) {
                if (i > j) {
                    flagSam = true;
                    samCard = j;
                    break;
                }
            }
            for (int j : invertedTom) {
                if (i > j) {
                    flagTom = true;
                    tomCard = j;
                    break;
                }
            }
            if (flagSam && flagTom) {
                int tempNumber = 0;
                int[] tempSam = new int[invertedSam.length - 1];
                for (int j : invertedSam) {
                    if (j != samCard) {
                        tempSam[tempNumber] = j;
                        tempNumber++;
                    }
                }
                tempNumber = 0;
                int[] tempTom = new int[invertedTom.length - 1];
                for (int j : invertedTom) {
                    if (j != tomCard) {
                        tempTom[tempNumber] = j;
                        tempNumber++;
                    }
                }
                invertedSam = tempSam;
                invertedTom = tempTom;
                frankWins++;
            }
        }
        return frankWins >= 2;
    }
}
