package ar.edu.unahur.obj2.filters;

import java.util.ArrayList;

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
