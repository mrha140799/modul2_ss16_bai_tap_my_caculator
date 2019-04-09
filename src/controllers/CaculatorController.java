package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @GetMapping("/")
    public String Home(){
        return "home";
    }

    @PostMapping("/caculator")
    public String Caculator(@RequestParam("so1") String so1 , @RequestParam("so2") String so2 ,
                            @RequestParam("choise") String choise , Model model) {

        float numb1 = Integer.parseInt(so1);
        float numb2 = Integer.parseInt(so2);
        float rels = 0;
        switch (choise){
            case "+" :
                rels = numb1 + numb2;
                break;
            case "-" :
                rels = numb1 - numb2;
                break;
            case "x" :
                rels = numb1 * numb2;
                break;
            case "/" :
                rels = numb1 / numb2;
                break;
        }
        model.addAttribute("rel" , rels);
        return "home";
    }
}
