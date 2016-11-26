package com.waldoro.services;

import com.waldoro.models.Event;
import com.waldoro.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

/**
 * Created by wrokita on 15/11/2016.
 */
@Service("eventService")
public class EventServiceImpl implements EventService{

    private static List<Event> events = new ArrayList<>();
    private static final AtomicLong counter = new AtomicLong();

    @Autowired
    private EventRepository repository;

    @Override
    public List<Event> getAllEvents() {
        return events;
    }
    //static {
    //    events = createDummyEvents();
    //}


    @Override
    public void saveEvent(Event event) {

    }

    @Override
    public void updateEvent(Event event) {

    }

    @Override
    public void deleteEventById(long id) {

    }

    @Override
    public List<Event> findEventsNearby(double lat, double lon, int maxResult) {
        return null;
    }

    @Override
    public List<Event> findEventsNearby(String category) {
        return repository.findByCategory(category);
    }



    private static List<Event> createDummyEvents() {
        events.add(new Event(51.155446947403256,16.899032592773438,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"SQUASH","BEGINNER"));
        events.add(new Event(51.16147594294264,16.97113037109375,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"TENNIS","BEGINNER"));
        events.add(new Event(51.15458559800953,17.02434539794922,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"SQUASH","BEGINNER"));
        events.add(new Event(51.10416867062593,16.880836486816406,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"TENNIS","BEGINNER"));
        events.add(new Event(51.13907855922781,16.917126774787903,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"RUNNING","MIDDLE"));
        events.add(new Event(50.98609893339354,16.839090585708618,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"RUNNING","BEGINNER"));
        events.add(new Event(50.982208525112895,16.95238709449768,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"FOOTBALL","BEGINNER"));
        events.add(new Event(50.98350536409832,17.03478455543518,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"FOOTBALL","MIDDLE"));
        events.add(new Event(50.99128563729097,17.04027771949768,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"FOOTBALL","MIDDLE"));
        events.add(new Event(50.988692357790164,17.023111581802368,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"FOOTBALL","BEGINNER"));
        events.add(new Event(51.1155927106412,17.060190439224243,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"RUNNING","BEGINNER"));
        events.add(new Event(51.084547222263666,16.506550312042236,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"GYM","BEGINNER"));
        events.add(new Event(51.07591977545679,16.52989625930786,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"GYM","BEGINNER"));
        events.add(new Event(51.084547222263666,16.566975116729736,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"BASKETBALL","BEGINNER"));
        events.add(new Event(51.09144802136697,16.53264284133911,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"BASKETBALL","BEGINNER"));
        events.add(new Event(51.22408779639158,17.478432655334473,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"SQUASH","BEGINNER"));
        events.add(new Event(51.22924786327828,17.525124549865723,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"SQUASH","ADVANCED"));
        events.add(new Event(51.19999983412069,17.492165565490723,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"TENNIS","BEGINNER"));
        events.add(new Event(51.22236764552972,17.547097206115723,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"SQUASH","ADVANCED"));
        events.add(new Event(51.217206807233396,17.580056190490723,counter.incrementAndGet(), "Title " + counter.get(), "Name" + counter.get(), "Mail", "Description"+counter.get(),"SQUASH","ADVANCED"));
        return events;
    }
}
