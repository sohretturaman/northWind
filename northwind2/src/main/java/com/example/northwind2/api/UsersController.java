package com.example.northwind2.api;


import com.example.northwind2.business.abstracts.UserService;
import com.example.northwind2.core.entities.User;
import com.example.northwind2.core.utilities.results.ErrorDataResult;
import com.example.northwind2.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = " /api/users")
public class UsersController {

    private UserService userService;
    
  @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping(value="/add")
   public ResponseEntity<?> add(@Valid @RequestBody  User user){
        return ResponseEntity.ok(this.userService.add(user));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationExeption (
            MethodArgumentNotValidException exeptions){
        Map<String ,String > validationErrors = new HashMap<String , String >();
        for (FieldError fieldError : exeptions.getBindingResult().getFieldErrors()){
            validationErrors.put(fieldError.getField(),fieldError.getDefaultMessage());
        }
        ErrorDataResult<Object> errors
                = new ErrorDataResult<Object>( validationErrors,"Doğrulama hatalı ");
        return errors;
    }
}
