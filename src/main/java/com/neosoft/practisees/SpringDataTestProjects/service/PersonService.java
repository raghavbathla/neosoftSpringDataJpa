package com.neosoft.practisees.SpringDataTestProjects.service;

import com.neosoft.practisees.SpringDataTestProjects.dto.PersonDto;
import com.neosoft.practisees.SpringDataTestProjects.model.PersonEntity;
import com.neosoft.practisees.SpringDataTestProjects.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonResponse{

    @Autowired
    private PersonRepo personRepo;
    @Override
    public List<PersonEntity> getPerson() {
        return personRepo.findAll();
    }

    @Override
    public PersonEntity addPerson(PersonDto personDto) {
       PersonEntity personEntity = new PersonEntity(personDto);

       return personRepo.save(personEntity);
    }

    @Override
    public PersonEntity getById(int id) {
       return personRepo.findById(id).orElseThrow();
    }

    @Override
    public void deleteById(int id) {
        PersonEntity personEntity = this.getById(id);
        personRepo.delete(personEntity);
    }

    @Override
    public PersonEntity updateById(int id, PersonDto personDto) {
     PersonEntity personEntity = this.getById(id);
     personEntity.update(personDto);
     return personRepo.save(personEntity);
    }

}
