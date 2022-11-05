package demo;

public class Knight {

    private Quest quest;

    public String goQuest(){
        return quest.goQuest();
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public static void main(String[] args) {
        Knight knight=new Knight();
        knight.setQuest(new SlyDragonQuest());
        System.out.println(knight.goQuest());
    }
}
