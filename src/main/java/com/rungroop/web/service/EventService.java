package com.rungroop.web.service;

import com.rungroop.web.dto.EventDto;
import org.springframework.stereotype.Service;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);
}
