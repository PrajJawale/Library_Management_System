package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.Dto.RequestDto.StudentrequestDto;
import com.example.LibraryManagementSystem.Dto.responseDtos.StudentResponseDto;
import com.example.LibraryManagementSystem.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

public interface studentService {
   public String addStudent(StudentrequestDto studentrquestDto);
   String deleteStudentBYID(int id);

//   StudentResponseDto getStudentBYID(StudentrequestDto studentrequestDto);
}
