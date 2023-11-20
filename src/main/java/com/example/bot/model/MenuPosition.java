package com.example.bot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "menu_position")
public class MenuPosition {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "menu_position_id")
    Long id;
    
    String name;

    Integer kkal;

    @ManyToOne(targetEntity = Category.class)
    Category parent;
}
