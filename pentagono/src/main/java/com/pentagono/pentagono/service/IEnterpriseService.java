package com.pentagono.pentagono.service;

import com.pentagono.pentagono.model.Employee;
import com.pentagono.pentagono.model.Enterprise;

import java.util.List;

public interface IEnterpriseService extends ICRUD<Enterprise, Long> {

    List<Enterprise> getAllEnterprises();
    void saveEnterprise(Enterprise enterprise);

    Enterprise getEnterpriseById(long id);

    void deleteEnterpriseById(Long id);



}
