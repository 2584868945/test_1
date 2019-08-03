package org.java.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anping
 * @date 2019-08-03 14:40
 */
@RestController
public class FirstController {

    @RequestMapping("/init")
    public String init(){
        return "hello,world";
    }
}
