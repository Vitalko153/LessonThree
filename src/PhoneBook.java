import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {


    static Map<String, String> mapPhoneBook = new TreeMap<>();

    public static void add(String name, String phone){
        mapPhoneBook.put(name, phone);
    }

    public static String get(String name){
        return (name);
    }

}
