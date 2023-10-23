package com.rungroop.web.service;

import com.rungroop.web.dto.EventDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);

    List<EventDto> findAllEvents();

    EventDto findByEventId(Long eventId);
}
