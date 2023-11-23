package com.example.bot.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Node("MenuPosition")
public class MenuPosition {
   
    @Id
    Long id;
    
    String name;

    Integer kkal;

    @Relationship(type = "PARENT_CATEGORY", direction = Relationship.Direction.INCOMING)
    Category parent;
}
