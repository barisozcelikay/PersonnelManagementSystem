package com.bilgedam.personnel.management.sys.service;


import com.bilgedam.personnel.management.sys.dto.RankModel;

import java.util.List;

public interface RankService {

    public List<RankModel> getAll();

    public RankModel getById(Long id);

    public RankModel create(RankModel model);

    public RankModel update(RankModel model);

    public void delete(Long id);
}
