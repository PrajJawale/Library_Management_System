package com.example.LibraryManagementSystem.Dto.responseDtos;

import com.example.LibraryManagementSystem.enums.CardStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CardResponseDto {


    private Date issueDate;


    private CardStatus cardStatus;


    private String validTill;
}
