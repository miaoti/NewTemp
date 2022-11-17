package edu.baylor.cs.se.hibernate.services;

import edu.baylor.cs.se.hibernate.model.Book;
import edu.baylor.cs.se.hibernate.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service

public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }

    public Book save(Book student)
    {
        return studentRepository.save(student);
    }

    public List<Book> getAllStudents() {return studentRepository.findAll(); }

    public Book findById(Long id)
    {
        Optional<Book> std = studentRepository.findById(id);
        if(std.isPresent())
        {
            Book s = std.get();
            return s;
        }
        else
            return null;
    }

    public List<Book> findByName(String name) {return studentRepository.findByAuthername(name); }

    @DeleteMapping("/delete/{id}")
    public List<Book> deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
        return studentRepository.findAll();
    }

    public Book update(Book student)
    {
        Optional<Book> std = studentRepository.findById(student.getStudentId());
        if(std.isPresent())
        {
            Book s = std.get();
            s.setName(student.getName());
            s.setDate(student.getDate());
            s.setAddress(student.getAuthername());
            s.setCopy(s.getCopy());
            return studentRepository.save(s);
        }
        else
            return null;
    }
}
