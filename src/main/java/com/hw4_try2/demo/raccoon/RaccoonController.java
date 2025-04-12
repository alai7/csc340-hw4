package com.hw4_try2.demo.raccoon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/raccoons")
public class RaccoonController {

    @Autowired
    private RaccoonService service;


    // http://localhost:8080/raccoons/all
    @GetMapping("/all")
    public Object getAllRaccoons(Model model){
        //return new ResponseEntity<>(service.getAllRaccoons(), HttpStatus.OK);
        model.addAttribute("raccoonList", service.getAllRaccoons());
        model.addAttribute("title", "All Raccoons");
        return "raccoon-list";
    }

    //http://localhost:8080/raccoons/999
    @GetMapping("/{raccoonId}")
    public Object getRaccoonById(@PathVariable int raccoonId, Model model) {
        //return new ResponseEntity<>(service.getRaccoonById(raccoonId), HttpStatus.OK);
        model.addAttribute("raccoon", service.getRaccoonById(raccoonId));
        model.addAttribute("title", "Raccoon #: " + raccoonId);
        return "raccoon-details";

    }

    //not working
    //http://localhost:8080/raccoons/name?search=bobby
    @GetMapping("/name")
    public Object getListRaccoonByName(@RequestParam(name = "search", defaultValue = "") String search, Model model) {
        //return new ResponseEntity<>(service.getListOfRaccoonsByName(search), HttpStatus.OK);
        model.addAttribute("raccoonList", service.getListOfRaccoonsByName(search));
        model.addAttribute("title", "Raccoons by Name: " + search);
        return "raccoon-list";
    }


    //not working for list of species
    //http://localhost:8080/raccoons/species/P.lotor
    @GetMapping("/species/{species}")
    public Object getListRaccoonBySpecies(@PathVariable String species, Model model) {
        //return new ResponseEntity<>(service.getListOfRaccoonsBySpecies(species), HttpStatus.OK);
        model.addAttribute("raccoonList", service.getListOfRaccoonsBySpecies(species));
        model.addAttribute("title", "Raccoons by Species: " + species);
        return "raccoon-list";
    }


    //http://localhost:8080/raccoons/chonky?chonk=7.0
    @GetMapping("/chonky")
    public Object getChonkyRaccoons(@RequestParam(name = "chonk", defaultValue = "7.0") double size) {
        return new ResponseEntity<>(service.getListOfRaccoonsBySize(size), HttpStatus.OK);

    }

    //http://localhost:8080/raccoons/new --data '{ "name": "Bobby Flay", "species": "PROCYON CANCRIVORUS", "size": "5.7", "weight": "8.3"}'
    @PostMapping("/new")
    public Object addNewRaccoon(Raccoon raccoon) {
        service.addNewRaccoon(raccoon);
        //return new ResponseEntity<>(service.getAllRaccoons(), HttpStatus.CREATED);
        return "redirect:/raccoons/all";
    }

    //http://localhost:8080/raccoons/update/999 --data '{ "name": "Bobby Flay", "species": "PROCYON CANCRIVORUS", "size": "6.4", "weight": "10.2"}'
    @PostMapping("/update/{raccoonId}")
    public Object updateRaccoon(@PathVariable int raccoonId, Raccoon raccoon) {
        service.updateRaccoon(raccoonId, raccoon);
        //return new ResponseEntity<>(service.getRaccoonById(raccoonId), HttpStatus.CREATED);
        return "redirect:/raccoons/" + raccoonId;
    }

    //http://localhost:8080/raccoons/delete/999
    @GetMapping("/delete/{raccoonId}")
    public Object deleteRaccoonById(@PathVariable int raccoonId) {
        service.deleteRaccoonById(raccoonId);
        //return new ResponseEntity<>(service.getAllRaccoons(), HttpStatus.OK);
        return "redirect:/raccoons/all";
    }


    ////////////////////////////
    ///
    /// new forms
    //create form w/ mvc
    @GetMapping("/createForm")
    public String showCreateForm(Model model) {
        Raccoon raccoon = new Raccoon();
        model.addAttribute("raccoon", raccoon);
        model.addAttribute("title", "Create New Raccoon");
        //species
        //size
        //weight?
        return "raccoon-create";
    }

    //update form w/ mvc
    @GetMapping("/update/{raccoonId}")
    public String showUpdateForm(@PathVariable int raccoonId, Model model) {
        model.addAttribute("raccoon", service.getRaccoonById(raccoonId));
        model.addAttribute("title", "Update Raccoon");
        return "raccoon-update";
    }

    @GetMapping("/about")
    public String showAboutPage(){
        return "raccoon-about";
    }
}
