package services.com.check_in.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import services.com.check_in.domain.attendee.Attendee;

import java.util.List;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {
    List<Attendee> findByEventId(String eventId);
}
