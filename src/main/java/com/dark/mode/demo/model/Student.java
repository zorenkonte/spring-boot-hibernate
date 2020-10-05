package com.dark.mode.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

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
}
