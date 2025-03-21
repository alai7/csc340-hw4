package com.hw4_try2.demo.raccoon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/raccoons")
public class RaccoonController {

    @Autowired
    private RaccoonService service;


    // http://localhost:8080/raccoons/all
    @GetMapping("/all")
    public Object getAllRaccoons(){
        return new ResponseEntity<>(service.getAllRaccoons(), HttpStatus.OK);
    }

    //http://localhost:8080/raccoons/999
    @GetMapping("/{raccoonId}")
    public Object getRaccoonById(@PathVariable int raccoonId) {
        return new ResponseEntity<>(service.getRaccoonById(raccoonId), HttpStatus.OK);

    }

    //not working
    //http://localhost:8080/raccoons/name?search=bobby
    @GetMapping("/name")
    public Object getListRaccoonByName(@RequestParam(name = "search", defaultValue = "") String search) {
        return new ResponseEntity<>(service.getListOfRaccoonsByName(search), HttpStatus.OK);
    }


    //not working for list of species
    //http://localhost:8080/raccoons/species/P.lotor
    @GetMapping("/species/{species}")
    public Object getListRaccoonBySpecies(@PathVariable String species) {
        return new ResponseEntity<>(service.getListOfRaccoonsBySpecies(species), HttpStatus.OK);
    }


    //http://localhost:8080/raccoons/chonky?chonk=7.0
    @GetMapping("/chonky")
    public Object getChonkyRaccoons(@RequestParam(name = "chonk", defaultValue = "7.0") double size) {
        return new ResponseEntity<>(service.getListOfRaccoonsBySize(size), HttpStatus.OK);

    }

    //http://localhost:8080/raccoons/new --data '{ "name": "Bobby Flay", "species": "PROCYON CANCRIVORUS", "size": "5.7", "weight": "8.3"}'
    @PostMapping("/new")
    public Object addNewRaccoon(@RequestBody Raccoon raccoon) {
        service.addNewRaccoon(raccoon);
        return new ResponseEntity<>(service.getAllRaccoons(), HttpStatus.CREATED);
    }

    //http://localhost:8080/raccoons/update/999 --data '{ "name": "Bobby Flay", "species": "PROCYON CANCRIVORUS", "size": "6.4", "weight": "10.2"}'
    @PutMapping("/update/{raccoonId}")
    public Object updateRaccoon(@PathVariable int raccoonId, @RequestBody Raccoon raccoon) {
        service.updateRaccoon(raccoonId, raccoon);
        return new ResponseEntity<>(service.getRaccoonById(raccoonId), HttpStatus.CREATED);
    }

    //http://localhost:8080/raccoons/delete/999
    @DeleteMapping("/delete/{raccoonId}")
    public Object deleteRaccoonById(@PathVariable int raccoonId) {
        service.deleteRaccoonById(raccoonId);
        return new ResponseEntity<>(service.getAllRaccoons(), HttpStatus.OK);
    }

}
