package fitness.center;

import org.springframework.web.bind.annotation.*;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserDAO dao = new UserDAO();

    @GetMapping
    public List<User> getAll() {
        return dao.findAll();
    }

    @PostMapping
    public void add(@RequestBody User user) {
        dao.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        dao.deleteById(id);
    }

    @PutMapping("/{id}/weight")
    public void updateWeight(
            @PathVariable int id,
            @RequestParam double weight) {
        dao.updateWeight(id, weight);
    }

    @PutMapping("/{id}/lastname")
    public void updateLastName(
            @PathVariable int id,
            @RequestParam String lastName) {
        dao.updateLastName(id, lastName);
    }

    @GetMapping("/max-weight")
    public User maxWeightUser() {
        return dao.findAll()
                .stream()
                .max(Comparator.comparingDouble(User::getWeight))
                .orElse(null);
    }

    @GetMapping("/{id}/calories")
    public double calories(
            @PathVariable int id,
            @RequestParam double intensity,
            @RequestParam double duration) {

        User user = dao.findAll()
                .stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);

        if (user == null) return 0;

        Activity activity = new Workout(intensity, duration);
        return activity.calories(user.getWeight());
    }
}

