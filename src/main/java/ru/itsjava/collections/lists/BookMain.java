package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>(20);
        Book javaPhilosofy = new Book(" Java Philosophy", " Bruce Eckel", 1300);
        Book javaCompleteReference = new Book(" Java Complete Reference", " Herbert Schildt", 1500);
        Book flowersForEldj = new Book(" Цветы для Элджернона", " Дэниел Киз", 500);
        Book grafMonteCristo = new Book(" Граф Монте-Кристо", " Александр Дюма", 800);
        Book annaKarenina = new Book(" Анна Каренина", " Лев Толстой", 1000);
        Book killPeresmeshnik = new Book(" Убить Пересмешника", " Харпер Ли", 900);
        Book sharpObjects = new Book(" Sharp Objects", " Gillian Flynn", 600);
        Book peterPan = new Book(" Peter Pan", " J.M Barrie", 1100);
        Book senseAndSensibility = new Book(" Sense And Sensibility", " Jane Austen", 920);
        Book theFaultInOurStars = new Book(" The Fault in Our Stars", " John Green", 1500);
        Book bloodOfOlympus = new Book(" The Blood of Olympus", " Rick Riordan", 1250);
        Book wutheringHeights = new Book(" Wuthering Heights", " Emily Bronte", 980);
        Book wonderfulWizardOfOz = new Book(" The Wonderful Wizard of Oz", " L. Frank Baum", 780);
        Book goneGirl = new Book(" Gone Girl", " Gillian Flynn", 600);
        Book seducedInTheDark = new Book(" Seduced in The Dark", " C.J Roberts", 830);
        Book fallenCrestHigh = new Book(" Fallen Crest High", " Tijan", 300);
        Book hungerGames = new Book(" The Hunger Games", " Suzanne Collins", 740);
        Book darkProphecy = new Book(" The Dark Prophecy", " Rick Riordan", 860);
        Book lightningThief = new Book(" The Lightning Thief", " Rick Riordan", 1300);
        Book littlePrince = new Book(" The Little Prince", " Antonie de Saint-Exupery", 1000);
        bookList.add(0, javaPhilosofy);
        bookList.add(1, javaCompleteReference);
        bookList.add(1, javaCompleteReference);
        bookList.add(1, javaCompleteReference);
        bookList.add(1, javaCompleteReference);
        bookList.add(1, javaCompleteReference);
        bookList.add(2, flowersForEldj);
        bookList.add(3, grafMonteCristo);
        bookList.add(4, annaKarenina);
        bookList.add(5, killPeresmeshnik);
        bookList.add(6, sharpObjects);
        bookList.add(7, peterPan);
        bookList.add(8, senseAndSensibility);
        bookList.add(9, theFaultInOurStars);
        bookList.add(10, bloodOfOlympus);
        bookList.add(11, wutheringHeights);
        bookList.add(12, wonderfulWizardOfOz);
        bookList.add(13, goneGirl);
        bookList.add(14, seducedInTheDark);
        bookList.add(15, fallenCrestHigh);
        bookList.add(16, hungerGames);
        bookList.add(17, darkProphecy);
        bookList.add(18, lightningThief);
        bookList.add(19, littlePrince);

        System.out.println("bookList.get(0) = " + bookList.get(0));
        System.out.println("bookList.get(19) = " + bookList.get(19));
        bookList.add(2, killPeresmeshnik);
        bookList.add(0, sharpObjects);
        System.out.println("bookList = " + bookList);

        List anotherOneBookList = new ArrayList();
        anotherOneBookList.addAll(bookList);
        System.out.println("anotherOneBookList = " + anotherOneBookList);
        anotherOneBookList.remove(sharpObjects);
        System.out.println("anotherOneBookList = " + anotherOneBookList);
        anotherOneBookList.remove(0);
        System.out.println("anotherOneBookList = " + anotherOneBookList);

    }
}
