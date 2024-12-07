package org.example.service;

import org.example.db.Testtable;
import org.example.db.Testtable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<Testtable, Integer> {
    List<Testtable> findALLBySurname(String surname);
    int deleteAllBySurname(String surname);
    int deleteAllByAge(int age);
    void updateAllBySurname(Testtable testtable, String surname);
}
