package com.xcy.service.impl;

import com.xcy.dao.CaseMapper;
import com.xcy.pojo.Cases;
import com.xcy.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseServiceImpl implements CaseService {

    @Autowired
    private CaseMapper  caseMapper;

    @Override
    public List<Cases> selectAllCase() {
        return caseMapper.selectAllCase();
    }

    @Override
    public int selectById(int id) {
        return caseMapper.selectById(id);
    }

    @Override
    public int selectByName(String string) {
        return caseMapper.selectByName(string);
    }

    @Override
    public int insertCases(Cases cases) {
        return caseMapper.insertCases(cases);
    }

    @Override
    public int updateCases(Cases cases) {
        return caseMapper.updateCases(cases);
    }
}
