package com.app.service;

import com.app.dto.CreatePersonDto;
import com.app.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public Long create(CreatePersonDto createPersonDto) {

        if (createPersonDto == null) {
            throw new IllegalStateException("create exception");
        }

        return personRepository
                .save(createPersonDto.toEntity())
                .getId();
    }
}
