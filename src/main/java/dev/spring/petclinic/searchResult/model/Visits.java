package dev.spring.petclinic.searchResult.model;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Visits {
    private int id;
    private int petId;
    private LocalDate visitDate;
    private String description;
}
