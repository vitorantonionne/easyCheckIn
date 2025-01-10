package services.com.check_in.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import services.com.check_in.domain.event.Event;
import services.com.check_in.repositories.EventRepository;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventRepository eventRepository;

   public void getEventDetail(String eventId) {
       Event event = this.eventRepository.findById(eventId).orElseThrow(() -> new RuntimeException("Event not found with ID" + eventId));
       return;
   }
}
