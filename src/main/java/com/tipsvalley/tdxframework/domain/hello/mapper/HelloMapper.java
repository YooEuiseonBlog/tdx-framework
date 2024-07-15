package com.tipsvalley.tdxframework.domain.hello.mapper;

import com.tipsvalley.tdxframework.dao.Hello;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HelloMapper {
    List<Hello> findAll();
}
