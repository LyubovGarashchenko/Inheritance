package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTaskTest {
    @Test
    public void shouldTestMethodMatches() {
        SimpleTask simpleTask = new SimpleTask(2,"Сделать отчёт");

        boolean expected = true;
        boolean actual = simpleTask.matches("отчёт");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestMethodNotMatches() {
        SimpleTask simpleTask = new SimpleTask(2,"Сделать отчёт");

        boolean expected = false;
        boolean actual = simpleTask.matches("Отчёт");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestGetterTittle() {
        SimpleTask simpleTask = new SimpleTask(2,"Сделать отчёт");

        String expected = "Сделать отчёт";
        String actual = simpleTask.getTitle();

        Assertions.assertEquals(expected, actual);
    }
}