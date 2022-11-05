package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        /*ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        System.out.println(al);
        al.add(2,5);
        System.out.println(al);

        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }*/

        /*HashSet<Integer> al=new HashSet<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(1);
        al.add(2);
        al.add(3);
        System.out.println(al);
        al.add(3);
        System.out.println(al);

        for(Integer i:al){
            System.out.println(i);
        }*/

        HashSet<Integer> al=new HashSet<>();
        al.add(1);
        al.add(2);
        al.add(3);

        Iterator<Integer> itr=al.iterator();
        while(itr.hasNext()){
            Integer i=itr.next();
            if(i == 2){
                itr.remove();
            }
        }
        System.out.println(al);

        /*for(Integer i:al){
            if( i==2 ){
                al.remove(2);
            }
        }*/
    }
}
