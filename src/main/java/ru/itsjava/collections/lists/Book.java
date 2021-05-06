package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private final String bookTitle;
    private final String bookAuthor;
    private int howManyPages;

    @Override
    public String toString() {
        return " List : [ Book { \"" + bookTitle + "\"" + ",\"" + bookAuthor + " \" , " + howManyPages + "}; ";
    }
}
