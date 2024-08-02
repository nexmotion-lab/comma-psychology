package com.coders.comma.psy.psytest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Tag(name = "PsyTest API", description = "상담센터 -> 심리검사 API 입니다.")
@RestController
@RequestMapping("/api/v1/psytest")
public class PsyTestController {

    @Autowired
    private PsyTestService psyTestService;

    @Tag(name = "PsyTest API")
    @Operation(summary = "심리검사 리스트 조회", description = "심리검사 리스트를 조회합니다.")
    @GetMapping("/")
    public Map<String, List<PsyTestType.PsyTestCustom>> getAllPsyTests() {
        return psyTestService.getAllPsyTests();
    }

    @Tag(name = "PsyTest API")
    @Operation(summary = "심리검사 조회", description = "심리검사 조회합니다.")
    @GetMapping("/{id}")
    public PsyTest getPsyTestById(@PathVariable int id) {
        return psyTestService.getPsyTestById(id).orElse(null);
    }

    @Tag(name = "PsyTest API")
    @Operation(summary = "심리검사 생성", description = "심리검사 생성합니다.")
    @PostMapping("/")
    public PsyTest createPsyTest(@RequestBody PsyTest psyTest) {
        return psyTestService.createOrUpdatePsyTest(psyTest);
    }

    @Tag(name = "PsyTest API")
    @Operation(summary = "심리검사 수정", description = "심리검사 수정합니다.")
    @PutMapping("/{id}")
    public PsyTest updatePsyTest(@PathVariable int id, @RequestBody PsyTest psyTest) {
        psyTest.setPsyTestNo(id);
        return psyTestService.createOrUpdatePsyTest(psyTest);
    }

    @Tag(name = "PsyTest API")
    @Operation(summary = "심리검사 삭제", description = "심리검사 삭제합니다.")
    @DeleteMapping("/{id}")
    public void deletePsyTestById(@PathVariable int id) {
        psyTestService.deletePsyTestById(id);
    }
}
