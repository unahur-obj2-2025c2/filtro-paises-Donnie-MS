package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Country;

public class FilterByLanguage extends Filter {
    private String language;

    public FilterByLanguage(String language) {
        this.language = language;
    }

    public Boolean apply(Country aCountry) {
        return aCountry.getLanguages().stream().anyMatch(language -> language == this.language);
    }
}
