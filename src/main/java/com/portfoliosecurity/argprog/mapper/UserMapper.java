package com.portfoliosecurity.argprog.mapper;

import com.portfoliosecurity.argprog.model.User;
import com.portfoliosecurity.argprog.rest.dto.UserDto;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);
}