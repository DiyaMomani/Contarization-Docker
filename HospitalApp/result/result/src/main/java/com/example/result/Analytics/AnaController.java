package com.example.result.Analytics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AnaController {
    @Autowired
    private AnaService anaService;

    @GetMapping("/result")
    public String getAllResult(Model model){
        List<Analytics> analytics = anaService.getAnalysisData();
        if(analytics.isEmpty()){
            model.addAttribute("analytics" , new Analytics(0,0,0));
        }
        else model.addAttribute("analytics" , analytics.get(analytics.size()-1));
        return "resultPage";
    }
}
