package com.sam.spring_crud_demo.repository;

import com.sam.spring_crud_demo.model.Tutorials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "learningtutorials")
public interface TutorialRepository extends JpaRepository<Tutorials, Long>
{
    // findByPublished is a custom method()
    List<Tutorials> findByPublished(boolean published);
}
