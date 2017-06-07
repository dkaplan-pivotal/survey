package com.sleepeasysoftware.survey;

import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class SurveyController {

    private SurveyRepository surveyRepository;

    public SurveyController(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    @PostMapping("/survey")
    public Survey save(Survey survey) {
        return surveyRepository.save(survey);
    }

    @GetMapping("/survey")
    public List<Survey> list() {
        return Lists.newArrayList(surveyRepository.findAll());
    }
}
