package com.example.bot.repository;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.example.bot.model.MenuPosition;

public interface MenuPositionRepository extends Neo4jRepository<MenuPosition, Long>  {
    MenuPosition findByName(String name);
	List<MenuPosition> findByParent_Name(String name);
}
