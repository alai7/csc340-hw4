package com.hw4_try2.demo.raccoon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RaccoonRepository extends JpaRepository<Raccoon, Integer> {

    List<Raccoon> getAllRaccoonsBySpecies(String species);

    //other calls are built into the JpaRepository (findAll(), findById(), save(), deleteById(), etc -- these we are adding

    //get all raccoons by a specific size
    @Query(value = "select * from raccoons r where r.size >= ?", nativeQuery = true)
    List<Raccoon> getAllRaccoonsBySize(double size);

    //get raccoon by similar string
    @Query(value = "select * from raccoons r where r.name like %?!%", nativeQuery = true)
    List<Raccoon> getAllRaccoonsByName(String name);

}