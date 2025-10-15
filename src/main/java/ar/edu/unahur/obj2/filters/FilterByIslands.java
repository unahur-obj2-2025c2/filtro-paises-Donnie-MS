package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Country;

public class FilterByIslands extends Filter{
    
    @Override
    public Boolean apply(Country aCountry) {
        return aCountry.isIsland();
    }
}
