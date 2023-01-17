package com.service;

import com.domain.Customer;
import com.domain.Shop;

import java.util.List;

public interface ShopService {

    public List<Shop> getAll();

    public void save(Shop shop);

    public Shop get(int id);

    public void update(Shop shop);

    public void delete(int id);

    public List<Shop> getAll(int shop_id);

    public List<Shop> getbyshopname(String service);

    public Shop getownerid(String ownerid);

}
