package com.neosoft.practisees.SpringDataTestProjects.model;

import com.neosoft.practisees.SpringDataTestProjects.dto.PersonDto;
import jakarta.persistence.*;

@Entity
@Table(name = "PersonInfo")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Person_Id")
    private Integer person_id;
    private  String name;
    private String email;

    public PersonEntity(PersonDto personDto) {
       this.update(personDto);
    }

    public void update(PersonDto personDto){
     this.name = personDto.getName();
     this.email = personDto.getEmail();
 }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PersonEntity() {
    }
}
