package com.tacking.back.tracking.rest;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coordinates")
public class Coordinates {

	@RequestMapping("/today")
    @ResponseBody
    public List<Coordinate> getToday() {
		List<Coordinate> list = new ArrayList<>();
		list.add(new Coordinate("37.772", "-122.214"));
		list.add(new Coordinate("21.291", "-157.821"));
		list.add(new Coordinate("-18.142", "178.431"));
		list.add(new Coordinate("-27.467", "153.027"));
      return list;
    }
	
	@RequestMapping("/history")
    @ResponseBody
	public List<Coordinate> getHistory(Date date){
		List<Coordinate> list = new ArrayList<>();
		list.add(new Coordinate("37.772", "-122.214"));
		list.add(new Coordinate("21.291", "-157.821"));
		list.add(new Coordinate("-18.142", "178.431"));
		list.add(new Coordinate("-27.467", "153.027"));
      return list;
	}
}
