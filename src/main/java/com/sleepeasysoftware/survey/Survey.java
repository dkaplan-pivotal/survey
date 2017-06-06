package com.sleepeasysoftware.survey;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@ToString
@EqualsAndHashCode
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(mappedBy = "survey", fetch = FetchType.EAGER)
    private List<SurveyQuestion> surveyQuestions;

}
