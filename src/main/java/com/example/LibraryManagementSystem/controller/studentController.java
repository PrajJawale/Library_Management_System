package com.example.LibraryManagementSystem.controller;

import com.example.LibraryManagementSystem.Dto.RequestDto.StudentrequestDto;
import com.example.LibraryManagementSystem.Dto.responseDtos.StudentResponseDto;
import com.example.LibraryManagementSystem.model.Student;
import com.example.LibraryManagementSystem.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class studentController {

    @GetMapping("/getApi")
    public String getApi(){
        return "Hiii";
    }
    @Autowired
    studentService studentservice;
    @PostMapping("/add")
    public String addStudent(@RequestBody StudentrequestDto studenrequestDto){
       return  studentservice.addStudent(studenrequestDto);

    }

    @PostMapping("/deleteById")
    public String deleteStudentByID(@RequestParam("id") int id){
        return studentservice.deleteStudentBYID(id);
    }

//    @GetMapping("/getStudentById")
//    public StudentResponseDto getStudentById(StudentrequestDto studentrequestDto){
//
//    }
}
