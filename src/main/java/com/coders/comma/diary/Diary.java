package com.coders.comma.diary;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Diary {
    int dairy_no;
    int member_id;
    String dairy_contents;
    String dairy_coretag;
    LocalDateTime dairy_date;
}
