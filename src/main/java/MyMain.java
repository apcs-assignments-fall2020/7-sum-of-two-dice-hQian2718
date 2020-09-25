import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        return ((int) (Math.random()*6 )) + 1;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] results = new int[11];
        int roll = 0;
        for(int i = 0; i < n; i ++){
            roll = rollDie() + rollDie();
            results[roll - 2] ++;
        }
        return results;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        do{
            System.out.println("Input the number of times you want to roll two dice:");
            n = s.nextInt();
        }while(n <= 0);

        double n1 = n;

        int[] r = sumOfTwoDice(n);

        for(int i = 0 ; i < 11; i ++){
            System.out.println("A sum of " + (i+2) + " was reached " + (r[i] * 100/ n1)  + "% of the time;");
        }
    }
}


/*How many pair of dice would you like to roll?
1000000
% of rolls where sum == 2: 2.7744999999999997
% of rolls where sum == 3: 5.5501000000000005
% of rolls where sum == 4: 8.3884
% of rolls where sum == 5: 11.0656
% of rolls where sum == 6: 13.8711
% of rolls where sum == 7: 16.6147
% of rolls where sum == 8: 13.883499999999998
% of rolls where sum == 9: 11.1155
% of rolls where sum == 10: 8.36
% of rolls where sum == 11: 5.5903
% of rolls where sum == 12: 2.7862999999999998
 */