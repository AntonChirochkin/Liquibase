package ru.skypro.liquibase2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.liquibase2.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
