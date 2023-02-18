package com.project.content.repository;

import com.project.content.entity.TopicsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TopicsRepository extends JpaRepository<TopicsEntity, Long> {

    List<TopicsEntity> findByOrderByTitle();

    Optional<TopicsEntity> findByTitle(String topicName);

    List<TopicsEntity> findByTags(String tags);
}
