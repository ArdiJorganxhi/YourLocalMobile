package dev.ardijorganxhi.userapi.service;

import dev.ardijorganxhi.userapi.entity.User;
import dev.ardijorganxhi.userapi.mapper.UserMapper;
import dev.ardijorganxhi.userapi.model.dto.UserDto;
import dev.ardijorganxhi.userapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserDto findById(Integer id) {
        final User user = userRepository.findById(id).orElseThrow();
        return userMapper.convertToDto(user);

    }
}
