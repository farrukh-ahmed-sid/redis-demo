package com.example.redisdemo.repository;

import com.example.redisdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @Autowired
    private RedisTemplate<String, Student> redisTemplate;

    private HashOperations hashOperations;

    public StudentRepositoryImpl(RedisTemplate<String, Student> redisTemplate){
        this.redisTemplate = redisTemplate;
        this.hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public Student findById(Integer id) {
        return (Student) hashOperations.get("Student", id);
    }

    @Override
    public Map<Integer, Student> findAll() {
        return hashOperations.entries("Student");
    }

    @Override
    public void save(Student student) {
        hashOperations.put("Student", student.getId(), student);
    }

    @Override
    public void update(Student student) {
        save(student);
    }

    @Override
    public void delete(Integer id) {
        hashOperations.delete("Student", id);
    }
}
