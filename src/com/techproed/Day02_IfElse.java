package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOS\\Documents\\SENEIUM\\Drivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
// contains -> bir kelimenin, bir yazı içerisinde geçip geçmediğini kontrol ediyordu.
        String amazonTitle = driver.getTitle(); // Car
        if( amazonTitle.contains("Books") ){
            System.out.println("Books kelimesini içeriyor.");
        }else{
            System.out.println("Books kelimesini İÇERMİYOR.");
        }
        driver.quit();

    }
}
