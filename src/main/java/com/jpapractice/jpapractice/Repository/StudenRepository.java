package com.jpapractice.jpapractice.Repository;

import com.jpapractice.jpapractice.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface StudenRepository extends JpaRepository<Student,Integer> {

List<Student> findByName(String name);
List<Student> findByAddress(String address);
}
