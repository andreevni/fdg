package ruItsJava.collections.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.collections.lists.Watch;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Class Watch must : ")
public class WatchTest {

    public static final String DEFAULT_FIRM = "Seiko";
    public static final String DEFAULT_AUTHOR = "Vova";
    public static final double DEFAULT_PRICE = 10000.0;
    public static final String NEW_AUTHOR = "Mary";

    @DisplayName("  make correct constructor")
    @Test
    public void shoudHaveCorrectConstructor() {
        Watch actualWatch = new Watch(DEFAULT_FIRM, DEFAULT_AUTHOR, DEFAULT_PRICE);

//        Assertions.assertEquals(DEFAULT_FIRM, actualWatch.getFirm());
//        Assertions.assertEquals(DEFAULT_AUTHOR, actualWatch.getAuthor());
//        Assertions.assertEquals(DEFAULT_PRICE, actualWatch.getPrice());

        assertAll("actualWatch", () -> assertEquals(DEFAULT_FIRM, actualWatch.getFirm()),
                () -> assertEquals(DEFAULT_AUTHOR, actualWatch.getAuthor()),
                () -> assertEquals(DEFAULT_PRICE, actualWatch.getPrice()));

    }

    @DisplayName(" must change author correct")
    @Test
    public void shouldHaveCorrectUpdateWatch() {
        Watch actualWatch = new Watch(DEFAULT_FIRM, DEFAULT_AUTHOR, DEFAULT_PRICE);

        actualWatch.setAuthor(NEW_AUTHOR);

        Assertions.assertEquals(NEW_AUTHOR, actualWatch.getAuthor());
    }
}
