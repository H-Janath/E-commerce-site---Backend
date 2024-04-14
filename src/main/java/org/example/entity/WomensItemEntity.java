package org.example.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class WomensItemEntity {
    @Id
    private int id;
    private String name;
    private String feature;
    private String fabricType;
    private String fabricCare;
    private String note;
}
