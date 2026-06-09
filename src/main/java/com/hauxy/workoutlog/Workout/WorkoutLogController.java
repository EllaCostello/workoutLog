package com.hauxy.workoutlog.Workout;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workoutLog")
public class WorkoutLogController {
    private WorkoutLogService workoutLogService;

    public WorkoutLogController (WorkoutLogService workoutLogService) {
        this.workoutLogService = workoutLogService;
    }

    @GetMapping("/showLogs")
    public List<WorkoutLog> getAllWorkoutLogs() {
        return workoutLogService.getAllWorkoutLogs();
    }

    @PostMapping("/save")
    public WorkoutLog saveNewWorkoutLog(@RequestBody WorkoutLog workoutLog) {
        return workoutLogService.saveNewWorkoutLog(workoutLog);
    }
}
