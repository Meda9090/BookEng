package com.example.Book.Repository;

import com.example.Book.Entity.EngCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EngRepository extends JpaRepository<EngCourse, Long> {
}
