package exercises;

import edu.touro.mcon264.apps.collections.LinkedCollection;


public class ExtendedLinkedCollection<T> extends LinkedCollection<T> {
    class Node {
        String data;   // the value stored in this node
        Node next;     // reference to the next node
Node head;
        // Constructor
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    @Override
    public String toString() {
        // TODO: traverse nodes from 'head'
        // build a string like "[A, B, C]"
        StringBuilder str = new StringBuilder();

        str.append("[");
        Node current = head;           // start at head
        while (current != null) {
            str.append(current.data);   // add node’s data
            if (current.next != null) {
                str.append(", ");       // add comma if not last
            }
            current = current.next;    // move to next node
        }

        str.append("]");                // closing bracket
        return str.toString();
    }

    public int count(T target) {
        int count=0;
        Node current = head;
        while (current != null) {
            if (current.data.equals(target)) {
                count++;
            }

            current = current.next; // move to next node
        }

        return count;
    }




    public int removeAll(T target) {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (current.data.equals(target)) {
                remove((T) current.data);
                count++;
            }
            current = current.next; // move to next node
        }
        return count;
    }
}
