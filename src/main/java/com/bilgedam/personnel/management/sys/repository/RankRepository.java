package com.bilgedam.personnel.management.sys.repository;

import com.bilgedam.personnel.management.sys.entity.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankRepository extends JpaRepository<Rank,Long> {
}
