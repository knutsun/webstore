package com.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DashboardController {

    @GetMapping("/dash")
    @RequestMapping(value="/dash", method= RequestMethod.GET)
    public String dashboard() {
        return "dashboard";
    }
}
