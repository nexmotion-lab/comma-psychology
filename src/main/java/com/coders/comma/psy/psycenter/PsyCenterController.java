package com.coders.comma.psy.psycenter;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Tag(name = "PsyCenter API", description = "상담센터 -> 상담센터 API 입니다.")
@RestController
@RequestMapping("/api/v1/psycenter")
public class PsyCenterController {

    @Autowired
    private PsyCenterService psyCenterService;

    @Tag(name = "PsyCenter API")
    @Operation(summary = "상담센터 리스트 조회", description = "상담센터 리스트를 조회합니다.")
    @GetMapping("/")
    public List<PsyCenter> getAllPsyCenters() {
        return psyCenterService.getAllPsyCenters();
    }

    @Tag(name = "PsyCenter API")
    @Operation(summary = "상담센터 조회", description = "상담센터 조회합니다.")
    @GetMapping("/{id}")
    public PsyCenter getPsyCenterById(@PathVariable int id) {
        return psyCenterService.getPsyCenterById(id).orElse(null);
    }

    @Tag(name = "PsyCenter API")
    @Operation(summary = "상담센터 생성", description = "상담센터 생성합니다.")
    @PostMapping("/")
    public PsyCenter createPsyCenter(@RequestBody PsyCenter psyCenter) {
        return psyCenterService.createOrUpdatePsyCenter(psyCenter);
    }

    @Tag(name = "PsyCenter API")
    @Operation(summary = "상담센터 수정", description = "상담센터 수정합니다.")
    @PutMapping("/{id}")
    public PsyCenter updatePsyCenter(@PathVariable int id, @RequestBody PsyCenter psyCenter) {
        psyCenter.setPsyCenterNo(id);
        return psyCenterService.createOrUpdatePsyCenter(psyCenter);
    }

    @Tag(name = "PsyCenter API")
    @Operation(summary = "상담센터 삭제", description = "상담센터 삭제합니다.")
    @DeleteMapping("/{id}")
    public void deletePsyCenterById(@PathVariable int id) {
        psyCenterService.deletePsyCenterById(id);
    }
}
