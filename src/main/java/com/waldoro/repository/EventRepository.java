package com.waldoro.repository;

import com.waldoro.models.Event;
import org.springframework.data.geo.Box;
import org.springframework.data.geo.Circle;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wrokita on 26/11/2016.
 */
@Component
public interface EventRepository extends MongoRepository<Event,String> {

    List<Event> findByCategory(String category);

    List<Event> findByPositionWithin(Circle c);

    List<Event> findByPositionWithin(Box b);
    List<Event> findByPositionNear(Point p, Distance d);

}
