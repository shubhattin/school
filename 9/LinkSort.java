import java.util.*;

class Node {
    protected int data = 0;
    protected Node link = null;

    public Node() {
    }

    public Node(int d, Node next) {
        data = d;
        link = next;
    }

    public void setLink(Node n) {
        link = n;
    }

    public void setData(int d) {
        data = d;
    }

    public int getDeta() {
        return data;
    }

    public Node getLink() {
        return link;
    }
}

class linkedList {
    protected Node start = null;

    public boolean isEmpty() {
        return start == null;
    }

    public void insert(int val) {
        Node nptr = new Node(val, null);
        if (isEmpty()) {
            start = nptr;
        } else if (val <= start.getDeta()) {
            nptr.setLink(start);
            start = nptr;
        } else {
            Node ptr = start.getLink(), save;
            save = start;
            while (ptr != null) {
                if (val >= save.getDeta() && val <= ptr.getDeta()) {
                    save.setLink(nptr);
                    nptr.setLink((ptr));
                    return;
                } else {
                    save = ptr;
                    ptr = ptr.getLink();
                }
            }
            save.setLink(nptr);
        }
    }

    public void show() {
        System.out.println("Sorted LinkedList");
        Node ptr = start;
        for (; ptr.getLink() != null; ptr = ptr.getLink())
            System.out.printf("%d --> ", ptr.getDeta());
        System.out.printf("%d !!!!\n", ptr.getDeta());
    }
}

public class LinkSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedList list = new linkedList();
        System.out.println("Enter Numbers to insert in list: ");
        for (int x = 1; x <= 5; x++) {
            int num = sc.nextInt();
            list.insert(num);
            System.out.printf("Inserted: %s\n", num);
        }
        list.show();
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
 * **Class linkedList**
 * ***global***
 * start | Node | stores the pointer to starting node of the linked list
 * ***public void insert()***
 * val | int | **argument** :- the value to be inserted in linked list
 * nptr | Node | node made using the value '*val*' to insert in the list
 * ptr | Node | used as a temporary pointer to traverse the linked list
 * save | Node | to store pointer of the previous Node
 * ***public void show()***
 * ptr | Node | used as a temporary pointer to traverse the linked list
 * **Class LinkSort**
 * ***void main()***
 * sc | Scanner | object to take user input
 * list | linkedList | object to store our linked auto-sorted linked list
 * num | int | to store enetred number
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
 * <div class="java_class">Class linkedList</div>
 * #### ***boolean is_empty()***
 * 1. return true if start is equal to null else return false
 * #### ***void insert(int val)***
 * 1. Initialize a Node nptr with value 'val' and link=null
 * 2. *If* isEmpty() is true then *start=nptr**, i.e. if the starting element of
 * the list is null then new pointer created wiil have to be our starting
 * pointer.
 * 3. *Else If* val<=start.getLik() then *nptr.setLink(start)* and *start=nptr*.
 * So if the value is smaller than the value in the start node then nptr should
 * be our first node.
 * 4. Start **else**
 * 5. Store Node ptr=start.getLink()
 * 6. Store Node save=start (the previous node)
 * 7. Start **while** loop with condition ptr!=null
 * 8. Start **if** with val >= save.getDeta() and val <= ptr.getDeta() (condition for the required location)
 * 9. save.setLink(nptr) (connect the previous node to the new node)
 * 10. nptr.setLink(ptr) (connect the new node to the current node)
 * 11. return
 * 12. End **if**
 * 13. Start **else**
 * 14. save=ptr (storing previous node for later use)
 * 15. ptr=ptr.getLink()
 * 14. End **else**
 * 15. End **while** loop
 * 16. save.setLink(nptr) (connecting the previous node to the new node)
 * 17. End **else**
 * #### ***publlic void show()***
 * 1. Initialize a Node ptr=start
 * 2. Start a **for** loop with '', ptr.getLink()!=null and ptr=ptr.getLink()
 * 3. Print ptr.getata()
 * 4. End **for** loop
 * 5. Print ptr.getata()
 * <div class="java_class">Class LinkSort</div>
 * #### ***void main()***
 * 1. Initialize the Scanner object to take user input.
 * 2. Create a linkedList named 'list'
 * 3. Start **for** loop with x=1, x<=5 and x=x+1
 * 4. Enter a number into 'num' which will be inserted in the linkedList 'list'
 * 5. list.insert(num)
 * 6. Prin the inserted number
 * 7. End **for** loop
 * 8. list.show()
 */