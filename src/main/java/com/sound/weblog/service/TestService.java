package com.sound.weblog.service;

import com.sound.weblog.dao.TestMapper;
import com.sound.weblog.entity.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;

    public TestUser Sel(int id){
        return testMapper.Sel(id);
    }

    public TestMapper getTestMapper() {
        return testMapper;
    }

    public void setTestMapper(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

}
