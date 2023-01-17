package com.controller;

import com.domain.Customer;
import com.domain.Review;
import com.domain.Shop;
import com.service.ReviewService;
import com.service.ShopService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/workshop")
public class ShopOwnerController {

    private final ShopService shopService;
    private final ReviewService reviewService;

    public ShopOwnerController(ShopService shopService, ReviewService reviewService) {
        this.shopService = shopService;
        this.reviewService = reviewService;
    }


    @RequestMapping("/registration")
    public String registration(Model model){
        Shop shop = new Shop();
        model.addAttribute("shop", shop);
        return "workshopregandlogin";
    }

    @RequestMapping("/createworkshop")
    public String create(@ModelAttribute("shop") Shop shop) {
        shopService.save(shop);
        return "redirect:/workshop/registration";
    }

    @RequestMapping("/workshoplogin")
    public String login(@RequestParam("ownerid") String ownerid, @RequestParam("password") String password, Model model, HttpServletRequest request) {
        Customer reqcustomer = new Customer();
        reqcustomer.setCstid(ownerid);
        reqcustomer.setCstpassword(password);
        
        Shop shop = shopService.getownerid(ownerid);

        if (shop != null) {

            model.addAttribute("shop", shop);
            request.getSession().setAttribute("shop", shop);
            return "Workshop-Profile";
        } else {
            model.addAttribute("msg", "failed");
            return "redirect:/workshop/registration";
        }
    }

    @RequestMapping("/updateworkshop")
    public String UpProfile(@RequestParam("shopid") int shopid, @RequestParam("shopname") String shopname, @RequestParam("shopaddress") String shopaddress, @RequestParam("service") String service, @RequestParam("shopstatus") int shopstatus, @RequestParam("ownername") String ownername, @RequestParam("ownerid") String ownerid, @RequestParam("password") String password, @RequestParam("tradelicense") String tradelicense, Model model, HttpServletRequest request) {
        Shop reqshop = new Shop();
        reqshop.setId(shopid);
        reqshop.setShopname(shopname);
        reqshop.setShopaddress(shopaddress);
        reqshop.setService(service);
        reqshop.setShopstatus(shopstatus);
        reqshop.setOwnername(ownername);
        reqshop.setOwnerid(ownerid);
        reqshop.setPassword(password);
        reqshop.setTradelicense(tradelicense);
        shopService.update(reqshop);
        Shop shop = shopService.get(shopid);
        request.getSession().setAttribute("shop", shop);
        return "Workshop-Profile";
    }

    @RequestMapping("/logout")
    public String logout() {
        return "redirect:/workshop/registration";
    }

    @RequestMapping("/shopcheckreview")
    public String reviewcheckbyshop(Model model){
        List<Review> reviews = new ArrayList<>();
        reviews = reviewService.getrevbyshopid(1);
        model.addAttribute("reviews", reviews);
        return "customer_review";
    }
}
