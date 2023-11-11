package practice.bogdan.chucknorris.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import practice.bogdan.chucknorris.services.JokerService;


@Controller
public class JokerController {


    private final JokerService jokerService;

    public JokerController(JokerService jokerService) {
        this.jokerService = jokerService;
    }

  public   String getJoker(){
      return  jokerService.getJoke();
    }


    @RequestMapping({"/",""})
  public String showJoker(Model model){
        model.addAttribute("joke", jokerService.getJoke());
        return "index";
  }


}
