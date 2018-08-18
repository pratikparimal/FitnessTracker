package my.springmvc.service;

import java.util.List;

import my.springmvc.model.Activity;

public interface ExerciseService {

	List<Activity> findAllActivities();

}