package demo.herbseek.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/herbsightings")
public class HerbSightingController {

    private final HerbSightingService herbSightingService;

    @Autowired
    public HerbSightingController(HerbSightingService herbSightingService) {
        this.herbSightingService = herbSightingService;
    }

    @GetMapping("/")
    List<HerbSighting> all() {
      return herbSightingService.getAllHerbSightings();
    }

    @GetMapping("/{id}")
    public HerbSighting getHerbSightingById(@PathVariable Long id) {
        return herbSightingService.getHerbSightingById(id);
    }
    @PostMapping("/")
    public void addHerbSighting(@RequestBody HerbSighting herbSighting) {
        herbSightingService.saveHerbSighting(herbSighting);
    }

    @PutMapping("/{id}")
    public void updateHerbSighting(@PathVariable Long id, @RequestBody HerbSighting herbSighting) {
        HerbSighting existingHerbSighting = herbSightingService.getHerbSightingById(id);
        if (existingHerbSighting != null) {
            herbSighting.setId(id); // Ensure the correct ID is set
            herbSightingService.saveHerbSighting(herbSighting);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteHerbSighting(@PathVariable Long id) {
        herbSightingService.deleteHerbSighting(id);
    }
}
