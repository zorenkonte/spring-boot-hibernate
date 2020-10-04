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
@JsonIgnoreProperties(value = {"student"})
public class StudentDetail extends BaseEntity {
    private String email;
    private String contactNumber;
    private String address;
    private String gender; //TODO: convert to enum
    @ToString.Exclude
    @OneToOne(mappedBy = "studentDetail", cascade = CascadeType.ALL)
    private Student student; //bi-directional
}
