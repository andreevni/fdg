package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
// Создал класс книга
public class Book {
    private final String title;
    private final String author;
    private int pagesCount;

    @Override
    public String toString() {
        return " List : [ Book { \"" + title + "\"" + ",\"" + author + " \" , " + pagesCount + "}; ";
    }
}
