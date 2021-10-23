package com.tnj.restdemo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller
{
    //private final long intone = 0;
    //private final long inttwo = 0;

    private long LastPostNumber = 0;

    @GetMapping("/hello")
    public String Hello() {return "Hello ok";}

    @GetMapping("/test")
    public String Test(@RequestParam(name = "name") String name) {return String.format("Test for %s is OK", name);}

    @GetMapping("/average")
    public Model Model(@RequestParam(value = "intone") long intone, @RequestParam(value = "inttwo") long inttwo)
    {
        long average = 0;
        String content = "Average String Have to be Here";
        return new Model(intone, inttwo, average, content);
    }

    @PostMapping("/in")
    public long SetNumber(@RequestParam(value = "num") long LastPostNumber)
    {
        this.LastPostNumber = LastPostNumber;
        return LastPostNumber;
    }

    @GetMapping("/out")
    public long GetNumber()
    {return LastPostNumber;}
}
