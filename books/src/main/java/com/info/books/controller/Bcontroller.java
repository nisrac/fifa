package com.info.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.info.books.model.book;
import com.info.books.repository.Brepo;

@Controller
public class Bcontroller {
	@Autowired
	Brepo brepo;
	
	@RequestMapping("index")
	public String index()
	{
		return "index.jsp";
	}
	
	@RequestMapping("addBook")
	public String addBook(book books)
	{
		brepo.save(books);
		return "index.jsp";
	}
	

	
	@RequestMapping("dis")
	public ModelAndView dis(@RequestParam int id)
	{
		ModelAndView mv = new ModelAndView("display.jsp");
		book books=brepo.findById(id).orElse(new book());
		mv.addObject(books);
		return mv;
	}
	

	@RequestMapping("del")
	public ModelAndView del(@RequestParam int id)
	{
		ModelAndView mv = new ModelAndView("delete.jsp");
		book books=brepo.findById(id).orElse(new book());
		brepo.deleteById(id);
		mv.addObject(books);
		return mv;
	}
	
	@RequestMapping("update")
	public ModelAndView update(book books)
	{
		ModelAndView mv = new ModelAndView("update.jsp");
		books=brepo.findById(books.getId()).orElse(new book());
		
		mv.addObject(books);
		return mv;
	}
	

}
