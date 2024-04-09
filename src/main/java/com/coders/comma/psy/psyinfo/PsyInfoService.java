package com.coders.comma.psy.psyinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PsyInfoService {

    @Autowired
    private PsyInfoRepository psyInfoRepository;

    public List<PsyInfo> getAllPsyInfos() {
        return psyInfoRepository.findAll();
    }

    public Optional<PsyInfo> getPsyInfoById(int id) {
        return psyInfoRepository.findById(id);
    }

    public PsyInfo createOrUpdatePsyInfo(PsyInfo psyInfo) {
        return psyInfoRepository.save(psyInfo);
    }

    public void deletePsyInfoById(int id) {
        psyInfoRepository.deleteById(id);
    }
}
