package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EpicTest {
    @Test
    public void shouldTestSubtask() {
        Epic epic = new Epic(3, new String[]{"Купить Молоко"});

        boolean expected = true;
        boolean actual = epic.matches("Купить Молоко");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestNotSubtask() {
        Epic epic = new Epic(3, new String[]{"Купить Молоко"});

        boolean expected = false;
        boolean actual = epic.matches("Купить молоко");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestGetSubtasks(){
        Epic epic = new Epic(3, new String[]{"Купить Молоко"});

        String[] expected = {"Купить Молоко"};
        String[] actual = epic.getSubtasks();

        Assertions.assertArrayEquals(expected, actual);
    }

}