package com.bilgedam.personnel.management.sys.repository;

import com.bilgedam.personnel.management.sys.entity.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonnelRepository extends JpaRepository<Personnel,Long> {

}
