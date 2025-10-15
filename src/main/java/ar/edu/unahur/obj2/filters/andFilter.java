package ar.edu.unahur.obj2.filters;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.model.Country;

public class AndFilter extends CompositeFilter{
    public AndFilter(List<IFilter> filters) {
        this.filters = new ArrayList<>(filters);
    }

    public AndFilter(IFilter aFilter, IFilter newFilter) {
        this.filters.remove(aFilter);
        this.filters.add(newFilter);
    }
    @Override
    public Boolean apply(Country aCountry) {
        return filters.stream().allMatch(filter -> filter.apply(aCountry));
    }
    @Override
    public IFilter or(IFilter aFilter) {
        return new OrFilter(this, aFilter);
    }
}
