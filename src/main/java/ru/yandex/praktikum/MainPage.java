package ru.yandex.praktikum;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    //Переменная начальной страницы аренды самокатов
    public static final String BASE_URL = "https://qa-scooter.praktikum-services.ru/";

    //Локатор кнопки-аккордеона "Сколько это стоит? И как оплатить?"
    @FindBy( how = How.ID, using = "accordion__heading-0")
    private SelenideElement clickQuestionLineFirst;

    //Локатор кнопки-аккордеона "Хочу сразу несколько самокатов! Так можно?"
    @FindBy( how = How.ID, using = "accordion__heading-1")
    private SelenideElement clickQuestionLineSecond;

    //Локатор кнопки-аккордеона "Как рассчитывается время аренды?"
    @FindBy( how = How.ID, using = "accordion__heading-2")
    private SelenideElement clickQuestionLineThird;

    //Локатор кнопки-аккордеона "Можно ли заказать самокат прямо на сегодня?"
    @FindBy( how = How.ID, using = "accordion__heading-3")
    private SelenideElement clickQuestionLineFourth;

    //Локатор кнопки-аккордеона "Можно ли продлить заказ или вернуть самокат раньше?"
    @FindBy( how = How.ID, using = "accordion__heading-4")
    private SelenideElement clickQuestionLineFifth;

    //Локатор кнопки-аккордеона "Вы привозите зарядку вместе с самокатом?"
    @FindBy( how = How.ID, using = "accordion__heading-5")
    private SelenideElement clickQuestionLineSixth;

    //Локатор кнопки-аккордеона "Можно ли отменить заказ?"
    @FindBy( how = How.ID, using = "accordion__heading-6")
    private SelenideElement clickQuestionLineSeventh;

    //Локатор кнопки-аккордеона "Я жизу за МКАДом, привезёте?"
    @FindBy( how = How.ID, using = "accordion__heading-7")
    private SelenideElement clickQuestionLineEighth;

    //Локатор ответа кнопки-аккордеона "Сколько это стоит? И как оплатить?"
    @FindBy( how = How.ID, using = "accordion__panel-0")
    private SelenideElement answerLineFirst;

    //Локатор ответа кнопки-аккордеона "Хочу сразу несколько самокатов! Так можно?"
    @FindBy( how = How.ID, using = "accordion__panel-1")
    private SelenideElement answerLineSecond;

    //Локатор ответа кнопки-аккордеона "Как рассчитывается время аренды?"
    @FindBy( how = How.ID, using = "accordion__panel-2")
    private SelenideElement answerLineThird;

    //Локатор ответа кнопки-аккордеона "Можно ли заказать самокат прямо на сегодня?"
    @FindBy( how = How.ID, using = "accordion__panel-3")
    private SelenideElement answerLineFourth;

    //Локатор ответа кнопки-аккордеона "Можно ли продлить заказ или вернуть самокат раньше?"
    @FindBy( how = How.ID, using = "accordion__panel-4")
    private SelenideElement answerLineFifth;

    //Локатор ответа кнопки-аккордеона "Вы привозите зарядку вместе с самокатом?"
    @FindBy( how = How.ID, using = "accordion__panel-5")
    private SelenideElement answerLineSixth;

    //Локатор ответа кнопки-аккордеона "Можно ли отменить заказ?"
    @FindBy( how = How.ID, using = "accordion__panel-6")
    private SelenideElement answerLineSeventh;

    //Локатор ответа кнопки-аккордеона "Я жизу за МКАДом, привезёте?"
    @FindBy( how = How.ID, using = "accordion__panel-7")
    private SelenideElement answerLineEighth;

    //Кнопка "Заказать" в верхней части экрана
    @FindBy( how = How.CLASS_NAME, using = "Button_Button__ra12g")
    private SelenideElement buyButtonUpper;

    //Кнопка "Заказать" в нижней части экрана
    @FindBy( how = How.CLASS_NAME, using = "Home_FinishButton__1_cWm")
    private SelenideElement buyButtonLower;

    //Кнопка "Статус заказа" в верхней части экрана
    @FindBy( how = How.CLASS_NAME, using = "Header_Link__1TAG7")
    private SelenideElement statusButton;

    //Локатор кнопки логотипа Яндекс.Поиска
    @FindBy( how = How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
    private SelenideElement yandexSearchSiteButtonLink;

    //Локатор кнопки самого тестируемого сайта "Яндекс Самокат"
    @FindBy( how = How.CLASS_NAME, using = "Header_LogoScooter__3lsAR")
    private SelenideElement samokatSiteButtonLink;

    //Локатор кнопки о соглашении сбора куки в футере сайта
    @FindBy( how = How.CLASS_NAME, using = "App_CookieButton__3cvqF")
    private SelenideElement cookieButton;

    //Метод прокликивания и проверки всех кнопок в разделе "Вопросы о важном"
    public void clickAllAccordeonLinesAndCheckAnswerTexts() {
        clickQuestionLineFirst.scrollIntoView(true).click();
        answerLineFirst.shouldHave(Condition.exactText("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
        clickQuestionLineSecond.scrollIntoView(true).click();
        answerLineSecond.shouldHave(Condition.exactText("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
        clickQuestionLineThird.scrollIntoView(true).click();
        answerLineThird.shouldHave(Condition.exactText("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
        clickQuestionLineFourth.scrollIntoView(true).click();
        answerLineFourth.shouldHave(Condition.exactText("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
        clickQuestionLineFifth.scrollIntoView(true).click();
        answerLineFifth.shouldHave(Condition.exactText("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
        clickQuestionLineSixth.scrollIntoView(true).click();
        answerLineSixth.shouldHave(Condition.exactText("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
        clickQuestionLineSeventh.scrollIntoView(true).click();
        answerLineSeventh.shouldHave(Condition.exactText("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
        clickQuestionLineEighth.scrollIntoView(true).click();
        answerLineEighth.shouldHave(Condition.exactText("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }

}
