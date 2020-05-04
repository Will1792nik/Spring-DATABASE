package nicolini.will.h2dbmanha.controller;


import nicolini.will.h2dbmanha.model.Celphone;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CelphoneObject {

    @GetMapping("/galaxy")
    public ArrayList<Celphone> getGalaxy(){
    Celphone model = new Celphone();
    Celphone mark = new Celphone();
    Celphone RAM = new Celphone();
    Celphone memory = new Celphone();
    model.setModel("Galaxy S10+");
    mark.setMark("Samsung");
    RAM.setRAM("8 GB");
    memory.setMemory("128 GB");
    ArrayList<Celphone> models = new ArrayList<>();
    models.add(model);
    models.add(mark);
    models.add(RAM);
    models.add(memory);
    return models;
    }

    @GetMapping("/iphone")
    public ArrayList<Celphone> getIphone(){
        Celphone model = new Celphone();
        Celphone mark = new Celphone();
        Celphone RAM = new Celphone();
        Celphone memory = new Celphone();
        model.setModel("iPhone XR");
        mark.setMark("Apple");
        RAM.setRAM("3 GB");
        memory.setMemory("64 GB");
        ArrayList<Celphone> models = new ArrayList<>();
        models.add(model);
        models.add(mark);
        models.add(RAM);
        models.add(memory);
        return models;
    }

    @GetMapping("/xiaomi")
    public ArrayList<Celphone> getMI10PRO(){
        Celphone model = new Celphone();
        Celphone mark = new Celphone();
        Celphone RAM = new Celphone();
        Celphone memory = new Celphone();
        model.setModel("MI 10 PRO");
        mark.setMark("XIAOMI");
        RAM.setRAM("* GB");
        memory.setMemory("256 GB");
        ArrayList<Celphone> models = new ArrayList<>();
        models.add(model);
        models.add(mark);
        models.add(RAM);
        models.add(memory);
        return models;
    }

}


