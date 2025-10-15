package ar.edu.unahur.obj2.filters;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeFilter implements IFilter{
    protected List<IFilter> filters;
    
    public CompositeFilter() {
        this.filters = new ArrayList<>();
    }
    public CompositeFilter(List<IFilter> filters) {
        this.filters = new ArrayList<>(filters);
    }

    public void addFilter(IFilter aFilter) {
        filters.add(aFilter);
    }
    @Override
    public IFilter and(IFilter aFilter) {
        this.addFilter(aFilter);
        return this;
    }
    @Override
    public IFilter or(IFilter aFilter) {
        this.addFilter(aFilter);
        return this;
    }
}
