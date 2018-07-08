package com.tacking.back.tracking.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/rest")
public class Coordinates {

	@RequestMapping("/coordinates")
    @ResponseBody
    public String getCoordinates() {
      return "Coordinates";
    }
}
