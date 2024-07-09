package com.coders.comma.psy.psytest;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PsyTestService {

    private PsyTestRepository psyTestRepository;
    private PsyTestTypeRepository psyTestTypeRepository;

    public Map<String, List<PsyTestType.PsyTestCustom>> getAllPsyTests() {
        return psyTestTypeRepository.findAllWithPsyTests().stream()
                .collect(Collectors.toMap(
                        PsyTestType::getTitle,
                        PsyTestType::getPsyTestsWithoutNo
                ));
    }

    public Optional<PsyTest> getPsyTestById(int id) { return psyTestRepository.findById(id); }

    public PsyTest createOrUpdatePsyTest(PsyTest psyTest) { return psyTestRepository.save(psyTest); }

    public void deletePsyTestById(int id) { psyTestRepository.deleteById(id); }
}
