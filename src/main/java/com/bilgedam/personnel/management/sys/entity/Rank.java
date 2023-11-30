package com.bilgedam.personnel.management.sys.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tb_rank") //we can use when table name is reserved word
@Getter
@Setter
public class Rank {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "milRank")
    private String rank;

    private Double salary;

    private LocalDate startDate;

    private LocalDate endDate;

    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "personnel_id")
    private Personnel personnel;



}
