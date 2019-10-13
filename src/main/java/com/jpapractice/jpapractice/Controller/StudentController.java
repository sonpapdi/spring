package com.jpapractice.jpapractice.Controller;
import com.jpapractice.jpapractice.Model.Student;
import com.jpapractice.jpapractice.Repository.StudenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
public class StudentController {

    @Autowired
    StudenRepository studenRepository;

    @PostMapping(value = "/insertdata")
    public String savedata(@RequestBody Student student){
        studenRepository.save(student);
        return "inserted";
    }
@GetMapping(value = "/findById/{id}")
    public Optional<Student> findById(@PathVariable Integer id){
    Optional<Student> student=studenRepository.findById(id);
    return student;
}
@GetMapping(value = "/findByName/{name}")
    public List<Student> findByName(@PathVariable String name){
    List<Student> list=studenRepository.findByName(name);
    return list;
}
@GetMapping(value = "/findByAddress/{address}")
    public List<Student> findByAddress(@PathVariable String address){
        List<Student> list=studenRepository.findByAddress(address);
        return list;
}

}
