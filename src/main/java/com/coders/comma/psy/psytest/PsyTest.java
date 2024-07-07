package com.coders.comma.psy.psytest;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Getter
@Table(name = "psy_test")
public class PsyTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "psy_test_no")
    private int psy_test_no;
    private String title;
    private String content;
    private String target;
    private String time;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "psy_test_type_no")
    private PsyTestType psyTestType;

    public void setPsyTestNo(int psy_test_no) { this.psy_test_no = psy_test_no; }
}
