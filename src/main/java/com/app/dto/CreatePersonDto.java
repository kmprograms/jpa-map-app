package com.app.dto;

import com.app.model.Contact;
import com.app.model.ContactType;
import com.app.model.Person;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CreatePersonDto {
    private String name;
    private String surname;
    private List<ContactDto> contacts;

    public Person toEntity() {
        return Person.builder()
                .name(name)
                .surname(surname)
                .contacts(contacts
                        .stream()
                        .collect(Collectors.toMap(
                                ContactDto::getContactType,
                                c -> Contact
                                        .builder()
                                        .email(c.getEmail())
                                        .phoneNumber(c.getPhoneNumber())
                                        .build())))
                .build();
    }
}
