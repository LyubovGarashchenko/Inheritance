package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import ru.netology.statistic.SimpleTask;
import ru.netology.statistic.Task;

public class TaskTest {
    @Test
    public void shouldTestHashCode() {
        Task task = new Task(2);


        int expected = 2;
        int actual = hashCode();

        System.out.println(task.hashCode());
    }

    @Test
    public void shouldTestGetterId() {
        Task task = new Task(2);

        int expected = 2;
        int actual = task.getId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMatches() {
        SimpleTask simpleTask = new SimpleTask(45, "Купить хлеб");

        boolean expected = true;
        boolean actual = simpleTask.matches("хлеб");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestNotMatches() {
        Task task = new Task("Купить Хлеб");

        boolean expected = false;
        boolean actual = task.matches("Купить яйца");

        Assertions.assertEquals(expected, actual);
    }

}