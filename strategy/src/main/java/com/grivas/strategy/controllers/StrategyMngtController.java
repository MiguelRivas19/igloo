package com.grivas.strategy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class StrategyMngtController {

    @GetMapping("/framework/strategy")
    public void getAllStrategies(){}

    @GetMapping("/framework/strategy/{id}")
    public void getStrategy(@PathVariable final Integer id){}

    @PostMapping("/framework/strategy")
    public void settStrategy(@RequestBody final String strategy){}

    @GetMapping("/framework/strategy/deparment/{id}")
    public void getStrategyByDeparment(@PathVariable(name = "id") final Integer deparment) {}

    @GetMapping("/framework/strategy/service/{id}")
    public void getStrategyByService(@PathVariable(name = "id") final Integer service) {}


    @GetMapping("/framework/inside/strategy/{id}")
    public void interfaceStrategy(@PathVariable final Integer id){}
}
