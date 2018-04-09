package hellotemplates.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@SpringBootApplication
public class HelloTemplate {
    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("author","Nicsins");

        List favoriteFoods = Arrays.asList("pizza", "tacos", "ice cream");
        model.addAttribute("favoriteFoods", favoriteFoods);
        model.addAttribute("favoriteMovie","Pulp Fiction !");
        return "index.html";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloTemplate.class, args);
    }
}
