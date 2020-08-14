package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {

        // Java projemize, chromedriver' i tanittik.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TOS\\Documents\\SENEIUM\\Drivers\\chromedriver.exe");

        // Selenium ile ilgilli ilk kodumuzu yazdik.
        // webDriver nesnesi olusturarak, chrome driver'i kulllanilabilir hale getirdik.
        WebDriver webDriver = new ChromeDriver();

        // google.com adresine gitmemizi sagliyor
        webDriver.get("http://google.com");

        // acilan google.com sayfasini kapatiyor
        webDriver.close();

        // acik olan pencereyi degil, acik olan tum pencereleri kapatir.
        webDriver.quit();
    }
}