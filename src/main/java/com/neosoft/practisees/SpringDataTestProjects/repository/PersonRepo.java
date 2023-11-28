package com.neosoft.practisees.SpringDataTestProjects.repository;

import com.neosoft.practisees.SpringDataTestProjects.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepo extends JpaRepository<PersonEntity,Integer> {

}
