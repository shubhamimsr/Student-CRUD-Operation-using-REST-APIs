package mypackage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mypackage.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
