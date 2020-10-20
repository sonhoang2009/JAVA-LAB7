package Mark;

import java.util.Scanner;

public class Mark {
    int mark[][];
    byte markCount;

    public Mark(){
        mark = new int[4][4];
        markCount = 0;
    }

    void addMark(){
        Scanner input = new Scanner(System.in);

        if (markCount<mark.length){
            System.out.println("Enter mark 1: ");
            mark[markCount][0] = input.nextInt();

            System.out.println("Enter mark 2: ");
            mark[markCount][1] = input.nextInt();

            System.out.println("Enter mark 3: ");
            mark[markCount][2] = input.nextInt();

            System.out.println("Enter mark 4: ");
            mark[markCount][3] = input.nextInt();

            markCount++;
        }else
            System.out.println("Sorry Can't add more mark ");
    }

    void displayMark(){
        if (markCount>0){
            System.out.println("\n Subject \t \t \t \t Mark");
            System.out.println("\n1 \t \t 2 \t \t 3 \t \t 4");
            System.out.println("---------------------------");

            for (int rowIndex =0 ; rowIndex <markCount; rowIndex++) {
                System.out.printf("%d\t\t", mark[rowIndex][0]);
                System.out.printf("%d\t\t", mark[rowIndex][1]);
                System.out.printf("%d\t\t", mark[rowIndex][2]);
                System.out.printf("%d\n", mark[rowIndex][3]);
            }
            }else
        System.out.println("no mark to display");

    }

    void searchByName(){
        boolean markFound= false;

        if (markCount>0){
            Scanner input = new Scanner(System.in);
            System.out.println("\nEnter the mark you want to "+ "search for: ");

            int searchByName = input.nextInt();
            System.out.println("\n Subject \t \t \t \t Mark");
            System.out.println("---------------------------");

            for (int rowIndex =0 ; rowIndex <markCount ; rowIndex++){
                if (mark[rowIndex][0]==searchByName){
                    System.out.printf("%d\t\t",mark[rowIndex][0]);
                    System.out.printf("%d\t\t",mark[rowIndex][1]);
                    System.out.printf("%d\t\t",mark[rowIndex][2]);
                    System.out.printf("%d\t\t",mark[rowIndex][3]);
                    markFound = true;
                    break;
                }
            }
            if (!markFound)
                System.out.println("Mark not found");
        }
        else
            System.out.println("No mark to search");

    }



}
