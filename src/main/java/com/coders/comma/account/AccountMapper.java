package com.coders.comma.account;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountMapper {
    public Account getAccount(@Param("userid") String userid);
}
