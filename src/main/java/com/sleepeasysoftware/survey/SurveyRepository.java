package com.sleepeasysoftware.survey;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "survey")
public interface SurveyRepository extends PagingAndSortingRepository<Survey, Long> {
}
