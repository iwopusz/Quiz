package pl.iwopusz.quiz.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.iwopusz.quiz.database.entities.PlayerEntity;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
}
