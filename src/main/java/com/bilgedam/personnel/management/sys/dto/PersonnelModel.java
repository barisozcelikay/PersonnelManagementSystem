package com.bilgedam.personnel.management.sys.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonnelModel {

    private Long id;

    private String name, surname;

    private LocalDate joinDate;

    //@Size(max = 3)
    @NotEmpty
    private List<RankModel> rankModelList = new ArrayList<>();


}
