package ruItsJava.collections.lists;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.collections.lists.arraylist.MyArrayList;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Class MyArrayList")
public class MyArrayListTest {

    @DisplayName("Check size() method: ")
    @Test
    public void checkSizeMethod() {
        MyArrayList actualList = new MyArrayList();
        actualList.add("Elem1");
        actualList.add("Elem2");
        actualList.add("Elem3");
        actualList.add("Elem4");
        assertEquals(4, actualList.size());

    }

    @DisplayName("Check isEmpty method: ")
    @Test
    public void shouldCheckIsEmpty() {
        MyArrayList actualList = new MyArrayList();
        actualList.add("Elem1");
        assertEquals(actualList.isEmpty(), false);

    }

    @DisplayName("Check contains method: ")
    @Test
    public void shouldHaveContains() {
        MyArrayList actualList = new MyArrayList();
        actualList.add("Elem1");
        assertAll("check contains", () -> assertEquals(actualList.contains("Elem1"), true),
                () -> assertEquals(actualList.contains("ELem21"), false));

    }

    @DisplayName("Try get method: ")
    @Test
    public void shouldHaveGetMethod() {
        MyArrayList actualList = new MyArrayList();
        actualList.add("Elem1");
        actualList.add("Elem2");
        actualList.add("Elem3");
        actualList.add("Elem4");
        assertEquals(actualList.get(0), "Elem1");
    }

    @DisplayName("Try set method: ")
    @Test
    public void shouldHaveSetMethod() {
        MyArrayList actualList = new MyArrayList();
        actualList.add("Elem1");
        actualList.add("Elem2");
        actualList.add("Elem3");
        actualList.add("Elem4");
        actualList.set(1, "Hello from jUnit!");
        assertEquals(actualList.get(1), "Hello from jUnit!");
    }

    @DisplayName("Try to remove() objects and check how array decrease: ")
    @Test
    public void shouldRemoveObjectsAndDecrease() {
        MyArrayList actualList = new MyArrayList();
        actualList.add("Elem1");
        actualList.add("Elem2");
        actualList.add("Elem3");
        actualList.add("Elem4");
        actualList.add("Elem5");
        actualList.add("Elem6");
        actualList.add("Elem7");
        actualList.remove(2);
        actualList.remove(5);
        assertAll("remove obj and decrease", () -> assertEquals(actualList.get(2), "Elem4"),
                () -> assertEquals(actualList.get(4), "Elem6"), () -> assertEquals(actualList.size(), 5));

    }

    @DisplayName("Check how works add() :")
    @Test
    public void shouldHaveAddMethod() {
        MyArrayList actualList = new MyArrayList();
        actualList.add("Elem1");
        assertAll("check add", () -> assertEquals(actualList.add("Element2"), true),
                () -> assertEquals(actualList.size(), 2));
    }

}
