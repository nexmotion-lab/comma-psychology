package com.coders.comma.psy.psyinfo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/psyinfo")
public class PsyInfoController {

    @Autowired
    private PsyInfoService psyInfoService;

    @GetMapping("/")
    public List<PsyInfo> getAllPsyInfos() {
        return psyInfoService.getAllPsyInfos();
    }

    @GetMapping("/{id}")
    public PsyInfo getPsyInfoById(@PathVariable int id) {
        return psyInfoService.getPsyInfoById(id).orElse(null);
    }

    @PostMapping("/")
    public PsyInfo createPsyInfo(@RequestBody PsyInfo psyInfo) {
        return psyInfoService.createOrUpdatePsyInfo(psyInfo);
    }

    @PutMapping("/{id}")
    public PsyInfo updatePsyInfo(@PathVariable int id, @RequestBody PsyInfo psyInfo) {
        psyInfo.setPsyInfoNo(id);
        return psyInfoService.createOrUpdatePsyInfo(psyInfo);
    }


    @DeleteMapping("/{id}")
    public void deletePsyInfoById(@PathVariable int id) {
        psyInfoService.deletePsyInfoById(id);
    }
}
