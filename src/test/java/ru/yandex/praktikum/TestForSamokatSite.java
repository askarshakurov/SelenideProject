package ru.yandex.praktikum;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestForSamokatSite extends BaseSetupDriverChromeTest {
   MainPage mainPage = null;

    //Вызов открытия начальной страницы до начала тестов
    @BeforeEach
    public void beforeEach() {
        mainPage = open(MainPage.BASE_URL, MainPage.class);
    }

    @Test
    //Проверка кликабельности раздела "Вопросы о важном" путем клика по ним и наличии текста внутр выпадающего меню
    public void checkOnMainPageClicksOnAccordeonLinesAndCheckTextInThem() {
       //MainPage mainPage = open(MainPage.BASE_URL, MainPage.class);
       mainPage.clickAllAccordeonLinesAndCheckAnswerTexts();
    }

    @Test
    //Проверка полного прохода заказа аренды самоката с проверкой записи в системе по кнопке "Заказать" на хедере сайта
    public void checkFullCycleofOrderingSamokatByHeaderButton() {
        OrderPageFirst orderPageFirst = open(MainPage.BASE_URL ,OrderPageFirst.class);
        orderPageFirst.clickBuyButtonInHeader();
        orderPageFirst.setName("Анатолии");
        orderPageFirst.setSurName("Анатольев");
        orderPageFirst.setAdrresDelivery("Верхняя Масловка 12");
        orderPageFirst.setMetroStation("Бульвар Рокоссовского");
        orderPageFirst.setPhoneNumber("79000000000");
        orderPageFirst.nextPageOrder();
        OrderPageSecond orderPageSecond = page(OrderPageSecond.class);
        orderPageSecond.isSiteActive();
        orderPageSecond.setDateDelivery("23.10.2022");
        orderPageSecond.setLeasingPeriod();
        orderPageSecond.setColor();
        orderPageSecond.setCommentary("Спасибо!");
        orderPageSecond.endOrder();
        orderPageSecond.setAgreementYes();
        orderPageSecond.orderIsStoredSuccessfully();
    }

    @Test
    //Проверка полного прохода заказа аренды самоката с проверкой записи в системе по кнопке "Заказать" на футере сайта
    public void checkFullCycleofOrderingSamokatByFooterButton() {
        OrderPageFirst orderPageFirst = open(MainPage.BASE_URL ,OrderPageFirst.class);
        orderPageFirst.clickBuyButtonInFooter();
        orderPageFirst.setName("Петр");
        orderPageFirst.setSurName("Петров");
        orderPageFirst.setAdrresDelivery("Лубянка 13");
        orderPageFirst.setMetroStation("Лубянка");
        orderPageFirst.setPhoneNumber("79090090909");
        orderPageFirst.nextPageOrder();
        OrderPageSecond orderPageSecond = page(OrderPageSecond.class);
        orderPageSecond.isSiteActive();
        orderPageSecond.setDateDelivery("15.02.2021");
        orderPageSecond.setLeasingPeriod();
        orderPageSecond.setColor();
        orderPageSecond.setCommentary("Благодарю!");
        orderPageSecond.endOrder();
        orderPageSecond.setAgreementYes();
        orderPageSecond.orderIsStoredSuccessfully();
    }

    @AfterAll
    //Действия после выполнения всех тестов
    public static void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        }
}
