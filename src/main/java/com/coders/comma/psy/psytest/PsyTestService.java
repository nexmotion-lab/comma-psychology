package com.coders.comma.psy.psytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PsyTestService {

    @Autowired
    private PsyTestRepository psyTestRepository;

    public List<PsyTest> getAllPsyTests() { return psyTestRepository.findAll(); }

    public Optional<PsyTest> getPsyTestById(int id) { return psyTestRepository.findById(id); }

    public PsyTest createOrUpdatePsyTest(PsyTest psyTest) { return psyTestRepository.save(psyTest); }

    public void deletePsyTestById(int id) { psyTestRepository.deleteById(id); }
}
