package com.graphql.project;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue
    public Long authorId;
    public String name;
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    public List<Book> books = new ArrayList<>();

}
