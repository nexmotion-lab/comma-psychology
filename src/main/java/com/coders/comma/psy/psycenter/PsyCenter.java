package com.coders.comma.psy.psycenter;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "psy_center")
public class PsyCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "psy_center_no")
    private int psy_center_no;

    private String name;
    private String description;
    private String logo;
    private String method;
    private String subject;
    private String time;
    private String category;
    private String link;
    private String info_description;

    public void setPsyCenterNo(int psy_center_no) {
        this.psy_center_no = psy_center_no;
    }
}