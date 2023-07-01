package com.js.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.js.dao.LaptopCRUD;
import com.js.dto.Laptop;

@Controller // dispacher servlet search for @controller at the top of program
public class LaptopController {

	@Autowired
	LaptopCRUD lc;

	@RequestMapping("/load") // request mapping the parent class for all mapping
	public ModelAndView loadlaptop() {

		ModelAndView ob1 = new ModelAndView("loadlaptop.jsp");
		ob1.addObject("laptop", new Laptop());
		return ob1;

	}

	@RequestMapping("/save")
	public ModelAndView savelaptop(@ModelAttribute Laptop l) {

		boolean result = lc.insert(l);

		ModelAndView ob2 = new ModelAndView("welcome.jsp");

		if (result) {
			ob2.addObject("msg", "<marquee behavior=\"scroll\" direction=\"right\" scrollamount=\"25px\">\r\n" + 
					"			<h1>SAVED</h1>\r\n" + 
					"		</marquee>");
		} else {
			ob2.addObject("msg", "not saved");

		}
		return ob2;

	}
	
	
	@RequestMapping("/display")
	public ModelAndView getallaptops() {
		List<Laptop> ob1 = lc.getallLaptops();
		
		ModelAndView mv = new ModelAndView("display.jsp");
		mv.addObject("rcb", ob1);
		
		return mv;	
	}
	
	@RequestMapping("/delete")
	public ModelAndView deletelaptopbyID(@RequestParam int id) {
		ModelAndView mv=new ModelAndView("display");
		
		boolean result=lc.deleteLaptop(id);
		if(result) {
			mv.addObject("msg", "<marquee behavior=\"scroll\" direction=\"right\" scrollamount=\"25px\">\r\n" + 
					"			<h1>DELETED SUCCESSFULLY</h1>\r\n" + 
					"		</marquee>");
		}
		else {
			mv.addObject("msg", "<marquee behavior=\"scroll\" direction=\"right\" scrollamount=\"25px\">\r\n" + 
					"			<h1>NOT DELETED </h1>\r\n" + 
					"		</marquee>");
		}
		return mv;	
	}
	
	@RequestMapping("/update")
	public ModelAndView updatelaptop(@RequestParam int id) {
		ModelAndView mv= new ModelAndView("update.jsp");
		
		
		Laptop l= lc.getLaptopbyId(id);
		mv.addObject("msg", l);
		return mv;
	}

	@RequestMapping("/updated")
	public ModelAndView editlaptop(@ModelAttribute Laptop l) {
		ModelAndView mv= new ModelAndView("display");
		boolean result =lc.updateLaptop(l.getId(),l);
		if(result) {
			mv.addObject("msg", "updated succesully");
		}
		else {
			mv.addObject("msg", "not updated");
		}
		return mv;

	}
}

