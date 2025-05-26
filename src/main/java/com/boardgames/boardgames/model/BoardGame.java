package com.boardgames.boardgames.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoardGame {
    @Id
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private double price;
    @Column(nullable = false)
    private int minPlayers;
    @Column(nullable = false)
    private int maxPlayers;
    @Column(nullable = false)
    private int minTime;
    @Column(nullable = false)
    private int maxTime;
    @Column(nullable = false)
    private int age;
}
