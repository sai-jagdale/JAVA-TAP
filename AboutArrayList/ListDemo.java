package AboutArrayList;  // whenever you make a file in a folder , guive the folder name as package 

import java.util.ArrayList;
import java.util.List;

public class ListDemo{

    int age;
    String name;

    public static void main(String[] args){

        List<String> nameList = new ArrayList<String>();
        nameList.add("Sai");
        nameList.add("Samruddhi");
        nameList.add("Chaitrali");
        nameList.add("Arnav");

        List<Integer> ageList = new ArrayList<Integer>();
        ageList.add(21);
        ageList.add(21);
        ageList.add(21);

        for(String s : nameList){
            System.out.println("Names : "+ s);
        }

        for(Integer i : ageList){
            System.err.println("Ages : "+i);
        }
    }
}


// while running this , commands ---- javac AboutArrayList\ListDemo.java 
//                                    java AboutArrayList.ListDemo