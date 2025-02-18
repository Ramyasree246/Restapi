package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String staffName;
    private String phoneNumber;
    private String emailAddress;
    private String position;
    private String username;
    private String passwordHash;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    private Long managerId;
}
