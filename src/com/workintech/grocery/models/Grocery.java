package com.workintech.grocery.models;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {

    private static String getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void addItems(List<String> groceryList){
        System.out.println("Eklenmesini istediğiniz elemanları giriniz. ");
        String input = getInput();

        if(input.contains(",")){
            String[] elements = input.split(",");
            for(String element: elements){
                if(element != null && !element.trim().isEmpty() && !checkItemsInList(groceryList,element)){
                    groceryList.add(element.toLowerCase().trim());
                }
                else{
                    System.out.println("Already exist");
                }
            }
        } else {
            if(input != null &&
                     !input.trim().isEmpty() &&
                     !checkItemsInList(groceryList,input)){
                groceryList.add(input.toLowerCase().trim());
            }
        }
        printSorted(groceryList);
    }

    public static void removeItems(List<String> groceryList){
        System.out.println("Çıkarılmaasını istediğiniz elemanları giriniz.");
        String input = getInput();

        if(input.contains(",")){
            String[] elements = input.split(",");
            for(String element: elements){
                if(element != null && !element.trim().isEmpty()&&
                            checkItemsInList(groceryList,element)){
                    groceryList.remove(element.toLowerCase().trim());
                } else {
                    System.out.println("Element is not exist");
                }
            }
        }else {
            if (input != null &&
                    !input.trim().isEmpty() &&
                    checkItemsInList(groceryList, input)) {
                groceryList.remove(input.toLowerCase().trim());
            }
        }
        printSorted(groceryList);
    }

    public static boolean checkItemsInList(List<String> groceryList, String product){
        return groceryList.contains(product.trim());
    }

    public static void printSorted(List<String> products){
        Collections.sort(products);
        System.out.println(products);

    }
}
