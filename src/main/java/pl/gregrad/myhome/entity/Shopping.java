package pl.gregrad.myhome.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Shopping")
public class Shopping {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer price;
    private LocalDateTime date;

}
