package demo;

import java.util.ArrayList;
import java.util.List;

public class SearchByColor implements ISearch{
    @Override
    public List<Apple> search(List<Apple> list, Object object) {
        List<Apple> myList=new ArrayList<>();
        for(Apple apple:list){
            if(apple.getColor().equals(object)){
                myList.add(apple);
            }
        }
        return myList;
    }
}
