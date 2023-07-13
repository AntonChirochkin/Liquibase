package ru.skypro.liquibase2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.liquibase2.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
