package com.example.itmproject.controller;

import com.example.itmproject.entities.Repair;
//import com.example.itmproject.entities.Status;
//import com.example.itmproject.entities.Status;
//import com.example.itmproject.entities.Status;
import com.example.itmproject.entities.StatusEnum;
import com.example.itmproject.service.RepairService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping
public class RepairController {

    /*@GetMapping("/repairs/findAll")
    public ResponseEntity<List<Repair>>findAll(){
        return ResponseEntity.ok(repairService.findAll());
    }

    @GetMapping("/repairs/{repair_id}")
    public ResponseEntity<Repair>findAllById(@PathVariable Long repair_id){
        return ResponseEntity.ok(repairService.findAllById(repair_id));
    }

    @GetMapping("/repairs/allrepairs")
    public ResponseEntity<List<Repair>>findAllByStatus_enum(@RequestParam Status status){
        return ResponseEntity.ok(repairService.findAllByStatus_enum(status));
    }

    @PostMapping("/repairs/create")
    public ResponseEntity<RepairDto>addItem(@RequestBody RepairDto repairDto){
        return ResponseEntity.ok(repairService.save(repairDto));
    }

    @DeleteMapping("/repairs-delete/{id}")
    public void deleteRepairsById(@PathVariable Long repair_id){
        repairService.deleteRepairsById(repair_id);
    }

     */

    private final RepairService repairService;

    public RepairController(RepairService repairService) {
        this.repairService = repairService;
    }

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Repair> listRepairs = repairService.findAll();
        model.addAttribute("listRepairs", listRepairs);

        return "index";
    }

    @RequestMapping("/new")
    public String showNewProductForm(Model model) {
        Repair repair = new Repair();
        model.addAttribute("repair", repair);

        return "new_repair";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("repair") Repair repair) {
        repairService.save(repair);
        return "redirect:/";
    }

    @RequestMapping("/edit/{repair_id}")
    public ModelAndView showEditProductForm(@PathVariable(name = "repair_id") Long repair_id ){
        ModelAndView mav = new ModelAndView("edit_repair");

        Repair repair = repairService.findAllById(repair_id);
        mav.addObject("repair", repair);

        return mav;
    }

    @RequestMapping("/delete/{repair_id}")
    public String deleteProduct(@PathVariable(name = "repair_id") Long repair_id) {
        repairService.deleteRepairsById(repair_id);

        return "redirect:/";
    }


    @RequestMapping("/status/{id_status}")
    public String showStatusForm(@PathVariable(name = "id_status") Long id_status, Model model){
        Repair repair = repairService.findAllById(id_status);
        List<String> status = Arrays.stream(StatusEnum.values()).map(Enum::name).collect(Collectors.toList());
        model.addAttribute("repair", repair);
        model.addAttribute("validStatusList", status);
        return "status";

//        ModelAndView mav1 = new ModelAndView("repairObj");
//
//        Repair repair = repairService.findAllById(id_status);
//        mav1.addObject("repair", repair);
//        mav1.addObject("validStatusList", StatusEnum.values());
//        return mav1;
    }




    @GetMapping("/403")
    public String error403(){
        return "403";
    }



}

