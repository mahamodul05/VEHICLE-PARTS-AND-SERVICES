package com.service;

import com.repository.ShopRepository;
import com.domain.Shop;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ShopServiceImpl implements ShopService {

    private final ShopRepository shopRepository;

    public ShopServiceImpl(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Shop> getAll() {
        return shopRepository.getAll();
    }


    @Override
    public void save(Shop shop) {
        shopRepository.save(shop);
    }


    @Override
    public Shop get(int id) {
        return shopRepository.get(id);
    }

    @Override
    public void update(Shop shop) {
        shopRepository.update(shop);
    }

    @Override
    public void delete(int id) {
        shopRepository.delete(id);
    }

    @Override
    public List<Shop> getAll(int shop_id) {
        return shopRepository.getAll(shop_id);
    }

    public List<Shop> getbyshopname(String service) { return shopRepository.getbyusername(service);}
    public Shop getownerid(String ownerid) { return shopRepository.getownerid(ownerid); }

}
