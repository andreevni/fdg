package ruItsJava.collections.lists;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.git.Person;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Class Person")
public class PersonTest {
    @DisplayName("Check Get Method : ")
    @Test
    public void checkGetMethod() {
        Person actualPerson = new Person("Vanya", 21);
        assertAll("tryGetters", () -> assertEquals("Vanya", actualPerson.getName()),
                () -> assertEquals(21, actualPerson.getAge()));
    }

    @DisplayName("check correct work of method takeBeer() : ")
    @Test
    public void shouldCheckAgeForSellBeer() {
        Person actualPerson1 = new Person("Vova", 19);
        Person actualPerson2 = new Person("Vitya", 15);

        assertAll("differentPersonAges", () -> assertEquals(actualPerson1.takeBeer(), true),
                () -> assertEquals(actualPerson2.takeBeer(), false));
    }

    @DisplayName(" should add age :")
    @Test
    public void shouldAddAge() {
        Person actualPerson1 = new Person("Vova", 19);
        actualPerson1.birthday();
        assertEquals(actualPerson1.getAge(), 20);
    }

}
