package com.company.urban.womenssalon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.urban.womenssalon.entity.WomensSalon;
import com.company.urban.womenssalon.service.WomensSalonService;

@Controller
public class WomensSalonController {

	@Autowired
	private WomensSalonService service;

	@RequestMapping("/addSalonService")
	public String showAddService() {
		return "addService";
	}

	@RequestMapping("/saveService")
	public String saveService(@ModelAttribute("womenSalon") WomensSalon womensSalon, ModelMap modelMap) {
		WomensSalon saveWomensSalon = service.saveWomensSalon(womensSalon);
		String message = "Service saved with id : " + saveWomensSalon.getId();
		modelMap.addAttribute("message", message);
		return "addService";
	}

	@RequestMapping("/displayAllServices")
	public String displayAllService(ModelMap modelMap) {
		List<WomensSalon> services = service.findAllWomensSalons();
		modelMap.addAttribute("services", services);
		return "displayAllServices";
	}

	@RequestMapping("/editService")
	public String editService(@RequestParam("id") int id, ModelMap modelMap) {
		WomensSalon serviceSalon = service.finWomensSalonById(id);
		modelMap.addAttribute("service",serviceSalon);
		return "updateService";
	}
	
	@RequestMapping("/updateService")
	public String updateService(@ModelAttribute("womensSalon")WomensSalon womensSalon,ModelMap modelMap) {
		service.saveWomensSalon(womensSalon);
		List<WomensSalon> services = service.findAllWomensSalons();
		modelMap.addAttribute("services",services);
		return "displayAllServices";
	}
	
	@RequestMapping("/deleteService")
	public String deleteService(@RequestParam("id")int id,ModelMap modelMap) {
		WomensSalon wm=new WomensSalon();
		wm.setId(id);
		service.deleteWomensSalon(wm);
		List<WomensSalon> services = service.findAllWomensSalons();
		modelMap.addAttribute("services",services);
		return "displayAllServices";
	}
}
