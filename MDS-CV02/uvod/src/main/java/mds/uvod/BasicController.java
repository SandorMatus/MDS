package mds.uvod;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("basic")
public class BasicController {
    @GetMapping
    public String testBasic(){
        return "<h4><b>Kappa123</b></h4>";
    }
    @GetMapping("list")
    public List<String> testList(){
        return List.of("Hello","world","in","JSON");
    }
    @GetMapping("test1")
    public String testParam1(@RequestParam String name){
        return String.format("Hello <b>%s</b>! Welcome to our page", name);
    }

    @GetMapping("test3")
    public String testParam3(@RequestParam(defaultValue = "user") String name){
        return String.format("Hello <b>%s</s>! Welcome to our page", name);
    }
    @GetMapping("test4")
    public String testParam4(@RequestParam(defaultValue = "user") String name,
                             @RequestParam(defaultValue = "-1") int id){
        return String.format("Hello <b>%s</s>! Welcome to our page. Your ID is : %d", name, id);
    }
    @GetMapping("test5")
    public String testParam5(@RequestParam List<String> id){
       // return "All IDs are : " +id;
        String w = "";
        for(String s : id) {
            w += s + "<br>";
        }
        return w;
    }
    @GetMapping("form")
    public String helloForm(){
        String html =
                "<html>"+
                        "<body>"+
                            "<form>"+
                                "<input type='text' name='name'/>"+
                                "<input type='submit value='Pozdrav!/>"+
                            "</form>"+
                        "</body>"+
                "</html>";
        return html;
    }
    @RequestMapping(value = "test2", method = {RequestMethod.GET,RequestMethod.POST})
    public String testParam2(@RequestParam(defaultValue = "user") String name){
        return String.format("Hello <b>%s</s>! Welcome to our page", name);
    }
}
