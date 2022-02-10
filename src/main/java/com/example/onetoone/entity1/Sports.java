package com.example.onetoone.entity1;

import com.example.onetoone.entity1.Students;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Sports {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
   //@Column(name = "sport_id")

    private String sportId;
    private String sportType;


 // @OneToOne(mappedBy = "sports")

   // private Students students;
}




