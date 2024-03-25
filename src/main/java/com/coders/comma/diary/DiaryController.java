package com.coders.comma.diary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DiaryController {
    @RequestMapping("/diary")
    public String diaryPage() { return "/diary/diary"; }

}
