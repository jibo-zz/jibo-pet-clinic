package guru.springframework.jibopetclinic.servics;

import guru.springframework.jibopetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
