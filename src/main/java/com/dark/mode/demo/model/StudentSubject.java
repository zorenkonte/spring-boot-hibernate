package com.dark.mode.demo.model;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class StudentSubject extends BaseEntity {
    @ManyToOne(cascade = CascadeType.MERGE)
    private Student student;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Subject subject;
}
