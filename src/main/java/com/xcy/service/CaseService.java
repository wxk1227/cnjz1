package com.xcy.service;


import com.xcy.pojo.Cases;

import java.util.List;

public interface CaseService {
    List<Cases> selectAllCase();

    int selectById(int id);

    int selectByName(String string);

    int insertCases(Cases cases);

    int updateCases(Cases cases);

}
