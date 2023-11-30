package com.bilgedam.personnel.management.sys.mapper;

import com.bilgedam.personnel.management.sys.dto.PersonnelModel;
import com.bilgedam.personnel.management.sys.dto.RankModel;
import com.bilgedam.personnel.management.sys.entity.Personnel;
import com.bilgedam.personnel.management.sys.entity.Rank;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RankMapper {

        RankMapper INSTANCE = Mappers.getMapper(RankMapper.class);

        RankModel convertEntityToModel(Rank rank);

        Rank convertModelToEntity(RankModel personnel);

        List<Rank> convertModelListToEntityList(List<RankModel> personnelModelList);

        List<RankModel> convertEntityListToModelList(List<Rank> personnelModelList);
}
