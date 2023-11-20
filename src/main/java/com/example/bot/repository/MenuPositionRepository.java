package com.example.bot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bot.model.MenuPosition;

public interface MenuPositionRepository extends JpaRepository<MenuPosition, Long>  {
    MenuPosition findByName(String name);
	List<MenuPosition> findByParent_Name(String name);
}
