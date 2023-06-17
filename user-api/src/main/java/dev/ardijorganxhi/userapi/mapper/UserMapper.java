package dev.ardijorganxhi.userapi.mapper;

import dev.ardijorganxhi.userapi.entity.User;
import dev.ardijorganxhi.userapi.model.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto convertToDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .username(user.getUsername())
                .build();
    }
}
