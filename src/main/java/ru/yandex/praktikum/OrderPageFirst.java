package ru.yandex.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderPageFirst {
    //Локатор кнопки заказа самоката в хедере главной странице
    @FindBy( how = How.CLASS_NAME, using = "Button_Button__ra12g")
    private SelenideElement buyButtonUpper;

    //Локатор кнопки заказа самоката в футере главной странице
    @FindBy( how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']")
    private SelenideElement buyButtonBottom;

    //Локатор кнопки по вводу Имени заказчика
    @FindBy(how = How.XPATH, using = "//*[@placeholder= '* Имя']")
    private SelenideElement firstNameInputField;

    //Локатор кнопки по вводу Фамилии заказчика
    @FindBy(how = How.XPATH, using = "//*[@placeholder= '* Фамилия']")
    private SelenideElement surNameInputField;

    //Локатор кнопки по вводу адреса,по которому следует привезти самокат
    @FindBy(how = How.XPATH, using = "//*[@placeholder= '* Адрес: куда привезти заказ']")
    private SelenideElement deliveryAddressInputField;

    //Локатор кнопки по вводу ближайшего метро,по указанному адресу выше
    @FindBy(how = How.XPATH, using = "//*[@placeholder= '* Станция метро']")
    private SelenideElement metroStationInputField;

    //Локатор кнопки по вводу номера телефона заказчика, по котормоу можно связаться
    @FindBy(how = How.XPATH, using = "//*[@placeholder= '* Телефон: на него позвонит курьер']")
    private SelenideElement phoneNumberInputField;

    //Локатор кнопки по клику по переходу на следующую страницу заполнении данных по заказу
    @FindBy(how = How.XPATH, using = ".//button[contains(text(),'Далее')]")
    private SelenideElement nextButton;

    //Метод клика по кнопке "Заказать" в хедере сайта
    public void clickBuyButtonInHeader() {buyButtonUpper.click();};

    //Метод ввода имени в поле ввода Имени заказчика
    public void setName(String name){
        firstNameInputField.sendKeys(name);
    }

    //Метод ввода фамилии в поле ввода Фамилии заказчика
    public void setSurName(String surName) {
        surNameInputField.sendKeys(surName);
    }

    //Метод ввода адреса в поле адреса,по которому следует привезти самокат
    public void setAdrresDelivery(String adressDelivery) {
        deliveryAddressInputField.sendKeys(adressDelivery);
    }

    //Метод ввода названия метро,ближайшего для адреса и потверждение его выбора
    public void setMetroStation(String metroStation) {
        metroStationInputField.sendKeys(metroStation);
        metroStationInputField.sendKeys(Keys.ARROW_DOWN);
        metroStationInputField.pressEnter();
    }

    //Метод ввода номера телефона заказчика
    public void setPhoneNumber(String phoneNumber) {
        phoneNumberInputField.sendKeys(phoneNumber);
    }

    //Метод перехода на следующую страницу оформления заказа
    public void nextPageOrder() {
        nextButton.click();
    }

    //Метод клика по кнопке "Заказать" в футере сайта
    public void clickBuyButtonInFooter(){buyButtonBottom.scrollIntoView(true).click();}

}