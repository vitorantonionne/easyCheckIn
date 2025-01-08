package services.com.check_in.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import services.com.check_in.domain.checkin.CheckIn;

public interface CheckinRepository extends JpaRepository<CheckIn, Integer> {
}
