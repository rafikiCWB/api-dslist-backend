package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

/*
    @Query(nativeQuery = true, value = """
            SELECT  FHAUISHDAFGASDHJ
    
    
    );
    List<Game> searchDB(Long find);*/
}

