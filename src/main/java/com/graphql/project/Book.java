package com.graphql.project;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue
    public long bookId;

    public String name;
    public String publisher;

    @ManyToOne(fetch = FetchType.LAZY)
    public Author author;

}
