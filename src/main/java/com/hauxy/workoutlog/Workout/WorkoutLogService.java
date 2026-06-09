package com.hauxy.workoutlog.Workout;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutLogService {
    private WorkoutLogRepository workoutLogRepository;

    public WorkoutLogService(WorkoutLogRepository workoutLogRepository) {
        this.workoutLogRepository = workoutLogRepository;
    }

    public List<WorkoutLog> getAllWorkoutLogs() {
        return workoutLogRepository.findAll();
    }

    public WorkoutLog saveNewWorkoutLog(WorkoutLog workoutLog) {
        return workoutLogRepository.save(workoutLog);
    }
}
