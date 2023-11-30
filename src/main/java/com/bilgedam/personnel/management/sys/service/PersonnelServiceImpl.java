package com.bilgedam.personnel.management.sys.service;

import com.bilgedam.personnel.management.sys.dto.PersonnelModel;
import com.bilgedam.personnel.management.sys.dto.RankModel;
import com.bilgedam.personnel.management.sys.mapper.PersonnelMapper;
import com.bilgedam.personnel.management.sys.repository.PersonnelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelServiceImpl implements PersonnelService {


    @Autowired
    PersonnelRepository personnelRepository;


    @Override
    public List<PersonnelModel> getAll() {
        return PersonnelMapper.INSTANCE.convertEntityListToModelList(personnelRepository.findAll());
    }

    @Override
    public PersonnelModel getById(Long id) {
        return PersonnelMapper.INSTANCE.convertEntityToModel(personnelRepository.getById(id));
    }

    @Override
    public PersonnelModel create(PersonnelModel model) {
        return PersonnelMapper.INSTANCE.convertEntityToModel(personnelRepository.save(PersonnelMapper.INSTANCE.convertModelToEntity(model)));
    }

    @Override
    public PersonnelModel update(PersonnelModel model) {
        return PersonnelMapper.INSTANCE.convertEntityToModel(personnelRepository.save(PersonnelMapper.INSTANCE.convertModelToEntity(model)));
    }

    @Override
    public void delete(Long id) {
        personnelRepository.deleteById(id);
    }
}
