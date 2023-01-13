package com.example.WithoutApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.WithoutApi.Entity.People;
import com.example.WithoutApi.Repository.Reppo;

@Controller
public class peoplecontroller {
	@Autowired
	Reppo repo;
	
	@RequestMapping("index")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("addpp")
	public String addpp(People pp) {
		repo.save(pp);
		return "sucess.jsp";
	}
	@RequestMapping("suc")
	public String suc() {
		return "index.jsp";
	}
	@RequestMapping("dis")
	public ModelAndView dis(@RequestParam int id) {
		ModelAndView mv = new ModelAndView("display.jsp");
		People pp=repo.findById(id).orElse(new People());
		mv.addObject(pp);
		return mv;
	}
	@RequestMapping("del")
	public ModelAndView del(@RequestParam int id) {
		ModelAndView mv = new ModelAndView("delete.jsp");
		People pp=repo.findById(id).orElse(new People());
		repo.deleteById(id);
		mv.addObject(pp);
		return mv;
	}
	@RequestMapping("upd")
	public ModelAndView upd(People pp) {
	ModelAndView mv = new ModelAndView("update.jsp");
	pp = repo.findById(pp.getId()).orElse(new People());
	mv.addObject(pp);
	return mv;
	}

}
