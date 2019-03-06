package com.xzf.mapper;

import com.xzf.domain.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationDao {
    public UserInfo selectOperationsByUsername(String username) throws Exception;
}
