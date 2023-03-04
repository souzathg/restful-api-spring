package br.com.souzathg.restfulapispring.resources.assembler;

import br.com.souzathg.restfulapispring.controller.OrderController;
import br.com.souzathg.restfulapispring.model.entities.Order;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class OrderModelAssembler implements RepresentationModelAssembler<Order, EntityModel<Order>> {

    @Override
    public EntityModel<Order> toModel(Order order) {

        return EntityModel.of(order);
    }
}
