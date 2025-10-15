package ar.edu.unahur.obj2.model;

import java.util.List;

public class Country {
    private String nombre;
    private String capital; 
    private String region;
    private String subRegion; 
    private Long population;
    private List<String> languages;
    private List<String> limites;

    public Country(DatosPais dp){
        this.nombre = dp.nombre();
        this.capital = dp.capital();
        this.region = dp.region();
        this.subRegion = dp.subRegion();
        this.population = dp.population();
        this.languages = dp.languages().stream()
                .map(i -> i.name())
                .toList();
        this.limites = dp.limites();
    }

    public Boolean isIsland(){
        return this.limites == null || this.limites.isEmpty();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapital() {
        return capital;
    }

    public String getRegion() {
        return region;
    }

    public String getSubRegion() {
        return subRegion;
    }

    public Long getPopulation() {
        return population;
    }

    public List<String> getLanguages() {
        return languages;
    }

    @Override
    public String toString() {
        return "Pais [nombre=" + nombre + ", capital=" + capital + ", region=" + region + ", subRegion=" + subRegion
                + ", poblacion=" + population + ", languages=" + languages + ", isIsland()=" + isIsland() + "]";
    }

    

}
