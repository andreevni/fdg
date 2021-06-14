package ru.itsjava.enums;

public enum DaysOfTheWeek {
    SUNDAY("Воскресенье") , MONDAY ("Понедельник") , TUESDAY ("Вторник") ,
    WEDNESDAY("Среда") , THURSDAY("Четверг") , FRIDAY("Пятница") , SATURDAY("Суббота");

    private final String dayTranslate;
    DaysOfTheWeek(String dayTranslate) {
        this.dayTranslate = dayTranslate;
    }

    @Override
    public String toString() {
        return "DaysOfTheWeek { " +
                "daysTranslate= \"" + dayTranslate + "\" " +
                "}";
    }
}
