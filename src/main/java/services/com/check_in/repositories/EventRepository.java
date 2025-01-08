package services.com.check_in.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import services.com.check_in.domain.event.Event;

public interface EventRepository extends JpaRepository<Event, String> {
}
