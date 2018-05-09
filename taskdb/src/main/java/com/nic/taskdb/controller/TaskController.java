package com.nic.taskdb.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Created by clara on 3/31/18.
 */

@Controller
public class TaskController {


    // Web page routes. Only need one in this app,
    // there's only one page, that's updated with JavaScript calls from the client app.


    @GetMapping("/")
    public String homePage() {
        return "index.html";
    }

}

