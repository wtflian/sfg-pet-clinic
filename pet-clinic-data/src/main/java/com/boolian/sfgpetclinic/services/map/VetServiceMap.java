package com.boolian.sfgpetclinic.services.map;

import com.boolian.sfgpetclinic.model.Vet;
import com.boolian.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Long id, Vet object) {
        return super.save(id, object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
