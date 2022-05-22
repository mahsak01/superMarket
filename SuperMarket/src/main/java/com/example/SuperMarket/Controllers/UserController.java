package com.example.SuperMarket.Controllers;


import com.example.SuperMarket.dto.ProductCardDTO;
import com.example.SuperMarket.dto.UserDTO;
import com.example.SuperMarket.Models.Customer;
import com.example.SuperMarket.Models.User;
import com.example.SuperMarket.Models.extras.Response;
import com.example.SuperMarket.Services.CustomerService;
import com.example.SuperMarket.Services.UserService;
import org.springframework.core.MethodParameter;
import org.springframework.data.mapping.PersistentProperty;
import org.springframework.data.mapping.PreferredConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.validation.MapBindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;


@RestController
public class UserController {

    private final UserService userService;
    private final CustomerService customerService;

    public UserController(UserService userService, CustomerService customerService) {
        this.userService = userService;
        this.customerService = customerService;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/signup")
    public ResponseEntity<Object> newUser(@RequestBody @Valid User user) throws Exception {
        userService.addNewUser(user);

        customerService.add(new Customer(), user);

        return ResponseEntity.ok(new Response(Response.Status.SUCCESS, "user created"));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/api/users")
    public ResponseEntity<Object> profile(Authentication authentication) throws Exception {
        User user = userService.searchByUsername(authentication.getName());

        Customer customer = customerService.findByUser(user);

        UserDTO dto = new UserDTO(user, customer);
        return ResponseEntity.ok(dto);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/api/users/card")
    public ResponseEntity<Object> card(Authentication authentication) throws Exception {
        User user = userService.searchByUsername(authentication.getName());

        return ResponseEntity.ok(new Response(Response.Status.SUCCESS, userService.getMyProducts(user)));
    }

    @RequestMapping(method = RequestMethod.POST, path = "/api/users/card/add")
    public ResponseEntity<Object> addProductToCard(@RequestBody ProductCardDTO productCardDTO, Authentication authentication) throws Exception {
        User user = userService.searchByUsername(authentication.getName());

        userService.addProductToCard(productCardDTO, user);
        return ResponseEntity.ok(new Response(Response.Status.SUCCESS,"product added to your card"));
    }
}
