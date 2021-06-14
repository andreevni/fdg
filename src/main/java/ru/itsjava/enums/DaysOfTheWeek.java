package ru.itsjava.enums;

public enum DaysOfTheWeek {
    SUNDAY("Воскресенье") , MONDAY ("Понедельник") , TUESDAY ("Вторник") ,
    WEDNESDAY("Среда") , THURSDAY("Четверг") , FRIDAY("Пятница") , SATURDAY("Суббота");

    private final String daysTranslate;
    DaysOfTheWeek(String daysTranslate) {
        this.daysTranslate = daysTranslate;
    }

    @Override
    public String toString() {
        return "DaysOfTheWeek { " +
                "daysTranslate= \"" + daysTranslate + "\" " +
                "}";
    }
}
