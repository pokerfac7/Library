package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "year")
    private LocalDate year;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(table = "author", name = "author_id", updatable = false)
    private Author author;
//    @OneToMany()
//    private List<User> users;
}


