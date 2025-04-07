package com.springboot.repo;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.student;

public interface Repository extends CrudRepository<student, Integer>{

}
