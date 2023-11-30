package com.bilgedam.personnel.management.sys.mapper;

import com.bilgedam.personnel.management.sys.dto.PersonnelModel;
import com.bilgedam.personnel.management.sys.entity.Personnel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PersonnelMapper {

    PersonnelMapper INSTANCE = Mappers.getMapper(PersonnelMapper.class);

    PersonnelModel convertEntityToModel(Personnel personnel);

    Personnel convertModelToEntity(PersonnelModel personnel);

    List<Personnel> convertModelListToEntityList(List<PersonnelModel> personnelModelList);

    List<PersonnelModel> convertEntityListToModelList(List<Personnel> personnelModelList);


}
