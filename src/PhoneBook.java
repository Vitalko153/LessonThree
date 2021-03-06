import java.util.*;

public class PhoneBook {

    static Map<String, Set<String>> mapPhoneBook = new TreeMap<>();

    public static void add(String name, String phone){
        Set<String> call = mapPhoneBook.getOrDefault(name, new TreeSet<>());
        call.add(phone);
        mapPhoneBook.put(name, call);
    }


    public static String get(String name){
        return (name + " тел:" + mapPhoneBook.get(name));
    }

}
