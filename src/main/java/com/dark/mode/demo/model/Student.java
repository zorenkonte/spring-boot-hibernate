package com.dark.mode.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Student extends BaseEntity {
    private String firstName;
    private String lastName;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("student")
    private StudentDetail studentDetail;
    @JsonIgnoreProperties("student")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student", fetch = FetchType.EAGER)
    private List<StudentSubject> studentSubjects;
}
