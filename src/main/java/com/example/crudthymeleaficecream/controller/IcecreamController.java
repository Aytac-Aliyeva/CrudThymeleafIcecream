package com.example.crudthymeleaficecream.controller;

import com.example.crudthymeleaficecream.DTO.IcecreamDto;
import com.example.crudthymeleaficecream.entity.IcecreamEntity;
import com.example.crudthymeleaficecream.service.IcecreamService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IcecreamController {
    private final IcecreamService icecreamService;

    public IcecreamController(IcecreamService icecreamService) {
        this.icecreamService = icecreamService;
    }


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/showList")
    public String listIcecreams(Model theModel) {
        List<IcecreamEntity> all = icecreamService.getAllIcecreams();
        theModel.addAttribute("icecreamData", all);
        return "list";
    }

    @GetMapping("/showForm")
    public String showForm(Model theModel) {
        IcecreamEntity icecreamEntity = new IcecreamEntity();
        theModel.addAttribute("icecream", icecreamEntity);
        return "form";
    }


    @PostMapping("/saveIcecream")
    public String saveIcecream(@ModelAttribute("icecream") IcecreamDto icecreamDto) {
        IcecreamEntity icecreamEntity = IcecreamService.fromDtoToEntity(icecreamDto);
        icecreamService.saveIcecream(icecreamEntity);
        return "redirect:/showList";
    }



    @GetMapping("/updateIcecream")
    public String updateIcecream (@RequestParam Long theId, Model theModel) throws ClassNotFoundException {
        IcecreamEntity icecreamByID = icecreamService.getIcecreamByID(theId);
        theModel.addAttribute("icecream", icecreamByID);
        return "update";

    }

    @GetMapping("/deleteIcecream")
    public String deleteIcecream (@RequestParam Long theID) {
        IcecreamEntity icecreamEntity = icecreamService.deleteIcecream(theID);
        return "redirect:/list";

    }
}
