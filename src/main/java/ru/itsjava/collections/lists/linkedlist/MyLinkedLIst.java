package ru.itsjava.collections.lists.linkedlist;


public class MyLinkedLIst {
    private Node head;

    public int size() {
        Node curNode = head;
        int count = 0;
        if (head == null) {
            return 0;
        } else {
            count++;
        }

        while (curNode.getNext() != null) {
            count++;
            curNode = curNode.getNext();

        }
        return count;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public boolean contains(Object o) {
        Node curNode = head;
        if (head == null) {
            return false;
        } else if (o == head.getValue()) {
            return true;
        }
        while (curNode.getNext() != null) {
            curNode = curNode.getNext();
            if (curNode.getValue() == o) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null) {
            head = resNode;

        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }

            curNode.setNext(resNode);
        }
        return true;
    }

    public boolean remove(Object o) {
        Node prevNode = head;
        Node curNode = head;
        if (head == null) return false;
        if (head.getValue().equals(o)) {
            head = head.getNext();
            return true;
        }
        if (head.getNext() == null) {
            return false;
        }
        while ((curNode = curNode.getNext()) != null) {
            if (curNode.getValue().equals(o)) {
                break;
            }
            prevNode = prevNode.getNext();
        }
        if (curNode == null) {
            return false;
        }
        prevNode.setNext(curNode.getNext());
        curNode.setNext(null);
        return false;
    }

    public void clear() {
        head = null;

    }

    public Object get(int index) {
        Node curNode = head;
        int count = 0;
        if (index == 0) {
            return head.getValue();
        }
        while ((curNode = curNode.getNext()) != null) {
            count++;
            if (count == index) {
                return curNode.getValue();
            }
        }
        return null;
    }


    public Object set(int index, Object element) {
        Node curNode = head;
        checkIndex(index);
        int count = 0;
        if (head != null && index == 0) {
            head.setValue(element);
            return head.getValue();
        }
        while ((curNode = curNode.getNext()) != null) {
            count++;
            if (count == index) {
                curNode.setValue(element);
                return curNode.getValue();
            }
        }
        return null;
    }

    public void add(int index, Object element) {
        Node resNode = head;
        Node curNode = head;
        int count = 0;
        if (head != null && index == 0) {
            head = head.getNext();
        }


    }

    public Object remove(int index) {
        checkIndex(index);
        if (index == 0) {
            Object resValue = head.getValue();
            if (head.getNext() == null) {
                head = null;
            } else {
                head = head.getNext();
            }
            return resValue;

        }
        Node curNode = head;
        Node prevNode = head;
        int count = 0;
        while ((curNode = curNode.getNext()) != null) {
            count++;
            if (count == index) {
                break;
            }
            prevNode = prevNode.getNext();
        }
        if (curNode == null) return false;
        Object resValue = curNode.getValue();
        if (curNode.getNext() == null) {
            prevNode.setNext(null);
        } else {
            prevNode.setNext(curNode.getNext());
            curNode.setNext(null);
        }
        return resValue;
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index >= 0) && (index <= size())) {
            return true;
        }
        return false;
    }

    public int indexOf(Object o) {
        Node curNode = head;
        int count = 0;
        if (head != null && head.getValue().equals(o)) {
            return count;
        }

        while (curNode.getNext() != null) {
            count++;
            curNode = curNode.getNext();
            if (curNode.getValue().equals(o)) {
                return count;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        Node curNode = head;
        Node resNode = head;
        int count = 0;
        int count2 = 0;
        if (head.getValue().equals(o)) {
            return 0;
        }


        return -1;
    }

    @Override
    public String toString() {
        return "MyLinkedLIst{" +
                "head=" + head +
                '}';
    }
}
