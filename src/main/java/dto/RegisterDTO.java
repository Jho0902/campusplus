package dto;

import entity.UserRoles;

public record RegisterDTO(String login, String password, UserRoles role) {



}
