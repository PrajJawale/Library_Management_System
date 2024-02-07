package com.example.LibraryManagementSystem.Dto.RequestDto;

import com.example.LibraryManagementSystem.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class StudentrequestDto {
    private String name;
    private int age ;

    private Department department;


}
