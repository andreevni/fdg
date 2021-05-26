package ruItsJava.collections.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.collections.lists.linkedlist.MyLinkedList;

@DisplayName("Class MyLinkedList")
public class MyLinkedListTest {
    @DisplayName("Check size : ")
    @Test
    public void shouldHaveCorrectSizeMethod() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("String1");
        linkedList.add("String2");
        Assertions.assertEquals(linkedList.size(), 2);
    }

    @DisplayName("Check Add method : ")
    @Test
    public void shouldHaveCorrectAdd() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("String1");
        linkedList.add("String2");
        Assertions.assertEquals(linkedList.size(), 2);

    }

    @DisplayName("Check how to work get() : ")
    @Test
    public void shouldHaveGetMethod() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("String1");
        linkedList.add("String2");
        linkedList.add("String3");
        linkedList.add("String4");
        Assertions.assertEquals(linkedList.get(0), "String1");
        Assertions.assertEquals(linkedList.get(1), "String2");
        Assertions.assertEquals(linkedList.get(3), "String4");
        Assertions.assertEquals(linkedList.get(4), null);
    }

    @DisplayName("Check clear method : ")
    @Test
    public void shouldHaveCorrectClearMethod() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("String1");
        linkedList.add("String2");
        linkedList.add("String3");
        linkedList.add("String4");
        linkedList.clear();
        Assertions.assertEquals(linkedList.size(), 0);
    }

    @DisplayName("Check IsEmpty method : ")
    @Test
    public void shouldHaveCorrectIsEmptyMethod() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("String1");
        linkedList.add("String2");
        Assertions.assertEquals(linkedList.isEmpty(), false);
        linkedList.clear();
        Assertions.assertEquals(linkedList.isEmpty(), true);
    }

    @DisplayName("Check how work contains() : ")
    @Test
    public void shouldHaveCorrectContainsMethod() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("String1");
        linkedList.add("String2");
        linkedList.add("String3");
        linkedList.add("String4");
        Assertions.assertTrue(linkedList.contains("String1"));
        Assertions.assertTrue(linkedList.contains("String3"));
        Assertions.assertTrue(linkedList.contains("String4"));
        Assertions.assertFalse(linkedList.contains("String25"));
    }

    @DisplayName("Check how work remove() : ")
    @Test
    public void shouldHaveCorrectRemove() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("String1");
        linkedList.add("String2");
        linkedList.add("String3");
        linkedList.add("String4");
        linkedList.remove("String1");
        linkedList.remove("String4");
        linkedList.remove("String3");
        Assertions.assertEquals(linkedList.size(), 1);
    }

    @DisplayName("Check how work set() : ")
    @Test
    public void shouldHaveCorrectSetMethod() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("String1");
        linkedList.add("String2");
        linkedList.add("String3");
        linkedList.add("String4");
        linkedList.set(0, "String21");
        linkedList.set(2, "String22");
        linkedList.set(3, "String23");
        Assertions.assertEquals(linkedList.get(0), "String21");
        Assertions.assertEquals(linkedList.get(2), "String22");
        Assertions.assertEquals(linkedList.get(3), "String23");
    }


}
