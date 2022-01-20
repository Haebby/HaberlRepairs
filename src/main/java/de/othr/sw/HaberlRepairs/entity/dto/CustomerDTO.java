package de.othr.sw.HaberlRepairs.entity.dto;

import javax.validation.constraints.NotBlank;

public class CustomerDTO {

    @NotBlank
    private String name;
    @NotBlank
    private String password;

    public CustomerDTO(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "customerDTO{" +
                "name='" +name+'\''+
                "password='" +password+
                '}';
    }
}
