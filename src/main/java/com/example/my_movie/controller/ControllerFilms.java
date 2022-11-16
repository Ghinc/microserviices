package com.example.my_movie.controller;


import com.example.my_movie.model.Actor;
import com.example.my_movie.model.Film;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController

public class ControllerFilms {



    List<Film> films = new ArrayList<>();
    List<Actor> acteurs = new ArrayList<>();

    {
        Actor rene = null;
        Film f0 = null;
        Actor gertrude = null;
        ArrayList<Film> filmorene = new ArrayList<>();
        ArrayList<Film> filmogertrude = new ArrayList<>();
        Film f1 = new Film("La grande burne", "Diego", rene, "03/08/17");
        filmorene.add(f1);
        rene = new Actor("Dupont", "René", "01/08/14",filmorene);
        Film francaisnul= new Film("Titrebeauf", "realpatop", gertrude, "09/07/2000");
        filmogertrude.add(f1);
        filmogertrude.add(francaisnul);
        gertrude = new Actor("Vieilpo", "Gertrude","01/01/1900", filmogertrude);

        films.add(f1);
        films.add(francaisnul);

        acteurs.add(gertrude);
        acteurs.add(rene);

    }

    @ApiOperation(value = "Get list of Students in the System ", response = Iterable.class, tags = "getStudents")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!") })


    @RequestMapping(value = "/getStudents")public List<Film> getStudents() {
        return films;}

    @ApiOperation(value = "Get specific Student in the System ", response = Film.class,
            tags = "getStudent")
    @RequestMapping(value = "/getFilm/{titre}")
    public Film getFilm(@PathVariable(value = "titre") String titre) {
        return films.stream().filter(x -> x.getTitre().equalsIgnoreCase(titre)).collect(Collectors.toList()).get(0);
    }

}
