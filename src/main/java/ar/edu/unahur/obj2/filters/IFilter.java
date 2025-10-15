package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Country;

public interface IFilter {
    public Boolean apply(Country aCountry);
    public IFilter and(IFilter aFilter);
    public IFilter or(IFilter aFilter);
}

