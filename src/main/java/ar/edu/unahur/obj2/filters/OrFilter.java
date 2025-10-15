package ar.edu.unahur.obj2.filters;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.model.Country;

public class OrFilter extends CompositeFilter{
    public OrFilter(List<IFilter> filters) {
        this.filters = new ArrayList<>(filters);
    }

    public OrFilter(IFilter aFilter, IFilter newFilter) {

    }


    public Boolean apply(Country aCountry) {

    }

    public IFilter and(IFilter aFilter)
}
