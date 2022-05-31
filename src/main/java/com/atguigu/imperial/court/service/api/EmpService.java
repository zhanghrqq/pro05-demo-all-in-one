package com.atguigu.imperial.court.service.api;

import com.atguigu.imperial.court.entity.Emp;

/**
 * @author zhr
 * @create 2022-05
 */
public interface EmpService {
    Emp getEmpByLoginAccount(String loginAccount, String loginPassword);
}
