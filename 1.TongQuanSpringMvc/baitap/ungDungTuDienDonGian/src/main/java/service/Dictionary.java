package service;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public Map<String, String> dictionary(){
        Map<String , String> dictionary = new HashMap<String,String>();
        dictionary.put("book" , "quyển sách");
        dictionary.put("pen","cây bút");
        dictionary.put("pig","con heo");
        dictionary.put("pig movie", "phim con heo");

        return dictionary;
    }
}
