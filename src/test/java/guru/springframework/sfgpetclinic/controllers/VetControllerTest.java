package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.fauxspring.Model;
import guru.springframework.sfgpetclinic.fauxspring.ModelMapImpl;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.SpecialityMapService;
import guru.springframework.sfgpetclinic.services.map.VetMapService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@Tag("controller")
class VetControllerTest {

    SpecialityMapService specialityMapService;
    VetService service;
    VetController vetController;

    @BeforeEach
    void setUp() {
        specialityMapService = new SpecialityMapService();
        service = new VetMapService(specialityMapService);
        vetController = new VetController(service);

        Vet vet1 = new Vet(1l,"Kenneth", "Alvarado", new HashSet<>() );
        Vet vet2 = new Vet(2l,"Juan", "Vargas", new HashSet<>());

        service.save(vet1);
        service.save(vet2);

    }

    @Test
    void listVets() {
        Model vetModel = new ModelMapImpl();

        String response = vetController.listVets(vetModel);
        Set modelAttribute = (Set) ((ModelMapImpl)vetModel).getMap().get("vets");

        assertEquals("vets/index", response, "View name does not match");
        assertEquals(2, modelAttribute.size());
    }
}