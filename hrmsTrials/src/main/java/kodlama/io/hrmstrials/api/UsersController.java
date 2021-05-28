package kodlama.io.hrmstrials.api;

import kodlama.io.hrmstrials.businnes.abstarcts.UserService;
import kodlama.io.hrmstrials.core.utilities.results.DataResult;
import kodlama.io.hrmstrials.core.utilities.results.Result;
import kodlama.io.hrmstrials.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")

public class UsersController {

    private UserService userService ;
     @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping( "/getall"  )
    DataResult< List<User>> getAll(){
      return this.userService.getAll();

    }
@PostMapping ( "/add")
    Result add (@RequestBody User user ){
         return this.userService.add(user);
    }


}
