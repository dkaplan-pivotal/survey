package com.sleepeasysoftware.survey;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@ToString
@EqualsAndHashCode
public class SurveyQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int sortOrder;
    private String question;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SURVEY_ID")
    private Survey survey;

}
