package ar.edu.unahur.obj2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unahur.obj2.model.DatosPais;
import ar.edu.unahur.obj2.model.Country;

public class PaisService implements IPaisService {

    private final ConsumoRecurso consumoRecurso = new ConsumoRecurso();
    private final ConvierteDatos conversor = new ConvierteDatos();
    private List <DatosPais> datosPaises = new ArrayList<>();

    @Override
    public List<Country> getPaises() { 
        if(datosPaises.isEmpty()){
            datosPaises = solicitarPaises();
        }  
        return datosPaises.stream()
                .map(dp -> new Country(dp))
                .collect(Collectors.toList());
        
    }
    
    private List<DatosPais> solicitarPaises(){
        var json = consumoRecurso.obtenerDatos();
        return conversor.obtenerListaDatos(json, DatosPais.class);
    }
}
