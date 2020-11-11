import java.util.*;

public class ArrayList_5 {
    public static void maine(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<1000;i++){
            list.add((int) (Math.random()*99 + 10));
        }

        System.out.println("Array list:" + list);

    }
}
