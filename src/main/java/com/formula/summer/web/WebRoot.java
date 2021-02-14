package com.formula.summer.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leon(Liu Yang)
 * Ideas from Formula Innovation
 */
@RestController
public class WebRoot {

    @GetMapping
    public String welcome() {
        return "Welcome";
    }
}
