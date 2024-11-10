package com.coders.comma.psy.psytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/psytest")
public class PsyTestController {

    @Autowired
    private PsyTestService psyTestService;

    @GetMapping("/")
    public Map<String, List<PsyTestType.PsyTestCustom>> getAllPsyTests() {
        return psyTestService.getAllPsyTests();
    }

    @GetMapping("/{id}")
    public PsyTest getPsyTestById(@PathVariable int id) {
        return psyTestService.getPsyTestById(id).orElse(null);
    }

    @PostMapping("/")
    public PsyTest createPsyTest(@RequestBody PsyTest psyTest) {
        return psyTestService.createOrUpdatePsyTest(psyTest);
    }

    @PutMapping("/{id}")
    public PsyTest updatePsyTest(@PathVariable int id, @RequestBody PsyTest psyTest) {
        psyTest.setPsyTestNo(id);
        return psyTestService.createOrUpdatePsyTest(psyTest);
    }

    @DeleteMapping("/{id}")
    public void deletePsyTestById(@PathVariable int id) {
        psyTestService.deletePsyTestById(id);
    }
}
