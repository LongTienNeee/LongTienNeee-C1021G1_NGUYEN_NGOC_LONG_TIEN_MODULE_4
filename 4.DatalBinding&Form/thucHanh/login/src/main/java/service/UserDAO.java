package service;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserDAO {
    private static List<User> userList;
    static {
        userList = new ArrayList<>();
        User user1 = new User();
        user1.setAccount("longtien");
        user1.setPassword("123456789");
        user1.setName("Nguyễn Ngọc Long Tiên");
        user1.setEmail("longtien@gmail.com");
        user1.setAge(20);
        userList.add(user1);

        User user2 = new User();
        user1.setAccount("HaiTT");
        user1.setPassword("haideptrai123");
        user1.setName("Trương Tấn Hải");
        user1.setEmail("haiTT@gmail.com");
        user1.setAge(18);
        userList.add(user2);


        User user3 = new User();
        user1.setAccount("leTungTung");
        user1.setPassword("yeu1lan2em");
        user1.setName("Lê Tùng Tùng");
        user1.setEmail("suPhuCoDon@gmail.com");
        user1.setAge(60);
        userList.add(user3);
    }

    public static User checkLogin(Login login){
        for(User user : userList){
            if(user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())){
                    return user;
            }
        }
        return null;
    }
}
