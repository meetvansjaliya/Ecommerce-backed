package com.meet.bestseller.backend.controller;

import com.meet.bestseller.backend.model.Item;
import jdk.jfr.Frequency;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/healthCheck")
public class HealthCheck {

    @GetMapping
    public String isFine(@RequestParam String name){
        return name + " Working Fine";
    }

   @GetMapping("/item")
    public Item getItem(@RequestParam String name){
        Item item = new Item();
        item.name = name;
        return item;
    }

    @PostMapping("/itemByPost")
    public Item getItem(@RequestBody Item item){
        item.name = item.name+ " "+ "Meet";
        return item;
    }

}
