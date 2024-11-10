package com.coders.comma.psy.psycenter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/psycenter")
public class PsyCenterController {

    @Autowired
    private PsyCenterService psyCenterService;

    @GetMapping("/")
    public List<PsyCenter> getAllPsyCenters() {
        return psyCenterService.getAllPsyCenters();
    }

    @GetMapping("/{id}")
    public PsyCenter getPsyCenterById(@PathVariable int id) {
        return psyCenterService.getPsyCenterById(id).orElse(null);
    }

    @PostMapping("/")
    public PsyCenter createPsyCenter(@RequestBody PsyCenter psyCenter) {
        return psyCenterService.createOrUpdatePsyCenter(psyCenter);
    }

    @PutMapping("/{id}")
    public PsyCenter updatePsyCenter(@PathVariable int id, @RequestBody PsyCenter psyCenter) {
        psyCenter.setPsyCenterNo(id);
        return psyCenterService.createOrUpdatePsyCenter(psyCenter);
    }

    @DeleteMapping("/{id}")
    public void deletePsyCenterById(@PathVariable int id) {
        psyCenterService.deletePsyCenterById(id);
    }
}
