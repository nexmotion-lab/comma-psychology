package com.coders.comma.psyinfo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "psy_info")
public class PsyInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "psy_info_no")
    private int psy_info_no;

    private String psy_info_title;
    private String psy_info_contents;
    private String psy_info_image;

    public void setPsyInfoNo(int psy_info_no) {
        this.psy_info_no = psy_info_no;
    }
}