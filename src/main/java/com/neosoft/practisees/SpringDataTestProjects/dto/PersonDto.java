package com.neosoft.practisees.SpringDataTestProjects.dto;

public class PersonDto {

    public PersonDto(String name, String email) {
        this.name = name;
        this.email = email;
    }
    private String name;

    private String email;

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


}
