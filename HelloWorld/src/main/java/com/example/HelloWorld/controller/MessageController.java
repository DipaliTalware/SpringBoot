package com.example.HelloWorld.controller;

import com.example.HelloWorld.dto.Message;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MessageController {
    private List<Message>messages = new ArrayList<>();


    @PostMapping("/api/messages")
    public String createMessages(@RequestBody Message message){
        messages.add(message);
        System.out.println(message);
        return "message created";
    }

    @GetMapping("/api/messages")
    public List<Message> getMessages(){
        System.out.println(messages.toString());
        return messages;
    }

    @DeleteMapping("/api/messages/{id}")
    public String deleteMessage(@PathVariable String id){
        boolean messageRemoved = messages.removeIf(message -> message.getId().equals(id));
        if(messageRemoved){
            return "message deleted";
        }
        return "message not found";
    }


}
