package com.example.bot.repository;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.example.bot.model.Category;

public interface CategoryRepository extends Neo4jRepository<Category, Long>   {
    Category findByName(String name);
    List<Category> findByParent_Name(String name);
}
