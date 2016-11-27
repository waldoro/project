package com.waldoro.controllers;

import com.waldoro.models.Event;
import com.waldoro.repository.EventRepository;
import com.waldoro.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.DocumentDefaultsDefinition;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wrokita on 08/11/2016.
 */
@RestController
public class PointsController {

    @Autowired
    private EventService eventService;

    boolean init =false;

    @RequestMapping(value = "/bycategory/{category}", method = RequestMethod.GET)
    public ResponseEntity<List<Event>> getByCategory(@PathVariable("category") String category) {
        System.out.println("Fetching events by category " + category);
        if (!init) {
            eventService.initialize();
            init = true;
        }
        List<Event> events = eventService.findEventsNearby(category);
        if (events == null || events.isEmpty()) {
            System.out.println("Events with category " + category + " not found");
            return new ResponseEntity<List<Event>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Event>>(events, HttpStatus.OK);
    }

    @RequestMapping(value = "/bylocation/{lat},{long},{dist}", method = RequestMethod.GET)
    public ResponseEntity<List<Event>> getByLocation(@PathVariable("lat") String latitude, @PathVariable("long") String longtitude, @PathVariable("dist") String distance) {
        System.out.print("Fetching events by location " +latitude+","+longtitude+"and distance" + distance);
        List<Event> events = eventService.findEventsNearbyKm(Double.parseDouble(latitude), Double.parseDouble(longtitude), Double.parseDouble(distance));
        if (events == null || events.isEmpty()) {
            System.out.println("Events near location not found");
            return new ResponseEntity<List<Event>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Event>>(events, HttpStatus.OK);
    }

    @RequestMapping(value="/event/add", method = RequestMethod.POST)
    ResponseEntity<?> add(@RequestBody Event input) {
        Event newEvent = eventService.saveEvent(input);
        return new ResponseEntity<Event>(newEvent, HttpStatus.OK);
    }
}
