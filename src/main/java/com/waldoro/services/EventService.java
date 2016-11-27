package com.waldoro.services;

import com.waldoro.models.Event;

import java.util.List;

/**
 * Created by wrokita on 15/11/2016.
 */
public interface EventService {

        Event saveEvent(Event event);

        void updateEvent(Event event);

        void deleteEventById(long id);

        List<Event> findEventsNearby(double lat, double lon, double distance);

        List<Event> findEventsNearby(String category);

        List<Event> getAllEvents();

        void initialize();

        List<Event> findEventsNearbyKm(double lat, double lon, double distance);

}
