package ru.skypro.liquibase2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.liquibase2.department.Position;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
