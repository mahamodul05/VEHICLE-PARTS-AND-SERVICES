package com.repository;

import com.domain.Shop;

import java.util.List;

public interface ShopRepository {

    public List<Shop> getAll();

    public void save(Shop shop);

    public Shop get(int id);

    public void update(Shop shop);

    public void delete(int id);

    public List<Shop> getAll(int shop_id);

    public List<Shop> getbyusername(String service);

    public Shop getownerid(String ownerid);


}
