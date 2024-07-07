package com.coders.comma.psy.psytest;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PsyTestTypeRepository extends CrudRepository<PsyTestType, Long> {

    @Query("SELECT ptt FROM PsyTestType ptt LEFT JOIN FETCH ptt.psyTests")
    List<PsyTestType> findAllWithPsyTests();
}

