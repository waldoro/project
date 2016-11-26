package com.waldoro.controllers;

import com.waldoro.models.Event;
import com.waldoro.repository.EventRepository;
import com.waldoro.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/bycategory/{category}", method = RequestMethod.GET)
    public ResponseEntity<List<Event>> getByCategory(@PathVariable("category") String category) {
        System.out.println("Fetching events by category " + category);

        List<Event> events = eventService.findEventsNearby(category);
        if (events == null || events.isEmpty()) {
            System.out.println("Events with category " + category + " not found");
            return new ResponseEntity<List<Event>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Event>>(events, HttpStatus.OK);
    }
}
