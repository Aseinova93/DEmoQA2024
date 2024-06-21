package com.demoqa.pages;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Builder
@NoArgsConstructor
public class DemoQAPages {

    public TextBoxPage textBoxPage = new TextBoxPage();
    public CheckBoxPage checkBoxPage = new CheckBoxPage();
    public PracticeFormPage practiceFormPage = new PracticeFormPage();
    public AlertPage alertPage = new AlertPage();
    public PFormPageAlert pFormPageAlert = new PFormPageAlert();
    public PFormPageAlert alert = new PFormPageAlert();
    public ButtonsPage buttonsPage = new ButtonsPage();
    public ButtonsPage rightClickButton  = new ButtonsPage();
    public MenuPage menuPage = new MenuPage();
    public ProgressBar progressBar = new ProgressBar();
    public WebTablePage webTablePage = new WebTablePage();




    }



