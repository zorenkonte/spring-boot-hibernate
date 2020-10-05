package com.dark.mode.demo.model;

import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class StudentDetail extends BaseEntity {
    private String email;
    private String contactNumber;
    private String address;
    private String gender; //TODO: convert to enum
}
