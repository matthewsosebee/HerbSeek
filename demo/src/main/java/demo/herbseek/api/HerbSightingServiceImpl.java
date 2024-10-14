package demo.herbseek.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HerbSightingServiceImpl implements HerbSightingService {

    private final HerbSightingRepository herbSightingRepository;

    @Autowired
    public HerbSightingServiceImpl(HerbSightingRepository herbSightingRepository) {
        this.herbSightingRepository = herbSightingRepository;
    }

    @Override
    public HerbSighting getHerbSightingById(Long id) {
        Optional<HerbSighting> optionalHerbSighting = herbSightingRepository.findById(id);
        return optionalHerbSighting.orElse(null);
    }

    @Override
    public void saveHerbSighting(HerbSighting herbSighting) {
        herbSightingRepository.save(herbSighting);
    }

    @Override
    public void updateHerbSighting(HerbSighting herbSighting) {
        herbSightingRepository.save(herbSighting);
    }

    @Override
    public void deleteHerbSighting(Long id) {
        herbSightingRepository.deleteById(id);
    }

    @Override
    public List<HerbSighting> getAllHerbSightings() {
        return herbSightingRepository.findAll();
    }
}
