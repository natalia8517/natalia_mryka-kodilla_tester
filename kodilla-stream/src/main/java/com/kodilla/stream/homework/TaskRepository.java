package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasksList = new ArrayList<>();
        tasksList.add(new Task("getFood", LocalDate.of(2020, 12, 01), LocalDate.of(2020, 12, 01)));
        tasksList.add(new Task("writeBook", LocalDate.of(2019, 12, 01), LocalDate.of(2020, 12, 10)));
        tasksList.add(new Task("finishCourse", LocalDate.of(2020, 12, 10), LocalDate.of(2021, 02, 25)));
        tasksList.add(new Task("getNewJob", LocalDate.of(2021, 01, 01), LocalDate.of(2021, 02, 01)));

        return tasksList;
    }
}