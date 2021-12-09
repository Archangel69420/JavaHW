package com.company;

import java.awt.*;
import java.net.*;
import java.util.*;
import java.security.*;

/* HW 1
2.
- It may include any number of elements. Dynamic size.
- Faster editing time when working with the tail or head of the list.
    (Middle of the list is linear for n elements has to be parsed)
- Stacks and queues can easily be made with linked list for the structure (order) remains constant as elements
    are deleted / inserted.
- No memory wastage, all memory reserved is occupied.
3.
- Consistent search times for elements of a static array can be pointed to by indices.
- Able to store objects and primitive types as elements.
4.
- Collection may only be accessed sequentially. It is impossible to retrieve data from
    collections with a particular index. Moreover, the "pointer" in a collection moves as the user accesses elements
    and must be reset to revisit an element. In a linked list, the "pointer" starts from the heal (or tail if
    specifically command to tail) without needing to call the reset() function.
*/

/* HW 2
1. 1
2. 1, 6
3. 1, 0, 6
4. 1, 0
5. 0
 */

/* HW3
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        Boolean flag = true;
        Boolean end = false;
        while (flag) {
            String next = input.next();
            if (next.equals("!"))
                flag = !flag;
            else words.add(next);
        }
        while (!end) {
            String next = input.next();
            if (next.equals("!"))
                end = !end;
            else {
                for (int i = 0; i < words.size(); i++) {
                    if (words.get(i).equals(next)) {
                        System.out.println("==Hit==");
                        break;
                    }
                }
            }
        }
        System.out.println("Program end");
    }
} */

/* HW 4
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            Boolean flag = false;
            int next = input.nextInt();
            for (int i = 0; i < list.size() && !flag ; i++) {
                if (next == list.get(i)) {
                    list.remove(i);
                    list.addFirst(next);
                    flag = true;
                }
            }
            if (!flag)
                list.addFirst(next);
        }
        System.out.println(list);
        System.out.println("Program completed.");
    }
} */
/* HW 5.1
Trace Table
3   -   -   {5, 3, 1, 0, 0}
3   2   true{5, 3, 1, 1, 0}
4   1   true{5, 3, 3, 1, 0}
4   0   true{5, 5, 3, 1, 0}
4   -1  f   {7, 5, 3, 1, 0}
*/

/* HW 5.2, 5.3, 5.4

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new List<>(new Integer[5]);

        for (int i = 1; !list.isFull() && i < 100; i += 2)
            list.addFirst(i);
        System.out.println(list);

        list.removeLast();
        list.removeLast();
        System.out.println(list);

        // implement these methods
        list.addLast(99);
        list.add(1, -33);
        System.out.println(list);

        // implement methods so that you can uncomment this code
        while (!list.isEmpty())
            System.out.print(list.removeFirst() + " ");
        System.out.println("Done");
    }
}
class List<T> {
    public List(T[] array) {
        elements = array;
        maxSize = array.length;
        size = 0;
    }

    public boolean isFull() {
        return size >= maxSize;
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }

    public void addFirst(T element) {
        for (int i = size - 1; i >= 0; i--)
            elements[i + 1] = elements[i];
        elements[0] = element;
        size++;
    }

    public void addLast(T element) {
        for (int i = 0; i <= size; i++)
            elements[i] = elements[i + 1];
        elements[size - 1] = element;
        size++;
    }

    public void add(int index, T element) {
        for (int i = size - 1; i > index; i--)
            elements[i + 1] = elements[i];
        elements[index] = element;
        size++;
    }

    public T removeLast() {
        size--;
        return elements[size];
    }

    public T removeFirst() {
        T value = elements[0];
        for (int i = 0; i < size - 1; i++)
            elements[i] = elements[i + 1];
        size--;
        return value;
    }

    public String toString() {
        StringBuffer strBuf = new StringBuffer();
        for (int i = 0; i < size; i++) {
            strBuf.append(elements[i]);
            if (i < size - 1)
                strBuf.append(", ");
        }
        return strBuf.toString();
    }

    private int maxSize;
    private int size;
    private T[] elements;
} */
/* HW 6
public class Main {
    public static void main(String[] args) {
        LinkedList<LinkedList<Integer>> someList = new LinkedList<>();
        someList.add(new LinkedList<>(Arrays.asList(4, 5, 2, 1, 5, 7)));
        someList.add(new LinkedList<>(Arrays.asList(3, 2, 1, 5, 7, 4)));
        someList.add(new LinkedList<>(Arrays.asList(6, 2, 7, 1)));
        someList.add(new LinkedList<>(Arrays.asList(0, 9, 2, 65, 3, 67)));
        System.out.println(someList);
        System.out.println(flatten(someList));
        System.out.println(someList);
    }

    public static LinkedList<Integer> flatten (LinkedList<LinkedList<Integer>> input) {
        LinkedList<Integer> list = new LinkedList<>();
        for (LinkedList<Integer> in : input) {
            while (in.size() > 0)
                    list.add(in.remove());
        }
        return list;
    }
} */