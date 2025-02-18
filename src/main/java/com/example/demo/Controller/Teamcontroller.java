package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.Service.TeamService;
import com.example.demo.models.Team;
import java.util.List;

@RestController
@RequestMapping("/api/teams")
@CrossOrigin(origins = "*")
public class Teamcontroller {
    private final TeamService teamService;

    public Teamcontroller(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public List<Team> getTeams() {
        return teamService.getAllTeams();
    }

    @PostMapping
    public Team createTeam(@RequestBody Team team) {
        return teamService.saveTeam(team);
    }
}