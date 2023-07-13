package ru.skypro.liquibase2.command;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.skypro.liquibase2.repositories.CommentRepository;
import ru.skypro.liquibase2.repositories.PostRepository;


@Component
public class TestSqlScript implements CommandLineRunner {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    public TestSqlScript(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        postRepository.findAll().forEach(post -> {
            System.out.println(post.getId() + "; " + post.getName());
        });

    }
}