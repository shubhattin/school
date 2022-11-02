import java.util.*;

class Node {
    protected char data;
    protected Node next = null;

    public Node() {
    }

    public Node(char data, Node next) {
        this.data = data;
        this.next = next;
    }

    void setData(char data) {
        this.data = data;
    }

    void setLink(Node link) {
        this.next = link;
    }

    Node getLink() {
        return next;
    }

    char getData() {
        return data;
    }
}

class Stack {
    protected Node top = null;

    public void push(char val) {
        // Currently we have set no limits to pushing elements
        Node nptr = new Node(val, top);
        top = nptr;
    }

    public char pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack Underflow");
        } else {
            char val = top.getData();
            top = top.getLink();
            return val;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }
}

class Convert {
    private char[] BEDMAS = { '-', '+', '*', '/', '^' };
    private int[] BEDMAS_PREC = { 0, 0, 1, 1, 2 };
    // Not Exactly follwing the BEADMAS rule here, but going with operator
    // precedence rules
    // To use BEDMAS to convert don't use BEDMAS_PREC and directly get the index
    // from BEDMAS
    private char[] data;

    public Convert(String str) {
        data = str.toCharArray();
    }

    public String getPostfix() throws Exception {
        String res = "";
        Stack stk = new Stack();
        int prv = -1; // storing previous precedence for comparision
        boolean first_op = true;
        boolean bracket = false;
        for (int x = 0; x < data.length; x++) {
            char ch = data[x];
            int prec = isBeadmasOperator(ch);
            if (prec == -1) {
                if (ch == '(') {
                    first_op = true;
                    bracket = true;
                    stk.push(ch);
                } else if (ch == ')')
                    try {
                        for (char op = stk.pop(); op != '('; op = stk.pop())
                            res += op;
                        bracket = false;
                    } catch (Exception e) {
                        throw new Exception("Invalid Expression");
                    }
                else
                    res += ch;
            } else if (prec != -1) { // BEDMAS operaator detected
                if (prv >= prec && !first_op)
                    while (!stk.isEmpty()) {
                        char vl = stk.pop();
                        if (vl == '(' && bracket) {
                            stk.push(vl);
                            break;
                        }
                        res += vl;
                    }
                stk.push(ch);
                prv = prec;
                first_op = false;
            }
        }
        while (!stk.isEmpty()) {
            char vl = stk.pop();
            if (vl == '(' && bracket)
                throw new Exception("Invalid Expression");
            res += vl;
        }
        return res;

    }

    private int isBeadmasOperator(char ch) {
        for (int x = 0; x < BEDMAS.length; x++)
            if (BEDMAS[x] == ch)
                return BEDMAS_PREC[x];
        return -1;
    }
}

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Infix Expression:");
        String val = sc.nextLine();
        Convert obj = new Convert(val);
        try {
            System.out.printf("Converted Postfix Expression:\n%s\n", obj.getPostfix());
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
 * data | char | value to be stored in the current node
 * link | Node | pointer for the next node
 * **Class Stack**
 * ***global***
 * top | Node | topmost element in the stack
 * ***public void push(int val)***
 * nptr | Node | to store the new pointer which will eventually become the top
 * ***public int pop()***
 * val | char | to temporarily store data of the top most element to be returned
 * ***public void show()***
 * ptr | Node | a pointer to be used in the loop to traverse in the stack
 * **Class Convert**
 * ***global***
 * BEDMAS | char[] | BEDMAS Oprtaor i.e. -,+,*,/,^
 * BEDMAS_PREC | int[] | the precedence of the 'BEDMAS' operator
 * data | char[] | to store the entered expression as character array
 * ***public String getPostfix()***
 * res | String | to store resultant postfix expresion
 * prv | int | storing the precedence value of previous encountered operator
 * first_op | boolean | indicates start of the expression or '(' bracket
 * bracket | boolean | status if the current index is index a bracket
 * ch | char | to store the character at the current index
 * prec | int | precision value of the current character
 */
/*
 * Algorithm
 * <div class="java_class">Class Node</div>
 * #### ***public Node(char d, Node next)***
 * 1. data=d, data
 * 2. link=next, to store the link to the next node
 * #### ***public void setLink(Node n)***
 * 1. link=n, set the link to the next node
 * #### ***public void setData(char d)***
 * 1. data=d, set the value of current Node
 * #### ***public int getData()***
 * 1. return data(value of the current node)
 * #### ***public Node getLink()***
 * 1. return link
 * <div class="java_class">Class Stack</div>
 * #### ***public void push(char val)***
 * 1. Create a Node nptr with value of 'val' and 'top' as its link(next
 * element)
 * 2. top=nptr
 * #### ***public char pop()***
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
 * <div class="java_class">Class Convert</div>
 * #### ***public Convert(String str)***
 * 1. data = str.toCharArray()
 * #### ***String getPostfix()***
 * 1. Initialize a String res to store the final output
 * 2. Initaialize a Stack 'stk'
 * 3. Store first_op=true
 * 4. Store bracket=false
 * 5. Start **for** loop with x=0, x<data.length, x=x+1
 * 6. Store character ch=data[x]
 * 7. Store integer prec=isBodmasOperrator(ch)
 * 8. Start **if** with prec==-1
 * 9. Start **if** with ch=='('
 * 10. first_op=true
 * 11. bracket=true
 * 12. stk.push(ch)
 * 13. End **if**
 * 14. Start **else if** with ch==')'
 * 15. Start **for** loop with op=stk.pop(), op!='(' and op=stk.pop()
 * 16. res=res+ch
 * 17. End **for** loop
 * 18. If while executing **this** block of code exception ocuurs then throw a
 * Exception with message "Invalid Expression"
 * 19. End **if else**
 * 20. **else** res=res+ch
 * 21. End **if**
 * 22. Start **if else** with condition prec!=-1 (i.e. a BEDMAS operator is
 * detected)
 * 23. Start **if** with prv>=prec and !first_op
 * 24. Start **while** loop with condition !stk.isEmpty()
 * 25. Store character vl=stk.pop()
 * 26. if vl=="(" and bracket is true then stk.push(vl) and **break**
 * 27. res=res+vl
 * 28. End **while** loop
 * 29. End **if**
 * 30. stk.push(ch)
 * 31. prv=prec
 * 32. first_op=false
 * 33. End **if else**
 * 34. End **for** loop
 * 35. Start **while** loop with !stk.isEmpty()
 * 36. Store vl=stk.pop()
 * 37. if vl=='(' and bracket is true then throw an Eception with message
 * "Invalid Expression"
 * 38. res=res+vl
 * 39. End **while**
 * 40. return res
 * #### ***private int isBeadmasOperator(char ch)***
 * 1. Start **for** loop with x=0, x<BEDMAS.length and x=x+1
 * 2. if BEDMAS[x] == ch then retuen BEDMAS_PREC[x]
 * 3. End **for** loop
 * 4. return -1, as no operator detected.
 * <div class="java_class">Class InfixToPostfix</div>
 * #### ***void main()***
 * 1. Initialize the Scanner object to accept user input
 * 2. Input the Infix Expression in 'val'
 * 3. Initialize a object 'obj' of class Convert with 'val' as parameter
 * 4. Print the converted Postfix Expression by using obj.getPostfix() if error
 * is encounterd print the error message
 */