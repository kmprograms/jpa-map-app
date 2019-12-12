package com.app.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@Embeddable
public class Contact {

    private String email;
    private String phoneNumber;
}
