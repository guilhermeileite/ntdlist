package com.guilhermeleite.ntdlist.services;

import com.guilhermeleite.ntdlist.dto.GameMinDTO;
import com.guilhermeleite.ntdlist.entities.Game;
import com.guilhermeleite.ntdlist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
