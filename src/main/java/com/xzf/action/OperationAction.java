package com.xzf.action;

import com.xzf.domain.UserInfo;
import com.xzf.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class OperationAction {
    @Autowired
    private OperationService operationService;

    @RequestMapping("getUserInfo")
    @ResponseBody
    public UserInfo getUserInfo(HttpServletRequest request) throws Exception {
        UserInfo userInfo = operationService.getUserInfoByUsername((String) request.getSession().getAttribute("username"));

        System.out.println(userInfo);

        return userInfo;
    }
}
