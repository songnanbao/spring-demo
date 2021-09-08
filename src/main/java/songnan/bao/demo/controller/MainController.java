package songnan.bao.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@Controller
public class MainController {

    @GetMapping(value = {"/index", "/index.html"})
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }

    @RequestMapping(value = {"", "/"})
    public String swagger() {
        return "redirect:/swagger-ui/index.html";
    }
}
