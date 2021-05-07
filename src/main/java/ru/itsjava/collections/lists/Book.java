package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
// Создал класс книга
public class Book {
    private final String title;
    private final String author;
    private final int pagesCount;

    @Override
    public String toString() {
        return " List : [ Book { \"" + title + "\"" + ",\"" + author + " \" , " + pagesCount + "}; ";
    }
}
