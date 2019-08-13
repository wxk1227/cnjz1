package com.xcy.dao;


import com.xcy.pojo.Cases;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CaseMapper {

    List<Cases> selectAllCase();

    int selectById(int id);

    int selectByName(String string);

    int insertCases(Cases cases);

    int updateCases(Cases cases);

}
