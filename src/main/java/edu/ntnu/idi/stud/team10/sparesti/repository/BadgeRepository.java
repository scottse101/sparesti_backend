package edu.ntnu.idi.stud.team10.sparesti.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ntnu.idi.stud.team10.sparesti.model.Badge;

/** Repository for Badge entities. */
public interface BadgeRepository extends JpaRepository<Badge, Long> {
  Optional<Badge> findByName(String name);
}
