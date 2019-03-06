package com.xzf.service;

import com.xzf.domain.UserInfo;
import org.springframework.stereotype.Service;

@Service
public interface OperationService {
    public UserInfo getUserInfoByUsername(String username) throws Exception;
}
