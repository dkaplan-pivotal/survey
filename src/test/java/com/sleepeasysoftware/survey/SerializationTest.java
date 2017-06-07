package com.sleepeasysoftware.survey;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

@JsonTest
@RunWith(SpringRunner.class)
public class SerializationTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void seeSerialization() throws Exception {
        Survey survey = new Survey();
        List<SurveyQuestion> surveyQuestions = new ArrayList<>();
        SurveyQuestion surveyQuestion = new SurveyQuestion();
        surveyQuestion.setQuestion("foobar");
        surveyQuestion.setSortOrder(1);
        surveyQuestions.add(surveyQuestion);
        survey.setSurveyQuestions(surveyQuestions);

        String output = objectMapper.writeValueAsString(survey);
        Survey backAgain = objectMapper.readValue(output, Survey.class);
        assertThat(survey).isEqualTo(backAgain);
    }
}
