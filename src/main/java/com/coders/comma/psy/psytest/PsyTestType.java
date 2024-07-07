package com.coders.comma.psy.psytest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "psy_test_type")
@AllArgsConstructor
@Getter
public class PsyTestType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long psyTestTypeNo;
    private String title;

    @OneToMany(mappedBy = "psyTestType", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<PsyTest> psyTests = new ArrayList<>();

    public List<PsyTestCustom> getPsyTestsWithoutNo() {
        return psyTests.stream()
                .map(test -> new PsyTestCustom(test.getPsy_test_no(), test.getTitle(), test.getContent(), test.getTarget(), test.getTime()))
                .collect(Collectors.toList());
    }

    @Getter
    @AllArgsConstructor
    public static class PsyTestCustom {
        private int psy_test_no;
        private String title;
        private String content;
        private String target;
        private String time;


    }
}
