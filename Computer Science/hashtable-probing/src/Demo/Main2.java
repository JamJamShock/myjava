package Demo;

import java.util.HashMap;
import java.util.Hashtable;

public class Main2 {
    public static void main(String[] args) {
        /*Apple obj1=new Apple();
        Apple obj2=new Apple();
        Apple obj3=new Apple();
        Apple obj4=new Apple();
        Apple obj5=new Apple();
        Apple obj6=new Apple();/*

        /*System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);
        System.out.println(obj6);*/

        Hashtable<String,String> cities=new Hashtable<>();
        cities.put("Japan","Tokyo");
        cities.put("India","Mombai");
        cities.put("Myanmar","Yangon");

        HashMap<String,String > countries=new HashMap<>();
        countries.put("Japan","Tokyo");
        countries.put("India","Mombai");
        countries.put("Myanmar","Yangon");

        for(String key:countries.keySet()){
            System.out.println(key + "'s city is: "+countries.get(key));
        }

        System.out.println(cities.get("India"));
    }
}
