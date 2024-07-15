package com.tipsvalley.tdxframework.domain.hello.repository;

import com.tipsvalley.tdxframework.dao.Hello;
import com.tipsvalley.tdxframework.domain.hello.mapper.HelloMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class HelloRepository {
    private final HelloMapper helloMapper;

    public List<Hello> findAll() {
        return helloMapper.findAll();
    }
}
