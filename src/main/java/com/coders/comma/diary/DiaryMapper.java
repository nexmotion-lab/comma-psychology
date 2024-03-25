package com.coders.comma.diary;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface DiaryMapper {
    public List<Diary> selectAllDiary(Diary diary);
    public Diary selectDiary(Diary diary);
    public List<Diary> searchDiary(String keyword);
    public Diary insertDiary(Diary diary);
    public Diary updateDiary(Diary diary);
    public Diary deleteDiary(Diary diary);
}
