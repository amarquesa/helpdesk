package helpdesk.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import helpdesk.dto.UserDTO;
import helpdesk.entity.User;
import helpdesk.repository.UserRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    // 🔥 POST COM DTO + VALIDAÇÃO
    @PostMapping
    public User createUser(@RequestBody @Valid UserDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());

        return repository.save(user);
    }

    // 🔥 GET COM DTO (SEM ID)
    @GetMapping
    public List<UserDTO> getAllUsers() {
        return repository.findAll()
                .stream()
                .map(user -> new UserDTO(user.getName(), user.getEmail()))
                .toList();
    }
}