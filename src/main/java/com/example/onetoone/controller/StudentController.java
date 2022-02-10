package com.example.onetoone.controller;

import com.example.onetoone.entity1.Address;
import com.example.onetoone.entity1.Sports;
import com.example.onetoone.entity1.StudentDto;
import com.example.onetoone.entity1.Students;
import com.example.onetoone.repository.AddressRepository;
import com.example.onetoone.repository.SportRepository;
import com.example.onetoone.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController

public class StudentController {
@Autowired

StudentRepository studrepository;
/*@Autowired
SportRepository sportRepository;*/
@Autowired
    AddressRepository addressRepository;
/*@PostMapping("/studentMapping")
    public Students addDetails(@RequestBody Students stud ){
 Students result=studrepository.save(stud);
 return result;
}
@PostMapping("/sportMapping")
public Sports addSports(@RequestBody  Sports  sportref){
    Sports res=sportRepository.save(sportref);
    return res;
}
@PostMapping("/addDto")
public Students addinfo(@RequestBody StudentDto studentDto){
    Sports sports=new Sports();
    sports.setSportType(studentDto.getSportType());
    Sports dtt=sportRepository.save(sports);
Students students=new Students();
    students.setStudentName(studentDto.getStudentName());
 //   students.setPlace(studentDto.getPlace());
    students.setSports(dtt);
    Students stt=studrepository.save(students);

   stt.setSports(dtt);
   return  stt;
}
@GetMapping("getDto")
public List<StudentDto> getinfo(Students students ){
    List<StudentDto>  studentDto= (List<StudentDto>) new StudentDto();
    List<Students> stud= studrepository.findAll();
    List<Sports> sports=sportRepository.findAll();
    studentDto.add((StudentDto) stud);
    studentDto.add((StudentDto) sports);

    return studentDto;
}

   @GetMapping("/getDto/{studentId}")
public StudentDto getDetails(@PathVariable(  "studentId") String studentId){
Students student=studrepository.getById(studentId);
//Students std=student.get();

StudentDto studentDto= new StudentDto();
        studentDto.setStudentName(student.getStudentName());
        studentDto.setSportType(student.getSports().getSportType());
        return studentDto;
}
@PutMapping("/updateDto/{studenId}")
public  StudentDto updateDetail(@PathVariable("studentId") String studentId,@RequestBody Students students){
    StudentDto studentDto=new StudentDto();
    Students std=studrepository.getById(studentId);
    Sports sports=new Sports();
    studentDto.setSportType(students.getSports().getSportType());
    Sports sport=sportRepository.save(sports);
    students.setStudentName(studentDto.getStudentName());
    Students sss=studrepository.save(students);
    students.setSports(sport);
   // return students;
}*/
    @PostMapping("/AddressMapping")
    public Students addInfo(@RequestBody Students studDetails ){
      Students students=studrepository.save(studDetails);
      return students;
    }
    @DeleteMapping("/deleteMapping/{studentId}")
public String deleteDetails(@PathVariable("studentId") String studentId){
        studrepository.deleteById(studentId);
        return "deleted Successfully";
}
}




