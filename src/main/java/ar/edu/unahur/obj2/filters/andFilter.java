package ar.edu.unahur.obj2.filters;

import java.util.ArrayList;
import java.util.List;

public class AndFilter extends CompositeFilter{
    public void AndFilter(List<Filter> filters) {
        this.filters = new ArrayList<>(filters);
    }

    public void AndFilter(IFilter aFilter, IFilter newFilter) {

    }
    @Override
    public Boolean apply(Country aCountry) {
        a
    }
    
    public IFilter or(IFilter Filter) {
        
    }
}
