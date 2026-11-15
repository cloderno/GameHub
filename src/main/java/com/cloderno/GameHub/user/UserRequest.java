package com.cloderno.GameHub.user;

public record UserRequest(
  String username,
  String email,
  String password
){}
