package com.portfoliosecurity.argprog.mapper;

import com.portfoliosecurity.argprog.model.Order;
import com.portfoliosecurity.argprog.model.User;
import com.portfoliosecurity.argprog.rest.dto.CreateOrderRequest;
import com.portfoliosecurity.argprog.rest.dto.OrderDto;
import com.portfoliosecurity.argprog.rest.dto.OrderDto.UserDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-26T11:54:24-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order toOrder(CreateOrderRequest createOrderRequest) {
        if ( createOrderRequest == null ) {
            return null;
        }

        Order order = new Order();

        order.setDescription( createOrderRequest.getDescription() );

        return order;
    }

    @Override
    public OrderDto toOrderDto(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDto orderDto = new OrderDto();

        orderDto.setCreatedAt( order.getCreatedAt() );
        orderDto.setId( order.getId() );
        orderDto.setDescription( order.getDescription() );
        orderDto.setUser( userToUserDto( order.getUser() ) );

        return orderDto;
    }

    protected UserDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setUsername( user.getUsername() );

        return userDto;
    }
}
