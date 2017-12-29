package com.pluralsight.controller;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;
import com.pluralsight.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MinutesController {

    @Autowired
    private ExerciseService exerciseService;

    @RequestMapping(value="/addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise){
        System.out.println("exercise: " + exercise.getMinutes());
        System.out.println("exercise activity: " + exercise.getActivity());
        return "addMinutes";
    }

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public @ResponseBody List<Activity> findAllActivities(){
        return exerciseService.findAllActivities();
    }

//    @RequestMapping(value="/addMoreMinutes")
//    public String addMoreMinutes(@ModelAttribute("exercise")Exercise exercise){
//        System.out.println("exercise more: " + exercise.getMinutes());
//        return "addMinutes";
//    }
}
