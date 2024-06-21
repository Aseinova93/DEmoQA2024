package com.demoqa.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Builder
@NoArgsConstructor
public class PracticeFormEntity {
     public String firstName;
     public String lastName;
     public String email;
     public String mobileNumber;
     public String subjects;
     public String currentAddress;
}
