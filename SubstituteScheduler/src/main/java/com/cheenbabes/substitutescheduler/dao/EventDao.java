/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cheenbabes.substitutescheduler.dao;

import com.cheenbabes.substitutescheduler.dto.Event;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author ebaibourine
 */
public interface EventDao {
    Event addEvent(Event event);
    
    void deleteEvent(int eventId);
    
    void updateEvent(int eventId);
    
    Event getEventById(int eventId);
    
    List<Event> getAllEventsToday();
    
    List<Event> getAllEventsInRange(LocalDate startDate, LocalDate endDate);
    
    List<Event> getAllEventsBySchool(int schoolId);
    
    List<Event> getAllEventsBySubstitute(int subId);
    
    
    
}
