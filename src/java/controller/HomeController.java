/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import model.Carta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author Contopee from Lazarus Group
 */
@Controller
public class HomeController {
    
    @RequestMapping(value="Home/index",method=RequestMethod.GET)
    public String index(Model m){
        m.addAttribute("listaproductos",Carta.getAll());
        return "Home/index";
    }
    
    @RequestMapping(value="Home/indexajax",method=RequestMethod.POST)
    public @ResponseBody String indexajax(){
        String json = new Gson().toJson(Carta.getAll());
        return json;
    }
    
}
