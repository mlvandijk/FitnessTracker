package com.pluralsight.service;

import com.pluralsight.model.Activity;

import java.util.List;

public interface ExerciseService {
    List<Activity> findAllActivities();
}
