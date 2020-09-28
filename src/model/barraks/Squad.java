package model.barraks;

import control.wrappers.RandomWrapper;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private final List<Soldier> soldierList=new ArrayList<>();
    private final String name;
    private final List<Soldier> deadList=new ArrayList<>();

    public Squad(String name,int size){
        this.name=name;
        for (int i = 0; i <size ; i++) {
            soldierList.add(soldierCreator());
        }
    }

    private Soldier soldierCreator(){
        return new Soldier("S"+(soldierList.size()+1));
    }


    public Soldier getSoldier(){
        return soldierList.get(RandomWrapper.getBoundInteger(soldierList.size()));
    }

    public void attack(Squad other,String killer , String killed){
        Soldier soldier=getSoldier();
        Soldier soldier1=other.getSoldier();
        soldier.attack(soldier1);
        if(soldier1.getHealth()<=0){
            System.out.println(soldier1.getId()+" in Squad "+killed+" is Killed by "+soldier.getId()+" in Squad "+ killer);
            other.dead(soldier1);
        }
    }

    public void dead(Soldier soldier){
            soldierList.remove(soldier);
            deadList.add(soldier);
    }

    public int size(){
        return soldierList.size();
    }

    @Override
    public String toString() {
        return name+'{'+soldierList+'}';
    }

    public String deadSoldiers(){return name+'{'+deadList+'}';}
}
