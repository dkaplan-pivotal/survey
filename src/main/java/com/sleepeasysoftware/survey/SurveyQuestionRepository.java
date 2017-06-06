package com.sleepeasysoftware.survey;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "surveyQuestion", exported = false)
public interface SurveyQuestionRepository extends PagingAndSortingRepository<SurveyQuestion, Long> {
}
