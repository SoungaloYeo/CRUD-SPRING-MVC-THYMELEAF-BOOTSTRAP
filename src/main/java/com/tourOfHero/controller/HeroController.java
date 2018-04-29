package com.tourOfHero.controller;

import com.tourOfHero.entities.Hero;
import com.tourOfHero.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by yeo-sglo on 20/03/17.
 */
@Controller
@RequestMapping(value = "/hero")
public class HeroController {

    @Autowired
    private HeroRepository heroRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listHero(Model model){
        model.addAttribute("listHero", heroRepository.findAll());
        model.addAttribute("hero", new Hero());
        return "hero";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addHero(Hero hero, Model model){
        heroRepository.save(hero);
        model.addAttribute("hero", new Hero());
        model.addAttribute("listHero", heroRepository.findAll());
        return "hero";
    }

    @RequestMapping(value = "/show-edit", method = RequestMethod.GET)
    public String showEdit(Long id, Model model){
        model.addAttribute("hero", heroRepository.findOne(id));
        model.addAttribute("listHero", heroRepository.findAll());
        return "hero";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(Long id, Model model){
        heroRepository.delete(id);
        model.addAttribute("hero", new Hero());
        model.addAttribute("listHero", heroRepository.findAll());
        return "hero";
    }

  }
