package com.app.dto;

import com.app.model.ContactType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactDto {
    private ContactType contactType;
    private String email;
    private String phoneNumber;
}
