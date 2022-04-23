package com.group6.ntss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.group6.ntss.dao.EventRepositry;
import com.group6.ntss.model.Event;

@Controller
@RequestMapping(path="/event")
public class EventRegistrationController {
	
  @Autowired
  private EventRepositry event_repositry;

  @PostMapping(path="/add")
  public @ResponseBody String addNewEvent (@RequestParam String event_name
      , @RequestParam String theme
      , @RequestParam String slogan
      , @RequestParam String location
      , @RequestParam String duration) {

    Event e = new Event();
    e.setEvent_name(event_name);
    e.setTheme(theme);
    e.setSlogan(slogan);
    e.setLocation(location);
    e.setDuration(duration);
    event_repositry.save(e);
    return "Saved";
  }
  
  @GetMapping(path="/get-events")
  public ModelAndView getAllEvents () {
	  
    List<Event> eventsList = event_repositry.findAll();
	ModelAndView modelAndView = new ModelAndView("list-events");
    modelAndView.addObject("eventsList", eventsList);
	
    return modelAndView;
  }
  
  @PostMapping(path="/registration")
  public String registerForEvent () {
	 /*
	  * TODO : Need to register events for the particular logged in user
	  */
	
    return "";
  }
  
  @GetMapping("")
	public String dummy() {		
		return "event";
	}
}