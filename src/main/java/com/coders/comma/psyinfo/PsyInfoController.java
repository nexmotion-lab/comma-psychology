package com.coders.comma.psyinfo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "PsyInfo API", description = "상담센터 -> 심리정보 API 입니다.")
@RestController
@RequestMapping("/api/v1/psyinfo")
public class PsyInfoController {

    @Autowired
    private PsyInfoService psyInfoService;

    @Tag(name = "PsyInfo API")
    @Operation(summary = "심리정보 리스트 조회", description = "심리정보 리스트를 조회합니다.")
    @GetMapping("/")
    public List<PsyInfo> getAllPsyInfos() {
        return psyInfoService.getAllPsyInfos();
    }

    @Tag(name = "PsyInfo API")
    @Operation(summary = "심리정보 조회", description = "심리정보 조회합니다.")
    @GetMapping("/{id}")
    public PsyInfo getPsyInfoById(@PathVariable int id) {
        return psyInfoService.getPsyInfoById(id).orElse(null);
    }

    @Tag(name = "PsyInfo API")
    @Operation(summary = "심리정보 생성", description = "심리정보 생성합니다.")
    @PostMapping("/")
    public PsyInfo createPsyInfo(@RequestBody PsyInfo psyInfo) {
        return psyInfoService.createOrUpdatePsyInfo(psyInfo);
    }

    @Tag(name = "PsyInfo API")
    @Operation(summary = "심리정보 수정", description = "심리정보 수정합니다.")
    @PutMapping("/{id}")
    public PsyInfo updatePsyInfo(@PathVariable int id, @RequestBody PsyInfo psyInfo) {
        psyInfo.setPsyInfoNo(id);
        return psyInfoService.createOrUpdatePsyInfo(psyInfo);
    }

    @Tag(name = "PsyInfo API")
    @Operation(summary = "심리정보 삭제", description = "심리정보 삭제합니다.")
    @DeleteMapping("/{id}")
    public void deletePsyInfoById(@PathVariable int id) {
        psyInfoService.deletePsyInfoById(id);
    }
}
