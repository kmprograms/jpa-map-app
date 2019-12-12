package com.app.controller;

import com.app.dto.CreatePersonDto;
import com.app.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    /*
        {
            "name": "JOHN",
            "surname": "SMITH",
            "contacts": [
                {
                    "contactType": "PRIVATE",
                    "email": "private@gmail.com",
                    "phoneNumber": "123456789"
                },
                {
                    "contactType": "WORK",
                    "email": "work@gmail.com",
                    "phoneNumber": "999456789"
                }
            ]
        }
    */
    @PostMapping
    public Long create(@RequestBody CreatePersonDto createPersonDto) {
        return personService.create(createPersonDto);
    }
}
