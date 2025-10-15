package ar.edu.unahur.obj2.filters;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.model.Country;

public class OrFilter extends CompositeFilter{
    public OrFilter(List<IFilter> filters) {
        this.filters = new ArrayList<>(filters);
    }

    public OrFilter(IFilter aFilter, IFilter newFilter) {
        this.filters.remove(aFilter);
        this.filters.add(newFilter);
    }
    @Override
    public Boolean apply(Country aCountry) {
        return this.filters.stream().anyMatch(filter -> filter.apply(aCountry));
    }
    
    @Override
    public IFilter and(IFilter aFilter) {
        return new AndFilter(this, aFilter);
    }
}
