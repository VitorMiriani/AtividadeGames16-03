package com.example.fiap.appgames.games.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.fiap.appgames.games.model.Game;

@Controller
public class GamesController {
	
	@GetMapping("/games")
	public ModelAndView index () {
	
	ModelAndView modelView = new ModelAndView("games/Index");
	
	Game game1 = new Game("GodOfWar", 149, "Aventura", "PS4","Não",9.8);
	Game game2 = new Game("Forza Horizon", 250, "Corrida", "Xbox Series S","Sim",9.0);
	Game game3 = new Game("FIFA22", 350, "Esporte", "Multi-Plataforma","Sim",8.8);
	List<Game> games = Arrays.asList(game1,game2,game3);
	modelView.addObject("listarGames", games);
	return modelView;
	}
	
	
}
