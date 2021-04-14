package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired
    private AnimalCRUD animalCRUD;

    @GetMapping(path="/add")
    public @ResponseBody String add(@RequestParam String name, @RequestParam String nickname, @RequestParam int age) {
        Animal animal = new Animal();
        animal.setName(name);
        animal.setNickname(nickname);
        animal.setAge(age);

        animalCRUD.save(animal);
        return "Name - " + animal.getName() +
                "|| Nickname - " + animal.getNickname() +
                "|| Age - " + animal.getAge() + '.';
    }

    /*
    @GetMapping(path="/get")
    public @ResponseBody String get() {
        Animal animal = new Animal();

        animalCRUD.save(animal);
        return "Name - " + animal.getName() +
                "|| Nickname - " + animal.getNickname() +
                "|| Age - " + animal.getAge() + '.';
    } */
}
