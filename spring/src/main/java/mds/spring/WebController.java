package mds.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("staticPage")
    public String staticPage(){
        return "staticPage";
    }
    @GetMapping("dynamicPage")
    public String dynamicPage(Model model){
        model.addAttribute("name","Matus");
        model.addAttribute("id","233267");
        return "dynamicPage";
    }
    @GetMapping("myself")
    public String myself(Model model){
        model.addAttribute("name","Matus");
        model.addAttribute("id","233267");
        return "myself";
    }
    @GetMapping("alice")
    public String alice(Model model){
        model.addAttribute("name","alice");
        return "template";
    }
    @GetMapping("bob")
    public String bob(Model model){
        model.addAttribute("name","bob");
        return "template";
    }
}
