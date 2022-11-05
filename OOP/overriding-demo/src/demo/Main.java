package demo;

class LivingThings{
    protected LivingThings walk(){
        System.out.println("Living Thing Walk...");
        return null;
    }
}

class HumanBeing extends LivingThings{
    @Override
    public HumanBeing walk(){
        System.out.println("Human walk");
        return null;
    }
}

class Lion extends LivingThings{
    @Override
    public Lion walk(){
        System.out.println("Lion walk");
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        LivingThings obj=new Lion();
        obj.walk();
        test(obj);
    }

    public static void test(LivingThings livingThings){
        System.out.println("Living Things");
    }

    public static void test(Lion lion){
        System.out.println("Lion");
    }
    public static void test(HumanBeing humanBeing){
        System.out.println("HumanBeing");
    }

}


