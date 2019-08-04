package com.github.timurstrekalov.openapi.visitor.bug;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloController {

    @Get
    public Hello hello() {
        return new Hello();
    }
}
