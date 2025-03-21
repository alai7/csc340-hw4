package com.hw4_try2.demo.raccoon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaccoonService {
    @Autowired
    private RaccoonRepository raccoonRepository;

    //return list of all
    public List<Raccoon> getAllRaccoons() {
        return raccoonRepository.findAll();
    }

    //find by unique id
    public Raccoon getRaccoonById(int raccoonId){
        return raccoonRepository.findById(raccoonId).orElse(null);
    }

    //new raccoon
    public void addNewRaccoon(Raccoon raccoon){
        raccoonRepository.save(raccoon);
    }

    //update existing raccoon
    public void updateRaccoon(int raccoonId, Raccoon raccoon){
        Raccoon savedRaccoon = getRaccoonById(raccoonId);
        savedRaccoon.setName(raccoon.getName());
        savedRaccoon.setSpecies(raccoon.getSpecies());
        savedRaccoon.setSize(raccoon.getSize());
        savedRaccoon.setWeight(raccoon.getWeight());

        raccoonRepository.save(savedRaccoon);

    }

    //delete
    public void deleteRaccoonById(int raccoonId){
        raccoonRepository.deleteById(raccoonId);
    }


    //bySpecies
    public List<Raccoon> getListOfRaccoonsBySpecies(String species) {
        return raccoonRepository.getAllRaccoonsBySpecies(species);
    }

    //by name?
    public List<Raccoon> getListOfRaccoonsByName(String name){
        return raccoonRepository.getAllRaccoonsByName(name);
    }

    public List<Raccoon> getListOfRaccoonsBySize(double size){
        return raccoonRepository.getAllRaccoonsBySize(size);
    }
}