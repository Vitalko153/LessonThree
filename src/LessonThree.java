import java.util.*;

public class LessonThree {


    public static void main(String arg[]){

        String[] wordsArray = {"Dog", "Cat", "Robot", "Word", "Table", "Pen", "Note", "Robot", "Coffee", "Dog", "Word", "Style", "Dog"};

        Map<String, Integer> map = new TreeMap<>();
        for(String s : wordsArray){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        System.out.println(map);

        //Телефонная книга.

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петров", "9999999");
        phoneBook.add("Иванов", "9876542");
        phoneBook.add("Николаев", "9623541");
        phoneBook.add("Грушевский", "9876542");
        phoneBook.add("Петров", "9453457");
        phoneBook.add("Грибоедов", "7562687");
        phoneBook.add("Лермонтов", "3785788");


        System.out.println(PhoneBook.get("Петров"));
        System.out.println(PhoneBook.get("Грибоедов"));
    }
}
