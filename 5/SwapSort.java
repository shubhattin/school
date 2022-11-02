import java.util.*;

class SwapSort {
    String wrd, swapwrd, sortwrd;
    int len;

    void readstring() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        wrd = sc.next();
        len = wrd.length();
        sc.close();
    }

    void swapchar() {
        StringBuffer a = new StringBuffer(wrd);
        a.setCharAt(0, wrd.charAt(len - 1));
        a.setCharAt(len - 1, wrd.charAt(0));
        swapwrd = a.toString();
    }

    void sortword() {
        char[] arr = wrd.toCharArray();
        for (int x = 0; x < len - 1; x++)
            for (int y = 0; y < len - 1 - x; y++)
                if (arr[y] > arr[y + 1]) {
                    char tmp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = tmp;
                }
        sortwrd = String.valueOf(arr);
    }

    void display() {
        System.out.println("Word: " + wrd);
        System.out.println("Swapped Word: " + swapwrd);
        System.out.println("Sorted Word: " + sortwrd);
    }

    public static void main(String[] args) {
        SwapSort a = new SwapSort();
        a.readstring();
        a.swapchar();
        a.sortword();
        a.display();
    }
}
/*
 * Variable Description
 * Name | Type | Uses
 * - | - | -
 * ***global***
 * wrd | String | to store entered word
 * swapwrd | String | to store swapped word
 * sortwrt | String | to store swapped word
 * len | int | to store the length of the word
 * ***void readstring()***
 * sc | Scanner | object to take user input
 * ***void swapchar()***
 * a | StringBuffer | temporary string object to interchange characters
 * ***void sortword()***
 * arr | char[] | to store the string as character arry to sort
 * x, y | int | the counter variable to sort the array
 * tmp | char | temporary value to interchange
 * ***void main()***
 * a | SwapSort | Object to call its methods
 */
/*
 * Algorithm
 * #### ***void readstring()***
 * 1. Initialize the scanner object to take user input
 * 2. Store the entered word in 'wrd'
 * 3. Store the length of 'wrd' in 'len'
 * #### ***void swapchar()***
 * 1. Make a StringBuffer 'a' from 'wrd'
 * 2. a.setCharAt(0, wrd.charAt(len - 1))
 * 3. a.setCharAt(len - 1, wrd.charAt(0))
 * 4. swapwrd=a.toString()
 * #### ***void swapword()***
 * 1. Initialize the character array 'arr' from String 'wrd'
 * 2. Start **for** loop with x=0, x<len-1 and x=x+1
 * 3. Start **for** loop with y=0, y<len-1-x and y=y+1
 * 4. Start **if** with condition *arr[y]>arr[y+1]*.
 * 5. Store a character 'tmp' as arr[y]
 * 6. arr[y] = arr[y + 1]
 * 7. arr[y + 1] = tmp
 * 8. End **if**
 * 9. End **for** loop
 * 10. End **for** loop
 * #### ***void display()***
 * 1. Print the original entered word
 * 2. Print the swapped word and sorted word
 * #### ***void main()***
 * 1. Initailize the object of class *SwapSort*
 * 2. Call the method readstring(), swapchar(), sortword() and display()
 */