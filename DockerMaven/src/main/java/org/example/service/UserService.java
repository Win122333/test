package org.example.service;

import org.example.db.Testtable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public void getAll() {
        System.out.println(userRepository.findAll());
    }
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }
    @Transactional
    public void insert(Testtable testtable) {
        userRepository.save(testtable);
    }
    public List<Testtable> getBySurname(String surname) {
        return userRepository.findALLBySurname(surname);
    }
    @Transactional
    public int deleteBySurname(String surname) {
        return userRepository.deleteAllBySurname(surname);
    }
    @Transactional
    public int deleteAllByAge(int age) {
        return userRepository.deleteAllByAge(age);
    }
    @Transactional
    public void updateAllBySurname(Testtable testtable, String surname) {
         updateAllBySurname(testtable, surname);
    }
}
