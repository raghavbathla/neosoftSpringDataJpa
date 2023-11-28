package com.neosoft.practisees.SpringDataTestProjects.service;

import com.neosoft.practisees.SpringDataTestProjects.dto.PersonDto;
import com.neosoft.practisees.SpringDataTestProjects.model.PersonEntity;

import java.util.List;

public interface IPersonResponse {

     List<PersonEntity> getPerson();
     PersonEntity addPerson(PersonDto personDto);

     PersonEntity getById(int id);

     void deleteById(int id);
     PersonEntity updateById(int id,PersonDto personDto);
}
