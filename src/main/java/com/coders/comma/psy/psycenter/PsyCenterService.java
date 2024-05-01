package com.coders.comma.psy.psycenter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PsyCenterService {

    @Autowired
    private PsyCenterRepository psyCenterRepository;

    public List<PsyCenter> getAllPsyCenters() {
        return psyCenterRepository.findAll();
    }

    public Optional<PsyCenter> getPsyCenterById(int id) {
        return psyCenterRepository.findById(id);
    }

    public PsyCenter createOrUpdatePsyCenter(PsyCenter psyCenter) {
        return psyCenterRepository.save(psyCenter);
    }

    public void deletePsyCenterById(int id) {
        psyCenterRepository.deleteById(id);
    }
}
