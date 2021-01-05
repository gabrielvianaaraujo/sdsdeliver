package com.devsuperior.dsdelivery.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.devsuperior.dsdelivery.domain.Order;
import com.devsuperior.dsdelivery.domain.enums.OrderStatus;

public class OrderDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    
    private Integer id;
    private String address;
    private Double latitude;
    private Double longitude;
    private Instant moment;
    private OrderStatus status;

    private List<ProductDTO> products = new ArrayList<>();


    public OrderDTO() {
    }


    public OrderDTO(Integer id, String address, Double latitude, Double longitude, Instant moment, OrderStatus status) {
        this.id = id;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.moment = moment;
        this.status = status;
    }

    public OrderDTO(Order entity) {
        id = entity.getId();
        address = entity.getAdress();
        latitude = entity.getLatitude();
        longitude = entity.getLongitude();
        moment = entity.getMoment();
        status = entity.getStatus();
        products = entity.getProducts().stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Instant getMoment() {
        return this.moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<ProductDTO> getProducts() {
        return this.products;
    }

}