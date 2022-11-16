package com.example.my_movie.model;

public class Film {

    private String titre;
    private String real;
    private Actor mainActor;
    private String dateSortie;

    public Film(String titre, String real, Actor mainActor, String dateSortie) {
        this.titre = titre;
        this.real = real;
        this.mainActor = mainActor;
        this.dateSortie = dateSortie;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getReal() {
        return real;
    }

    public void setReal(String real) {
        this.real = real;
    }

    public Actor getMainActor() {
        return mainActor;
    }

    public void setMainActor(Actor mainActor) {
        this.mainActor = mainActor;
    }

    public String getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(String dateSortie) {
        this.dateSortie = dateSortie;
    }
}
