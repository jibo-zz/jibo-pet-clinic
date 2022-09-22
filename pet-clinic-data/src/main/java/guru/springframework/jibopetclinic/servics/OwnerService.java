package guru.springframework.jibopetclinic.servics;

import guru.springframework.jibopetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
