package com.sound.weblog.dao;


import com.sound.weblog.entity.TestUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestMapper {
    TestUser Sel(@Param("id") int id);
}
