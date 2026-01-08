package com.notasapp.dto;

public class LoginDTO {
    private String username;
    private String password;

    // Constructor vacío
    public LoginDTO() {}

    // Constructor con parámetros
    public LoginDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters y Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}