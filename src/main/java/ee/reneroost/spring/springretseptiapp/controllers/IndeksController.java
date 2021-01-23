package ee.reneroost.spring.springretseptiapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndeksController {

    @RequestMapping({"", "/", "indeks"})
    public String saaIndeksLeht() {
        return "indeks";
    }
}
