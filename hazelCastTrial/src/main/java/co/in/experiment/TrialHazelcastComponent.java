package co.in.experiment;


import com.hazelcast.core.HazelcastInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/cacher")
public class TrialHazelcastComponent {



    private final Logger logger = LoggerFactory.getLogger(TrialHazelcastComponent.class);
    private final HazelcastInstance hazelcastInstance;

    @Autowired
    TrialHazelcastComponent(HazelcastInstance hazelcastInstance) {
        this.hazelcastInstance = hazelcastInstance;
    }

    @PostMapping(value = "/load/{key}/{value}")
    public String loadOnToCache(@PathVariable String key, @PathVariable String value) {
        Map<String, String> hazelcastMap = hazelcastInstance.getMap("my-map");
        hazelcastMap.put(key, value);
        return "Data is stored.";
    }

    @GetMapping(value = "/fetch/{key}")
    public String readValueOf(@RequestParam String key) {
        Map<String, String> hazelcastMap = hazelcastInstance.getMap("my-map");
        return hazelcastMap.get(key);
    }

    @GetMapping(value = "/all")
    public Map<String, String> readAllCacheValues() {
        Map<String, String> hazelcastMap = hazelcastInstance.getMap("my-map");
        return hazelcastInstance.getMap("my-map");
    }
}
