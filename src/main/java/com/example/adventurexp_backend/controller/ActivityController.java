package com.example.adventurexp_backend.controller;

import com.example.adventurexp_backend.model.Activity;
import com.example.adventurexp_backend.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ActivityController {
    @Autowired
    ActivityRepository activityRepository;

    public ActivityController() {
        activityRepository = new ActivityRepository();
    }

    @GetMapping(path = "/activities")
    public ResponseEntity<List<Activity>> getActivities() {
        List<Activity> activities = activityRepository.viewActivities();
        return new ResponseEntity<>(activities, HttpStatus.OK);
    }
}