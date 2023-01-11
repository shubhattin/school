import java.util.Scanner;

class ConsecSum {
    int num;

    public static void main(String[] args) {
        ConsecSum a = new ConsecSum();
        a.input();
        a.sum();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        if (num < 0) {
            System.out.println("Not a positive Number");
            System.exit(0);
        }
        sc.close();
    }

    void sum() {
        int found = 0;
        for (int x = 1; x < num; x++) {
            int sum = 0;
            String sm = "";
            for (int t = x; t < num; t++) {
                sum += t;
                sm += String.valueOf(t);
                if (sum == num) {
                    System.out.println(sm);
                    found++;
                    break;
                } else if (sum >= num)
                    break;
                sm += " + ";
            }
        }
        if (found == 0)
            System.out.println("No Consecutive Sum found");
    }
}
/*
 * Variable Description
 * Name | Type | Description
 * - | - | -
 * ***global***
 * num | int | input number
 * ***void input()***
 * sc | Scanner | Scanner object to take user input
 * ***void sum()***
 * found | int | number of consecutive sums found
 * x, t | int | countr variables
 * sum | int | stores the sum of consecutive numbers
 * sm | String | stores the consecutive numbers representatuon as a string
 * ***void main()***
 * a | ConsecSum | object of the class ConsecSum to invoke its methods
 */
/*
 * Algorithm
 * #### Algorithm for ***input()*** method
 * 1. Create a Scanner object
 * 2. Take input from the user
 * 3. Store the input in the variable ***num***
 * 4. If the input is negative, print an error message and exit the program
 * 5. Close the Scanner object
 * #### Algorithm for ***sum()*** method
 * 1. Initialize the variable ***found*** to 0
 * 2. For each number from 1 to ***num***, do the following:
 * 3. Initialize the variable ***sum*** to 0
 * 4. Initialize the variable ***sm*** to an empty string
 * 5. For each number from ***x*** to ***num***, do the following:
 * 6. Add the current number to ***sum***
 * 7. Add the current number to ***sm***
 * 8. If ***sum*** is equal to ***num***, print ***sm*** and increment ***found*** by 1
 * 9. If ***sum*** is greater than ***num***, break the loop
 * 10. Add " + " to ***sm***
 * 11. If ***found*** is 0, print "No Consecutive Sum found"
 * #### Algorithm for ***main()*** method
 * 1. Create an object of the class ConsecSum
 * 2. Invoke the method ***input()***
 * 3. Invoke the method ***sum()***
 */