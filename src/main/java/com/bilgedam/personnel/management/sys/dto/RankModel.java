package com.bilgedam.personnel.management.sys.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RankModel {

    private Long id;

    private String milRank;

    private Double salary;

    private LocalDate startDate;

    private LocalDate endDate;

    private Boolean isActive;

    private Long personnelId;

    

}
