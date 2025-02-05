package org.example.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static WebDriver OBrowser=null;
    public static void main(String[] args) {
        launchBranch();
        navigateURL();
    }
    private static void launchBranch(){
        try {
            OBrowser = new ChromeDriver();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void navigateURL(){
        try{
            OBrowser.get("https://www.mckinsey.com/");
            Thread.sleep(4000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
