package com.example.final_project.work.bl.model.entity.restaurant;

import com.example.final_project.work.bl.model.entity.order.Order;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "restaurant")
public class Restaurant {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long Id;

    @Column(name = "name", nullable = false, unique = true)
    private String Name;

    @Column(name = "address", nullable = false, unique = true)
    private String address;

    @OneToMany(mappedBy = "restaurant", fetch = FetchType.EAGER)
    private List<Order> restaurantOrders;

    @OneToMany(mappedBy = "restaurant", fetch = FetchType.EAGER)
    private Set<RestaurantMenu> restaurantMenuList;

    //getters and setters


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<RestaurantMenu> getRestaurantMenuList() {
        return restaurantMenuList;
    }

    public void setRestaurantMenuList(Set<RestaurantMenu> restaurantMenuList) {
        this.restaurantMenuList = restaurantMenuList;
    }

    public List<Order> getRestaurantOrders() {
        return restaurantOrders;
    }

    public void setRestaurantOrders(List<Order> restaurantOrders) {
        this.restaurantOrders = restaurantOrders;
    }
}
