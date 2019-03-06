package com.xzf.serviceImpl;

import com.xzf.domain.UserInfo;
import com.xzf.mapper.OperationDao;
import com.xzf.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {


    @Autowired
    private OperationDao operationDao;


    @Override
    public UserInfo getUserInfoByUsername(String username) throws Exception{
        return operationDao.selectOperationsByUsername(username);
    }
}
