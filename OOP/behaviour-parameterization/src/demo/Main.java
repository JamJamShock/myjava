package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Apple> appleList= List.of(
                new Apple("Red",2),
                new Apple("Red",2),
                new Apple("Red",3),
                new Apple("Green",1),
                new Apple("Green",3)
        );

        //List<Apple> apples=searchAppleByColor(appleList,"Red");
        List<Apple> apples=searchStrategy(appleList,"Red");
        apples.forEach(System.out::println);
    }

    public static List<Apple> searchAppleBySize(List<Apple> apples,int size){
        List<Apple> myList=new ArrayList<>();
        for(Apple apple:apples){
            if(apple.getSize() > size){
                myList.add(apple);
            }
        }
        return myList;
    }

    private static ISearch search;

    public static void setSearch(ISearch search) {
        Main.search = search;
    }

    public static List<Apple> searchStrategy(List<Apple> apples, Object object){
        return search.search(apples,object);
    }

    public static List<Apple> searchAppleByColor(List<Apple> apples,String color){
        List<Apple> myList=new ArrayList<>();

        for(Apple apple:apples){
            if(apple.getColor().equals(color)){
                myList.add(apple);
            }
        }


        return myList;
    }
}
