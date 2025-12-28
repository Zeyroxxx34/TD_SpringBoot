package com.GestionJeuxVideos.GestionJeuxVideos.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestionJeuxVideos.GestionJeuxVideos.security.JwtUtil;

//Login et génération de token
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    //Authentifie l'utilisateur et renvoie un token
    @PostMapping("/login")
    public Map<String, String> login(@RequestBody LoginRequest request) {
        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(request.username, request.password)
        );

        String token = jwtUtil.generateToken(request.username);

        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        response.put("message", "Connexion réussie");
        return response;
    }

    static class LoginRequest {
        public String username;
        public String password;
    }
}
