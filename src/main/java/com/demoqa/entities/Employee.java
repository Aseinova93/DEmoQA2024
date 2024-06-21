package com.demoqa.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Employee {

    private String firstname;
    private String lastname;
    private Integer age;
    private String email;
    private Long salary;
    private String department;


}
