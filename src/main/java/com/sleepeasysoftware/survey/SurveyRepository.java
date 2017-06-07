package com.sleepeasysoftware.survey;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface SurveyRepository extends PagingAndSortingRepository<Survey, Long> {
}
