package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MeetingTest {
    @Test
    public void shouldTestGetterId() {
        Meeting meeting = new Meeting(1, "Тестирование", "Автоматизация", "11.01.2024");

        int expected = 1;
        int actual = meeting.getId();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestGetterTopic() {
        Meeting meeting = new Meeting(1, "Тестирование", "Автоматизация", "11.01.2024");

        String expected = "Тестирование";
        String actual = meeting.getTopic();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestGetterProject() {
        Meeting meeting = new Meeting(1, "Тестирование", "Автоматизация", "11.01.2024");

        String expected = "Автоматизация";
        String actual = meeting.getProject();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestGetterStart() {
        Meeting meeting = new Meeting(1, "Тестирование", "Автоматизация", "11.01.2024");

        String expected = "11.01.2024";
        String actual = meeting.getStart();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMatchesTopic() {
        Meeting meeting = new Meeting(1, "Тестирование", "Автоматизация", "11.01.2024");



        boolean expected = true;
        boolean actual = meeting.matches("Тестирование");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestMatchesNotTopic() {
        Meeting meeting = new Meeting(1, "Тестирование", "Автоматизация", "11.01.2024");

        boolean expected = false;
        boolean actual = meeting.matches("тестирование");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestMatchesProject() {
        Meeting meeting = new Meeting(1, "Тестирование", "Автоматизация", "11.01.2024");

        boolean expected = true;
        boolean actual = meeting.matches("Автоматизация");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestMatchesNotProject() {
        Meeting meeting = new Meeting(1, "Тестирование", "Автоматизация", "11.01.2024");

        boolean expected = false;
        boolean actual = meeting.matches("автоматизация");

        Assertions.assertEquals(expected, actual);
    }

}