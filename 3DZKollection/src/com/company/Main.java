package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        firstStage(); //первый пункт дз
        seconfStage(); //2 пункт дз

    }
    public static void firstStage(){

        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayListOrigin = new ArrayList<>();
        arrayList.add("Moscow");
        arrayList.add("Moscow1");
        arrayList.add("Moscow2");
        arrayList.add("Moscow");
        arrayList.add("Piter");
        arrayList.add("Piter2");
        arrayList.add("Piter3");
        arrayList.add("Piter3");
        arrayList.add("Piter");
        arrayList.add("Piter4");
        arrayList.add("Piter5");
        arrayList.add("Piter5");
        boolean flag=true;
        for(int i=0;i<arrayList.size();i++){
            flag=true;
            for(int i2=0;i2<arrayList.size();i2++){
                if(i!=i2){
                    if(arrayList.get(i).equals(arrayList.get(i2))){
                        flag=false;
                    }
                }
                if((i2==(arrayList.size()-1))&&flag){
                    arrayListOrigin.add(arrayList.get(i));
                }
            }
        }
        System.out.println(arrayListOrigin);
    }
    public static void seconfStage(){
       // ArrayList<String> arrayList = new ArrayList<>();
        HashMap<String, ArrayList<Integer>> hm = new HashMap<>();
       hm.put("Maxim",new ArrayList<>());
        hm.get("Maxim").add(234234);
        hm.get("Maxim").add(234324);
        hm.get("Maxim").add(32444);
        hm.put("Evgeni",new ArrayList<>());
        hm.get("Evgeni").add(20004);
        hm.put("Alex",new ArrayList<>());
        hm.get("Alex").add(204);
        hm.get("Alex").add(2054);


        System.out.println(hm.get("Maxim"));
        System.out.println(hm);

        // for(Map.Entry<String, ArrayList<Integer>> o:hm.entrySet()){
        //     System.out.println(o.getKey() + ": " + o.getValue());

        // }

      //  for(ArrayList o:hm.values()){
     //   System.out.println(hm+"  "+o);
     //  }





    }
    }

