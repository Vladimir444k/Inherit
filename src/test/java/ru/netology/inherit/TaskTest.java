package ru.netology.inherit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void testFoundedSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("Позвонить");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testNotFoundedSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("позвонить");
        Assertions.assertFalse(actual);
    }

    @Test
    public void testFoundedEpic() {
        Epic epic = new Epic(6, new String[]{"Как дела"});
        boolean actual = epic.matches("Как");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testNotFoundedEpic() {
        Epic epic = new Epic(6, new String[]{"Как дела"});
        boolean actual = epic.matches("Что");
        Assertions.assertFalse(actual);
    }

    @Test
    public void testFoundedMeeting() {
        Meeting meeting = new Meeting(45, "Молоко", "Магазин", "Начало");
        boolean actual = meeting.matches("Молоко");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testNotFoundedMeeting() {
        Meeting meeting = new Meeting(45, "Молоко", "Магазин", "Начало");
        boolean actual = meeting.matches("Milk");
        Assertions.assertFalse(actual);
    }
}