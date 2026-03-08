package com.guilhermeleite.ntdlist.repositories;

import com.guilhermeleite.ntdlist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
