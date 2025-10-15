package ar.edu.unahur.obj2.filters;

public abstract class Filter implements IFilter{
    @Override
    public IFilter and(IFilter aFilter) {
        return new AndFilter(this, aFilter);
    }
    @Override
    public IFilter or(IFilter aFilter) {
         return new OrFilter(this, aFilter);
    }
}
