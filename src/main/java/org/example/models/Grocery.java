package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {
 public static List<String> groceryList = new ArrayList<>();

 public void startGrocery(int x){
     Scanner scanner = new Scanner(System.in);

     while(true) {
         System.out.println("Bir değer giriniz: 0=>Çıkış, 1=>Ekle, 2=>Çıkar");
         int secim = scanner.nextInt();
         switch (secim) {
             case 0:
                 System.out.println("Uygulama durduruldu");
                 return;

             case 1:
                 System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                 String elemanEkle = scanner.nextLine();
                 addItems(elemanEkle);
                 break;
             case 2:
                 System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                 String elemanCikar = scanner.nextLine();
                 removeItems(elemanCikar);
                 break;
             default:
                 System.out.println("Lütfen geçerli bir değer giriniz! (0,1,2)");
         }
         printSorted();
     }
 }
 public static void addItems(String deger){
    String[] items = deger.split(",");
    for(String item : items){
        item = item.trim().toLowerCase();
        if(!groceryList.contains(item)){
            groceryList.add(item);
        }else{
            System.out.println(item + "listede zaten mevcut");
        }
    }
        sortList();
 }
    public static void removeItems(String deger){
        String[] items = deger.split(",");
        for(String item : items){
            item = item.trim().toLowerCase();
            if(groceryList.contains(item)){
                groceryList.remove(item);
            } else {
                System.out.println(item + " listede bulunamadı.");
            }
        }
        sortList();
    }
    public static boolean checkItemIsInList(String product){
     product = product.trim().toLowerCase();
     return groceryList.contains(product);
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        System.out.println("Grocery List: " + groceryList);
    }

    private static void sortList() {
        Collections.sort(groceryList);
    }
}

