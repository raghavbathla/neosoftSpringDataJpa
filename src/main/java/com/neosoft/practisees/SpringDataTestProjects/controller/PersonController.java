package com.neosoft.practisees.SpringDataTestProjects.controller;


import com.neosoft.practisees.SpringDataTestProjects.dto.PersonDto;
import com.neosoft.practisees.SpringDataTestProjects.dto.ResponseDto;
import com.neosoft.practisees.SpringDataTestProjects.model.PersonEntity;
import com.neosoft.practisees.SpringDataTestProjects.service.IPersonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/check")
public class PersonController
{

    @Autowired
    IPersonResponse personResponse;
@GetMapping("/get")
public ResponseEntity<ResponseDto> getPerson(){
List<PersonEntity> personEntities = personResponse.getPerson();
return new ResponseEntity<ResponseDto>(new ResponseDto("Success",personEntities), HttpStatus.OK);
}

    @PostMapping("/post")
    public ResponseEntity<ResponseDto> addData(@RequestBody PersonDto personDto){
      PersonEntity personEntity = personResponse.addPerson(personDto);
        return new ResponseEntity<ResponseDto>(new ResponseDto("Success",personEntity), HttpStatus.OK);
    }
    @GetMapping("/getById/{personId}")
    public ResponseEntity<ResponseDto> getPersonById(@PathVariable("personId") int personId){
        PersonEntity personEntities = personResponse.getById(personId);
        return new ResponseEntity<ResponseDto>(new ResponseDto("Success",personEntities), HttpStatus.OK);
    }
    @PutMapping("/update/{personId}")
    public ResponseEntity<ResponseDto> updatePerson(@PathVariable("personId") int personId, @RequestBody PersonDto personDto){
        PersonEntity personEntities = personResponse.updateById(personId,personDto);
        return new ResponseEntity<ResponseDto>(new ResponseDto("Success",personEntities), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<ResponseDto> delete(@PathVariable("personId") int personId){
        personResponse.deleteById(personId);
        return new ResponseEntity<ResponseDto>(new ResponseDto("Success","Deleted"), HttpStatus.OK);
    }

}



