import java.util.*;

class Node {
    protected int data;
    protected Node next = null;

    public Node() {
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    void setData(int data) {
        this.data = data;
    }

    void setLink(Node link) {
        this.next = link;
    }

    Node getLink() {
        return next;
    }

    int getData() {
        return data;
    }
}

class Stack {
    protected Node top = null;

    public void push(int val) {
        // Currently we have set no limits to pushing elements
        Node nptr = new Node(val, top);
        top = nptr;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack Underflow");
        } else {
            int val = top.getData();
            top = top.getLink();
            return val;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void show() {
        Node ptr = top;
        while (ptr != null) {
            System.out.printf("%d, ", ptr.getData());
            ptr = ptr.getLink();
        }
    }
}

public class MatchParenStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter string to Match Parenthesis:\n");
        String val = sc.nextLine();
        Stack stk = new Stack();
        for (int x = 0; x < val.length(); x++) {
            char ch = val.charAt(x);
            if (ch == '(')
                stk.push(x);
            else if (ch == ')')
                try {
                    int ind = stk.pop();
                    System.out.printf("The ) at index %d matched with ( at index %d\n", x, ind);
                } catch (Exception e) {
                    System.out.printf("The ) at index %d is UNMATCHED!!\n", x);
                }
        }
        while (!stk.isEmpty()) {
            try {
                System.out.printf("The ( at index %d is UNMATCHED!!\n", stk.pop());
            } catch (Exception e) {
            }
        }
        sc.close();
    }
}
/*
 * Variable Description
 * Name | Type | Uses
 * - | - | -
 * **Class Node**
 * ***global***
 * data | int | value to be stored in the current node
 * link | Node | pointer for the next node
 * **Class Stack**
 * ***global***
 * top | Node | topmost element in the stack
 * ***public void push(int val)***
 * nptr | Node | to store the new pointer which will eventually become the top
 * ***public int pop()***
 * val | int | to temporarily store data of the top most element to be returned
 * ***public void show()***
 * ptr | Node | a pointer to be used in the loop to traverse in the stack
 * **Class MatchParenStack**
 * ***void main()***
 * sc | Scanner | object to accept user input
 * val | String | to store entered expression to evaluate
 * stk | Stack | a stack data type object to help us in parenthesis matching
 * x | int | counter variable to iterate over 'val'
 * ch | char | to store current extracted character
 */
/*
 * Algorithm
 * <div class="java_class">Class Node</div>
 * #### ***public Node(int d, Node next)***
 * 1. data=d, data
 * 2. link=next, to store the link to the next node
 * #### ***public void setLink(Node n)***
 * 1. link=n, set the link to the next node
 * #### ***public void setData(int d)***
 * 1. data=d, set the value of current Node
 * #### ***public int getData()***
 * 1. return data(value of the current node)
 * #### ***public Node getLink()***
 * 1. return link
 * <div class="java_class">Class Stack</div>
 * #### ***public void push(int val)***
 * 1. Create a Node nptr with value of 'val' and 'top' as its link(next
 * element)
 * 2. top=nptr
 * #### ***public int pop()***
 * 1. If isEmpty() returns true then throw a *Exception* with message
 * "Stack Underflow"
 * 2. Start **else**
 * 3. Store val=top.getData()
 * 4. top=top.getLink()
 * 5. return val
 * 6. End **else**
 * #### ***public boolean isEmpty()***
 * 1. if top==null then return true else return false
 * #### ***public void show()***
 * 1. Initailize a Node ptr=top
 * 2. Start **while** loop with condition *ptr!=null*
 * 3. Print ptr.getData()
 * 4. ptr=ptr.getLink() (going to the next element in the stack)
 * 5. End **while** loop
 * <div class="java_class">Class MatchParenStack</div>
 * #### ***void main()***
 * 1. Initaialize a Scanner object to accept user input
 * 2. Enter the *expression* for parenthesis matching into String 'val'
 * 3. Initialize a Stack object '*stk*'
 * 4. Start **for** loop with x=0, x<val.length() and x=x+1
 * 5. Store ch=val.charAt(x)
 * 6. if ch=='(' then stk.push(x)
 * 7. else if ch==')' then print the curent index where it has been found and
 * position from which it has been matched by calling stk.pop() to get that
 * location. in this process if an exception is encountered then this means that
 * the ')' is not matched so print the message accordingly.
 * 8. End **for** loop
 * 9. Start **while** loop with condition *!stk.isEmpty()*
 * 10. Print the location where '(' has been matched by calling the method stk.pop()
 * 11. End **while** loop
 */