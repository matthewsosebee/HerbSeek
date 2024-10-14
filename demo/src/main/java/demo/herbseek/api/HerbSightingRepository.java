package demo.herbseek.api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HerbSightingRepository extends JpaRepository<HerbSighting, Long> {

}