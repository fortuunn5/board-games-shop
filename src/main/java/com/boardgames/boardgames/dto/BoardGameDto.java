package com.boardgames.boardgames.dto;

import com.boardgames.boardgames.model.BoardGame;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BoardGameDto {
    private Long id;
    private String name;
    private String description;
    private double price;
    private int minPlayers;
    private int maxPlayers;
    private int minTime;
    private int maxTime;
    private int age;

    public BoardGameDto(BoardGame boardGame) {
        this.id = boardGame.getId();
        this.name = boardGame.getName();
        this.description = boardGame.getDescription();
        this.price = boardGame.getPrice();
        this.minPlayers = boardGame.getMinPlayers();
        this.maxPlayers = boardGame.getMaxPlayers();
        this.minTime = boardGame.getMinTime();
        this.maxTime = boardGame.getMaxTime();
        this.age = boardGame.getAge();
    }
}
