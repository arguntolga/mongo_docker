package com.fworx.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fworx.model.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
  List<Tutorial> findByPublished(boolean published);
  List<Tutorial> findByTitleContaining(String title);
}
