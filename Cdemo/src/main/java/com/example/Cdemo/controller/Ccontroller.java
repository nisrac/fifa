package com.example.Cdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.Cdemo.model.Cdemo;
import com.example.Cdemo.repositary.Crepo;

@Controller
public class Ccontroller {
	@Autowired
	Crepo crepo;
	@RequestMapping("index")
	public String index()

	{
		return "index.jsp";
	}
	
	@RequestMapping("addCmp")
	public String addCmp(Cdemo cdemo)
	{
		crepo.save(cdemo);
		return "index.jsp";
	}
	@RequestMapping("getCmp")
	public ModelAndView getCmp(@RequestParam int id)
	{
		ModelAndView mv=new ModelAndView("display.jsp");
		Cdemo cdemo=crepo.findById(id).orElse(new Cdemo());
		mv.addObject(cdemo);
		return mv;
	}
	
	@RequestMapping("delCmp")
	public ModelAndView delCmp(@RequestParam int id)
	{
		ModelAndView mv=new ModelAndView("display.jsp");
		Cdemo cdemo=crepo.findById(id).orElse(new Cdemo());
		crepo.deleteById(id);
		mv.addObject(cdemo);
		return mv;
	}
	@RequestMapping("updateCmp")
	public ModelAndView updateCmp(Cdemo cdemo)
	{
		ModelAndView mv=new ModelAndView("update.jsp");
	    cdemo=crepo.findById(cdemo.getId()).orElse(new Cdemo());
		mv.addObject(cdemo);
		return mv;
	}
	
}
