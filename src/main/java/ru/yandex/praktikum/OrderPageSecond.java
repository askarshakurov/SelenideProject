package ru.yandex.praktikum;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static org.junit.jupiter.api.Assertions.*;

public class OrderPageSecond {

    //Локатор поля по вводу даты когда необходимо доставить самокат
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Когда привезти самокат']")
    private SelenideElement dateWhenToDeliverInputField;

    //Локатор поля с выпадающим меню с выбором срока аренды самоката
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-placeholder")
    private SelenideElement leasingPeriodSelectBox;

    //Локатор выбора аренды самоката на 2 дня в выпадающем списке меню выбора срока аренды самоката
    @FindBy(how = How.XPATH, using = ".//div[@role='option'][contains(text(),'двое суток')]")
    private SelenideElement leasingPeriodTwoDaysChoice;

    //Локатор чекбокса выбора цвета самоката - черный
    @FindBy(how = How.ID, using = "black")
    private SelenideElement colorChooseBlackInputCheckBox;

    //Локатор поля с вводом комментария для курьера
    @FindBy(how = How.XPATH, using = "//*[@placeholder='Комментарий для курьера']")
    private SelenideElement commentForCourierInputField;

    //Локатор кнопки завершения заполнения заявки аренды самоката
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement buyButtonFinal;

    //Локатор кнопки согласия об аренде самоката
    @FindBy(how = How.XPATH, using = ".//button[contains(text(),'Да')]")
    private SelenideElement agreementOfRentYesButton;

    //Локатор кнопки проверки статуса заказа после его оформления
    @FindBy(how = How.XPATH, using = ".//button[contains(text(),'Посмотреть статус')]")
    private SelenideElement checkOrderButton;

    //Метод проверки загрузки второй страницы оформления заказа
    public void waitUntilDateWhenToDeliverInputFieldIsVisible() {
        dateWhenToDeliverInputField.shouldBe(Condition.visible);
    }

    //Метод возвращения типа boolean ,что вторая страница оформления заказа загрузилась
    public boolean isDateWhenToDeliverInputFieldIsDisplayed() {
        //todo Ожидание отображения показа на второй странице заказа поля ввода даты доставки самоката
        waitUntilDateWhenToDeliverInputFieldIsVisible();
        return dateWhenToDeliverInputField.isDisplayed();
    }

    //Метод возвращения проверки доступности сайти по наличию раздела даты доставки
    public void isSiteActive() {
        assertTrue(isDateWhenToDeliverInputFieldIsDisplayed());
    }
    //Метод по вводу даты когда необходимо доставить самокат
    public void setDateDelivery(String date){
        dateWhenToDeliverInputField.sendKeys(date);
        dateWhenToDeliverInputField.pressEnter();
    }

    //Метод клика по выпадающему меню и с выбором срока аренды самоката на 2 дня
    public void setLeasingPeriod(){
        leasingPeriodSelectBox.click();
        leasingPeriodTwoDaysChoice.click();
    }

    //Метод выбора чекбокса цвета самоката - черный
    public void setColor(){colorChooseBlackInputCheckBox.click();}

    //Метод ввода комментария для курьера
    public void setCommentary(String commentary) {
        commentForCourierInputField.sendKeys(commentary);
        commentForCourierInputField.pressEnter();
    }

    //Метод завершения заполнения заявки аренды самоката
    public void endOrder(){buyButtonFinal.click();}

    //Метод согласия об аренде самоката
    public void setAgreementYes(){agreementOfRentYesButton.click();}

    //Метод проверки загрузки второй страницы оформления заказа и его успешного оформления
    public void orderIsStoredSuccessfully(){checkOrderButton.shouldBe(Condition.visible).click();}

}
