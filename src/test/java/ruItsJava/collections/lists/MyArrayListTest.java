package ruItsJava.collections.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.collections.lists.arraylist.MyArrayList;

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
        Assertions.assertEquals(4, actualList.size());

    }

    @DisplayName("Check isEmpty method: ")
    @Test
    public void checkIsEmpty() {
        MyArrayList actualList = new MyArrayList();
        actualList.add("Elem1");
        Assertions.assertEquals(actualList.isEmpty(), false);

    }

    @DisplayName("Check contains method: ")
    @Test
    public void checkContains() {
        MyArrayList actualList = new MyArrayList();
        actualList.add("Elem1");
        Assertions.assertEquals(actualList.contains("Elem1"), true);
        Assertions.assertEquals(actualList.contains("ELem21"), false);

    }

    @DisplayName("Try get method: ")
    @Test
    public void shouldHaveGetMethod() {
        MyArrayList actualList = new MyArrayList();
        actualList.add("Elem1");
        actualList.add("Elem2");
        actualList.add("Elem3");
        actualList.add("Elem4");
        Assertions.assertEquals(actualList.get(0), "Elem1");
        Assertions.assertEquals(actualList.get(5), null);
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
        Assertions.assertEquals(actualList.get(1), "Hello from jUnit!");
        actualList.set(5, "Out!");
        Assertions.assertEquals(actualList.get(5), null);
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
        Assertions.assertEquals(actualList.get(2), "Elem4");
        Assertions.assertEquals(actualList.get(4), "Elem6");
        Assertions.assertEquals(actualList.size(), 5);

    }

    @DisplayName("Check how works add() :")
    @Test
    public void shouldHaveAddMethod() {
        MyArrayList actualList = new MyArrayList();
        actualList.add("Elem1");
        Assertions.assertEquals(actualList.add("Element2"), true);
        Assertions.assertEquals(actualList.size(), 2);
    }


}
