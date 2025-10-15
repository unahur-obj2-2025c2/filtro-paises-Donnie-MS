package ar.edu.unahur.obj2.filters;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.model.Country;
import ar.edu.unahur.obj2.service.IPaisService;
import ar.edu.unahur.obj2.service.PaisService;

public class FiltroTest {

    @Test
	void recibeListaDePaises() {
		IPaisService paisService = new PaisService();
        List<Country> paises = paisService.getPaises();
        assertNotNull(paises);
    }
    
}
