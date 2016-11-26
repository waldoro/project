package com.waldoro.services;

import com.waldoro.models.Event;

import java.util.List;

/**
 * Created by wrokita on 15/11/2016.
 */
public interface EventService {

        void saveEvent(Event event);

        void updateEvent(Event event);

        void deleteEventById(long id);

        List<Event> findEventsNearby(double lat, double lon, int maxResult);

        List<Event> findEventsNearby(String category);

        List<Event> getAllEvents();

}
