package services.com.check_in.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.com.check_in.services.EventService;


@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventController {
   private final EventService service;

   @GetMapping("/{id}")
   public ResponseEntity<String> getEvent(@PathVariable String id) {
       this.service.getEventDetail(id);

       return ResponseEntity.ok("Sucesso!");
   }
}
