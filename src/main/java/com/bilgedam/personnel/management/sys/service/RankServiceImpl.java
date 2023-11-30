package com.bilgedam.personnel.management.sys.service;

import com.bilgedam.personnel.management.sys.dto.RankModel;
import com.bilgedam.personnel.management.sys.mapper.RankMapper;
import com.bilgedam.personnel.management.sys.mapper.RankMapperImpl;
import com.bilgedam.personnel.management.sys.repository.RankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankServiceImpl implements RankService {

    @Autowired
    RankRepository rankRepository;



    @Override
    public List<RankModel> getAll() {
        return RankMapper.INSTANCE.convertEntityListToModelList(rankRepository.findAll());
    }

    @Override
    public RankModel getById(Long id) {
        return RankMapper.INSTANCE.convertEntityToModel(rankRepository.getById(id));
    }

    @Override
    public RankModel create(RankModel model) {
        return RankMapper.INSTANCE.convertEntityToModel(rankRepository.save(RankMapper.INSTANCE.convertModelToEntity(model)));
    }

    @Override
    public RankModel update(RankModel model) {
        return RankMapper.INSTANCE.convertEntityToModel(rankRepository.save(RankMapper.INSTANCE.convertModelToEntity(model)));
    }

    @Override
    public void delete(Long id) {
        rankRepository.deleteById(id);
    }
}
