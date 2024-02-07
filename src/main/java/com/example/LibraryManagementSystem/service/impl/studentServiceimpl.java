package com.example.LibraryManagementSystem.service.impl;

import com.example.LibraryManagementSystem.Dto.RequestDto.StudentrequestDto;
import com.example.LibraryManagementSystem.enums.CardStatus;
import com.example.LibraryManagementSystem.model.Card;
import com.example.LibraryManagementSystem.model.Student;
import com.example.LibraryManagementSystem.repository.studentRepository;
import com.example.LibraryManagementSystem.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentServiceimpl implements studentService {
    @Autowired
    studentRepository studentrepository;

    public String addStudent(StudentrequestDto studentrequestDto){
        //Card card = new Card();
       Student student = new Student();
       student.setAge(studentrequestDto.getAge());
       student.setName(studentrequestDto.getName());
       student.setDepartment(studentrequestDto.getDepartment());

       Card card = new Card();
       card.setCardStatus(CardStatus.ACTIVATED);
       card.setValidTill("2024-12-31");
       card.setStudent(student);

       student.setCard(card);

       studentrepository.save(student);


        return "Student Addecd Successfully ";
    }


    @Override
    public String deleteStudentBYID(int id) {
        studentrepository.deleteById(id);
        return "Studet Remove From DB ";
    }


}
