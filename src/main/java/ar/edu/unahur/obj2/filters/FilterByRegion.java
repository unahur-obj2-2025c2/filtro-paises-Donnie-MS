package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Country;

public class FilterByRegion extends Filter{
    private String prefix;
    public FilterByRegion(String prefix) {
        this.prefix = prefix;
    }
    
    @Override
    public Boolean apply(Country aCountry) {
        return aCountry.getRegion().startsWith(prefix);
    }
}
