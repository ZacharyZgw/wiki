package com.zgw.wiki.mapper;

import com.zgw.wiki.domain.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TestMapper {
    public List<Test> findAllTest();
}
