package com.example.BackendApp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    DummyDB dummyDB = new DummyDB();

    @GetMapping("/hi")
    public String sayHello()
    {
        return "Hello Coder!! First API";
    }

    @GetMapping("/convert")
    public int convertToInr(@RequestParam int q)
    {
        int usd = q;
        return usd * 78;
    }

    @GetMapping("/search")
    public String searchAWord(@RequestParam String req)
    {
        return dummyDB.search(req);
    }

    @GetMapping("/searchUser")
    public Users searchUser(@RequestParam String name)
    {
        return dummyDB.searchUser(name);
    }

    @GetMapping("/searchUser/{name}")
    public Users searchUser2(@PathVariable String name)
    {
        return dummyDB.searchUser(name);
    }
}
