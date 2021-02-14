package com.boolian.sfgpetclinic.services;

import com.boolian.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
