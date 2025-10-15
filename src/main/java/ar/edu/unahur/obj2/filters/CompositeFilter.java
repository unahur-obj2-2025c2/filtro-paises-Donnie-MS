package ar.edu.unahur.obj2.filters;

import java.util.List;

public abstract class CompositeFilter implements IFilter{
    protected List<IFilter> filters;
    
    public void addFilter(IFilter aFilter) {
        filters.add(aFilter);
    }
    
    public IFilter and(IFilter aFilter) {

    }

    public IFilter or(IFilter aFilter) {

    }
}
