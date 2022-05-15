package com.example.demo.Service;

import com.example.demo.Repository.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private static List list = new ArrayList<>();
    static {
        User u = new User("akash1");
        list.add(u);
        u = new User("akash2");
        list.add(u);
        u = new User("akash3");
        list.add(u);
    }

    public  List getList()
    {
        return  list;
    }
}
