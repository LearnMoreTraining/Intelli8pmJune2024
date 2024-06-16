package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WikiPage {
    WebDriver driver;

    public WikiPage(WebDriver driver) {

        this.driver = driver;
    }

    public List<String> getCoulmnOneValues(){

       int count= driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::tr/child::th")).size();
          List<String> l = new ArrayList<String>();
       for(int i=0; i < count ;i++){
           String values= driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::tr/child::th")).get(i).getText();
            l.add(values);
       }
        System.out.println(l);
       return l;
    }

    public List<String> getCoulumnTwoValues(){

        int count= driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::tr/child::td")).size();
        List<String> l = new ArrayList<String>();
        for(int i=2; i < count ;i++){
            String values= driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::tr/child::td")).get(i).getText();
            l.add(values);
        }
        System.out.println(l);
        return l;
    }

    public Map<String, String> getShareHolderAndHoldingValue(){

      int  k=  driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();

      Map<String, String> m = new HashMap<String,String>();
      for(int j=0 ; j < k ;j++){

         String shareHolderValue= driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(j).getText();
         String shareHoldingValue= driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).get(j).getText();
         m.put(shareHolderValue,shareHoldingValue);
      }

        System.out.println(m);

      return m;
    }



}
