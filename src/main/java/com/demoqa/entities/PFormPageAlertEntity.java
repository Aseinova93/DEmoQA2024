package com.demoqa.entities;

import lombok.*;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Builder
@NoArgsConstructor

public class PFormPageAlertEntity {
    public String firstName;
    public String lastName;
    public String email;
    public WebElement gender;
    public int mobileNumber;
    public String subjects;
    public String uploadPicture;
    public String currentAddress;
    public String selectState;
    public String selectCity;
}


