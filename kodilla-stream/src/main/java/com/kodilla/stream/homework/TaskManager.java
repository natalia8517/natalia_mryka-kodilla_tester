package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        List<LocalDate> notOverdueTasksDates = TaskRepository.getTasks()
                .stream()
                .filter(t -> t.deadline.isAfter(LocalDate.now()))
                .map(TaskManager::getDeadlineDate)
                .collect(Collectors.toList());
        System.out.println(notOverdueTasksDates);
    }

    public static LocalDate getDeadlineDate(Task task){
        return task.getDeadline();
    }
}