package com.pentagono.pentagono.repository;

import com.pentagono.pentagono.model.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEnum_RoleName extends JpaRepository<Enterprise,Integer> {
}
