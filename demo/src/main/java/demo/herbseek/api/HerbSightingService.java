package demo.herbseek.api;

import java.util.List;

public interface HerbSightingService {
    HerbSighting getHerbSightingById(Long id);
    void saveHerbSighting(HerbSighting herbSighting);
    void updateHerbSighting(HerbSighting herbSighting);
    void deleteHerbSighting(Long id);
    List<HerbSighting> getAllHerbSightings();
}
