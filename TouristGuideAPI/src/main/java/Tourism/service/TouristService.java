package Tourism.service;

import Tourism.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {
    private final TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    public <Tourist> List<Tourist> getAllTourists() {

        return List.of();
    }
}

// CRUD metoder svarende til TouristRepository,
// kald til relevante metoder

