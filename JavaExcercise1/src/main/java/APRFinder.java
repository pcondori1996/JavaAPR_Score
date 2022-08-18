 import java.util.Scanner;

public class APRFinder {
   
public class FindAPR {

    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        int loop = 1;
        double totalFico, averageFico, fico1, fico2, fico3, apr1, apr2, apr3;
        String name1, name2, name3;

        System.out.println("This program will show the 3 users name, fico score, and their APR.");
        System.out.println("Your Fico will be result in a APR (0.05-.0.07)\nFico score can only be 620-680.\n");

        while (loop != 999) {
            System.out.println("\nEnter the first persons name: ");
            name1 = S1.nextLine();
            S1.nextLine();
            
            do {
                System.out.println("FICO score must be 620-680: ");
                fico1 = S1.nextDouble();
            } while (fico1 < 619 || fico1 > 681);

            if (fico1 > 620 && fico1 < 639) {
                apr1 = 0.07;
            } else if (fico1 > 640 && fico1 < 659) {
                apr1 = 0.06;
            } else {
                apr1 = 0.07;
            }

            System.out.println("\nEnter the second persons name: ");
            name2 = S1.nextLine();
            S1.nextLine();
            
            do {
                System.out.println("FICO score must be 620-680: ");
                fico2 = S1.nextDouble();
            } while (fico2 < 619 || fico2 > 681);

            if (fico2 > 620 && fico2 < 639) {
                apr2 = 0.07;
            } else if (fico2 > 640 && fico2 < 659) {
                apr2 = 0.06;
            } else {
                apr2 = 0.07;
            }

            System.out.println("\nEnter the third persons name: ");
            name3 = S1.nextLine();
            S1.nextLine();
            
            
            do {
                System.out.println("FICO score must be 620-680: ");
                fico3 = S1.nextDouble();

            } while (fico3 < 619 || fico3 > 681);

            if (fico3 > 620 && fico3 < 639) {
                apr3 = 0.07;
            } else if (fico3 > 640 && fico3 < 659) {
                apr3 = 0.06;
            } else {
                apr3 = 0.07;
            }
            totalFico = fico1 + fico2 + fico3;
            averageFico = totalFico / 3;

            System.out.println("The first username is " + name1 + " and their FICO score is " + fico1 + ". Their APR is: " + apr1);
            System.out.println("The second username is " + name2 + " and their FICO score is " + fico2 + ". Their APR is: " + apr2);
            System.out.println("The third username is " + name3 + " and their FICO score is " + fico3 + ". Their APR is: " + apr3);
            System.out.println("The average of all the FICO score is: " + totalFico);

            System.out.println("If you would like end this program enterr 9999");
            System.out.println("If would like to enter a new info for each 3 users enter any number: ");
            loop = S1.nextInt();
        }

        System.out.println("Loop has ended. Have a great day!!!");
    }

}
