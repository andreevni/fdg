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
        bookList.add(javaPhilosofy);
        bookList.add(javaCompleteReference);
        bookList.add(javaCompleteReference);
        bookList.add(javaCompleteReference);
        bookList.add(javaCompleteReference);
        bookList.add(javaCompleteReference);
        bookList.add(flowersForEldj);
        bookList.add(grafMonteCristo);
        bookList.add(annaKarenina);
        bookList.add(killPeresmeshnik);
        bookList.add(sharpObjects);
        bookList.add(peterPan);
        bookList.add(senseAndSensibility);
        bookList.add(theFaultInOurStars);
        bookList.add(bloodOfOlympus);
        bookList.add(wutheringHeights);
        bookList.add(wonderfulWizardOfOz);
        bookList.add(goneGirl);
        bookList.add(seducedInTheDark);
        bookList.add(fallenCrestHigh);
        bookList.add(hungerGames);
        bookList.add(darkProphecy);
        bookList.add(lightningThief);
        bookList.add(littlePrince);

//  Получил книгу по первому индексу
        System.out.println("bookList.get(0) = " + bookList.get(0));
//  Получил книгу под последним индексом 23 , так как выше были добавлены 5 элементов.
        System.out.println("bookList.get(23) = " + bookList.get(23));
//  Добавил 6 элемент на 3 позицию
        bookList.add(2, flowersForEldj);
// Добавил 7 элемент на 1 позицию
        bookList.add(0, grafMonteCristo);
        System.out.println("bookList = " + bookList);
//  Cоздал новый лист
        List anotherOneBookList = new ArrayList();
//  Скопировал в новый лист , обьекты из старого через addAll()
        anotherOneBookList.addAll(bookList);
        System.out.println("anotherOneBookList = " + anotherOneBookList);
//  Ремувнул по значению
        anotherOneBookList.remove(sharpObjects);
//   Проверил
        System.out.println("anotherOneBookList = " + anotherOneBookList);
//  Ремувнул по индексу
        anotherOneBookList.remove(0);
//  Проверил удаление по индексу и в классе Book поменял вывод метода toString(), чтобы был вывод к примере
        System.out.println("anotherOneBookList = " + anotherOneBookList);

    }
}
