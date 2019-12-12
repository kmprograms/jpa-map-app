package com.app.model;

import lombok.*;

import javax.persistence.*;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "people")
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String surname;

    @ElementCollection
    @CollectionTable(name = "people_contacts")
    @MapKeyColumn(name = "contact_type")
    @MapKeyEnumerated(EnumType.STRING)
    private Map<ContactType, Contact> contacts;

    public Long getId() {
        return id;
    }
}
