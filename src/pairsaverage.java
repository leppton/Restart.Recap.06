import java.util.Scanner;

public class pairsaverage {

    public static int random() {

        double randomNumber = Math.random() * 6 + 1;
        return (int) randomNumber;

    }


    public static void main(String[] args) {

        double rollings;
        Scanner getRollings = new Scanner(System.in);

        System.out.println("Dice Pair detector v1.1 (with Stats)");
        System.out.println("Please insert number of rollings:");
        rollings = getRollings.nextInt();

        int dice1;
        int dice2;
        double pairFlag = 0;
        String pairStatus;

        for (int i = 1; i < rollings + 1; i++) {

            dice1 = random();
            dice2 = random();

            if (dice1 == dice2) {
                pairFlag += 1;
                pairStatus = "PAIR!";
            }
            else pairStatus = "";

            System.out.println("Result #" + i + ": " + dice1 + ":" + dice2+" "+pairStatus);
            if(i==rollings){
                System.out.println();
                System.out.println("Process finished. Successfully calculated "+(int)rollings+" two-dice rollings.");

            }

        }

        if (pairFlag == 0) {
            System.out.println("Bad luck: No Pairs!");
            System.out.println();
        }

        double percentage = (pairFlag / rollings) * 100;

        double Calcaverage = 0;

        if(pairFlag != 0) {
            Calcaverage = 1/percentage*100;
        }
        System.out.println();
        System.out.println("Statistics:");
        System.out.println("From " + (int)rollings + " rollings, there were " + (int)pairFlag + " pairs");


        System.out.println("It represents the " + String.format("%.2f", percentage) + "% of total rollings");

        System.out.println("On average, there were "+String.format("%.2f", Calcaverage)+" rollings for a Pair.");



    }
}
