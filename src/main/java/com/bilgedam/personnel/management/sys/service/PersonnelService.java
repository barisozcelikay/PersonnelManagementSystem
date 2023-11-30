package com.bilgedam.personnel.management.sys.service;


import com.bilgedam.personnel.management.sys.dto.PersonnelModel;

import java.util.List;

public interface PersonnelService {


    public List<PersonnelModel> getAll();

    public PersonnelModel getById(Long id);

    public PersonnelModel create(PersonnelModel model);

    public PersonnelModel update(PersonnelModel model);

    public void delete(Long id);


}
