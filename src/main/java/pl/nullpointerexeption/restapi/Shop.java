package pl.nullpointerexeption.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Shop {

    @RequestMapping("/getExample")
    @ResponseBody
    public String purchase(){
        return "example";
    }

}
