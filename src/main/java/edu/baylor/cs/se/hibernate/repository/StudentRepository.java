package edu.baylor.cs.se.hibernate.repository;

import edu.baylor.cs.se.hibernate.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

public interface StudentRepository extends JpaRepository<Book,Long>{
    List<Book> findByAuthername(String name);
}
