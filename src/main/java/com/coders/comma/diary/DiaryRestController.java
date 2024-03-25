package com.coders.comma.diary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiaryRestController {
    private final Logger logger = LoggerFactory.getLogger(DiaryRestController.class);

    @Autowired
    DiaryService diaryService;

}
