package com.coders.comma.psy.psytest;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "psy_test")
public class PsyTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "psy_test_no")
    private int psy_test_no;

    private String psy_test_title;
    private String psy_test_contents;
    private String psy_test_target;
    private String psy_test_time;
    private String psy_test_method;

    public void setPsyTestNo(int psy_test_no) { this.psy_test_no = psy_test_no; }
}
