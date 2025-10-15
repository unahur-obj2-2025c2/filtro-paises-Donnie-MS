package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Country;

public class FilterByPopulation extends Filter{
    private Long threshold;
    public FilterByPopulation(Long threshold) {
        this.threshold = threshold;
    }
    @Override
    public Boolean apply(Country aCountry) {
        return aCountry.getPopulation() < this.threshold;
    }
}
