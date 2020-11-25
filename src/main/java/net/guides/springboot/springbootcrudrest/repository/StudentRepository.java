package net.guides.springboot.springbootcrudrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot.springbootcrudrest.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
