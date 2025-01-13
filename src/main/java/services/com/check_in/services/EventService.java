package services.com.check_in.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import services.com.check_in.domain.attendee.Attendee;
import services.com.check_in.domain.event.Event;
import services.com.check_in.dto.event.EventResponseDTO;
import services.com.check_in.repositories.AttendeeRepository;
import services.com.check_in.repositories.EventRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventRepository eventRepository;
    private final AttendeeRepository attendeeRepository;

   public EventResponseDTO getEventDetail(String eventId) {
       Event event = this.eventRepository.findById(eventId).orElseThrow(() -> new RuntimeException("Event not found with ID" + eventId));
       List<Attendee> attendeeList = this.attendeeRepository.findByEventId(eventId);
       return new EventResponseDTO(event, attendeeList.size());
   }
}
