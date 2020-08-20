package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

        public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOS\\Documents\\SENEIUM\\Drivers\\chromedriver.exe");

        WebDriver erx= new ChromeDriver();

        erx.manage().window().maximize();
        erx.get("http:/youtube.com");
        String page_title=erx.getTitle();
        System.out.println(page_title);
        if(page_title.contains("video")){
            System.out.println("Video kelimesi iceriyor");
        }else{
            System.out.println("Video kelimesi icermiyor");
        }
    erx.quit();

    }
}
