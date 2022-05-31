package com.atguigu.imperial.court.dao.api;

import com.atguigu.imperial.court.entity.Emp;

/**
 * @author zhr
 * @create 2022-05
 */
public interface EmpDao {
    Emp selectEmpByLoginAccount(String loginAccount, String encodedLoginPassword);
}
