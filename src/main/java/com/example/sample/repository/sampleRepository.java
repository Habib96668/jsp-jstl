package com.example.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample.model.sampleEntity;

@Repository
public interface sampleRepository extends JpaRepository<sampleEntity,Integer>{

}
