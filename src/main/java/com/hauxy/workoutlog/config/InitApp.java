package com.hauxy.workoutlog.config;

import com.hauxy.workoutlog.Workout.WorkoutLog;
import com.hauxy.workoutlog.Workout.WorkoutLogRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class InitApp {
    @Bean
    CommandLineRunner initDatabase(WorkoutLogRepository workoutLogRepository) {

        return args -> {
            workoutLogRepository.save(new WorkoutLog("Squats", 10));
            workoutLogRepository.save(new WorkoutLog("Pushups", 15));
            workoutLogRepository.save(new WorkoutLog("Plank", 60));
        };
    }
}