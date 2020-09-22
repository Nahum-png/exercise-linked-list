package uaslp.enginering.labs.list;

public class LinkedList {
    private Node Front;
    private Node Tail;

    public enum InsertPosition {
        BEFORE,
        AFTER
    }

    public class Iterator {
        public Node field;

        public Node method(Node node) {
            return (node);
        }

        public boolean hasNext() {
            return false;
        }

        public Student next() {
            return null;
        }
    }

    public Node getFront() {
        return Front;
    }

    public void setFront(Node front) {
        Front = front;
    }

    public Node getTail() {
        return Tail;
    }

    public void setTail(Node tail) {
        Tail = tail;
    }

    public void add(Student student) {

    }

    public void delete(Student student) {

    }

    public void delete(int index) {

    }

    public Iterator getIterator() {
        return (null);
    }

    public Integer size() {
        return (null);
    }

    public Student getAt(int index) {
        return (null);
    }

    public void insert(Student reference, Student newStudent, InsertPosition insertPosition) {

    }
}
