package com.example.BackendApp1;

import org.springframework.web.server.UnsupportedMediaTypeStatusException;

import java.util.ArrayList;
import java.util.HashMap;

public class DummyDB {

    final HashMap<String, String> storage = new HashMap<>();
    ArrayList<Users> users = new ArrayList<>();

    Users user1 = new Users(123, "Shivaraj", 35 );
    Users user2 = new Users(121, "Susheela", 31);

    public DummyDB() {
        storage.put("Dravid", "A great Batsman");
        storage.put("Sachin", "A great Cricketer");

        users.add(user1);
        users.add(user2);
    }

    public String search (String word)
    {
        if ( storage.containsKey(word))
        {
            return storage.get(word);
        }
        return "Could't find anything";
    }

    public Users searchUser(String name)
    {
        for (Users user: users) {
            if ( name.equals(user.getName()))
            {
                return user;
            }
        }
        return null;
    }
}
