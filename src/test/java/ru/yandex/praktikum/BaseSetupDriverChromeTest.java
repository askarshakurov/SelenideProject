package ru.yandex.praktikum;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


abstract class BaseSetupDriverChromeTest {
    public static void setUp() {
        //Конфигурационные настройки WebDriver'a для запуска тестов
        Configuration.driverManagerEnabled = true;
        Configuration.startMaximized = true;
        Configuration.headless = false;
    }

    @BeforeAll
    //Перед прогоном тестов запускаем настройки для браузера Chrome
    static void init(){
        setUp();
    }

    @AfterAll
    // После прохода тестов закрываем WebDriver
    static void tearDown(){
        Selenide.closeWebDriver();
    }
}
