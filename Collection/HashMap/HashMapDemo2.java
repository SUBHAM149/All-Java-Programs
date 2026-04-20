package com.sub.hash_map;

import java.util.HashMap;
import java.util.Map;

class LoginService
{
    private Map<String,String> users;
    
    public LoginService()
    {
        users = new HashMap<>();
    }
    
    public void register(String username,String password)
    {
        users.put(username, password);
        System.out.println(username + " has registered successfully...");
    }
    
    public boolean validate(String username,String password)
    {
        // Correct validation
        if(users.containsKey(username) && users.get(username).equals(password))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}

public class HashMapDemo2 {

    public static void main(String[] args) {
        LoginService service = new LoginService();
        
        service.register("Subham", "Subh89");
        
        if(service.validate("Subham", "Subh89"))
        {
            System.out.println("Authenticated user");
        }
        else {
            System.out.println("Oops!! Wrong username/password..");
        }
    }
}

OUTPUT
------
Subham has registered successfully...
Authenticated user
