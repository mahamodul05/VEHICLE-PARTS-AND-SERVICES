package com.controller;

import com.domain.Customer;
import com.domain.Shop;
import com.service.CustomerService;
import com.service.ShopService;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final ShopService shopService;
    private final CustomerService customerService;

    public AdminController(ShopService shopService, CustomerService customerService) {
        this.shopService = shopService;
        this.customerService = customerService;
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }



    @RequestMapping("/Admin")
    public String Adhome() {

        return "Admin-home";
    }

    @RequestMapping("/login")
    public String Login() {

        return "adminlogin";
    }




    @RequestMapping("/loginvalidate")
    public String LoginValidate(@Valid @RequestParam("uname") String uname,@RequestParam("psw") String pass,Model model) {
        String username = "admin";
        String password = "123";
        if (username.equals(uname) && pass.equals(password))
        {
            model.addAttribute("admin", "success");
            return "Admin-home";
        }
        else{
            model.addAttribute("admin", "failed");
            return "adminlogin";

        }
    }


    @RequestMapping("/Addshop")
    public String list(Model model) {
        List<Shop> shops = new ArrayList<>();
        shops = shopService.getAll();
        model.addAttribute("shops", shops);
        return "shop-list";
    }



    @RequestMapping("/searchshop")
    public String search(@Valid @RequestParam(name = "searchValue", required = false) int shop_id, Model model) {
        List<Shop> shops = new ArrayList<>();
        if (shop_id == 0) {
            //shops = shopService.getAll();
        } else {
            shops = shopService.getAll(shop_id);
        }
        model.addAttribute("shops", shops);
        return "shop-list";
    }



    @RequestMapping("/shopupdate")
    public String ShopUpdate(Model model) {
        return "shop_manage";
    }






    @RequestMapping("/shopmanage")
    public String Stlist(Model model) {
        return "shop_manage";
    }
    @RequestMapping("/updatesearchshop")
    public String login(@Valid @RequestParam("shopid") int shopid, Model model, HttpServletRequest request) {
        Shop reqshop = new Shop();
        reqshop.setId(shopid);

        Shop shop = shopService.get(shopid);
        if (shop != null) {
            model.addAttribute("shop", shop);
            request.getSession().setAttribute("shop", shop);
            return "shop_update";
        } else {
            model.addAttribute("msg", "failed");
            return "redirect:/admin/Admin";
        }
    }
    @RequestMapping("/updateshop")
    public String UpProfile(@Valid @RequestParam("shopid") int shopid, @RequestParam("shopname") String shopname, @RequestParam("shopaddress") String shopaddress, @RequestParam("service") String service, @RequestParam("shopstatus") int shopstatus, @RequestParam("ownername") String ownername, @RequestParam("ownerid") String ownerid, @RequestParam("password") String password, @RequestParam("tradelicense") String tradelicense, Model model, HttpServletRequest request) {
        Shop reqshop = new Shop();
        reqshop.setId(shopid);
        reqshop.setShopname(shopname);
        reqshop.setShopaddress(shopaddress);
        reqshop.setService(service);
        reqshop.setShopstatus(shopstatus);
        reqshop.setOwnername(ownername);
        reqshop.setOwnerid(ownerid);
        reqshop.setPassword(password);
        shopService.update(reqshop);
        Shop shop = shopService.get(shopid);
        request.getSession().setAttribute("shop", shop);
        return "shop_update";
    }



    @RequestMapping("/customermanage")
    public String customer(Model model) {
        return "customer_manage";
    }
    @RequestMapping("/updatesearchcustomer")
    public String login(@Valid @RequestParam("cstid") String cstid, Model model, HttpServletRequest request) {
        Customer reqcustomer = new Customer();
        reqcustomer.setCstid(cstid);

        Customer customer = customerService.getcustomer(cstid);
        if (customer != null) {
            model.addAttribute("customer", customer);
            request.getSession().setAttribute("customer", customer);
            return "customer_update";
        } else {
            model.addAttribute("msg", "failed");
            return "redirect:/admin/Admin";
        }
    }
    @RequestMapping("/updatecustomer")
    public String UpProfile(@Valid @RequestParam("cstid") String cstid, @RequestParam("cstname") String cstname, @RequestParam("cstaddress") String cstaddress, @RequestParam("cstemail") String cstemail, @RequestParam("cstpassword") String cstpassword, @RequestParam("cststatus") int cststatus, @RequestParam("id") int id, Model model, HttpServletRequest request) {
        Customer reqcustomer = new Customer();
        reqcustomer.setId(id);
        reqcustomer.setCstname(cstname);
        reqcustomer.setCstaddress(cstaddress);
        reqcustomer.setCstemail(cstemail);
        reqcustomer.setCstid(cstid);
        reqcustomer.setCstpassword(cstpassword);
        reqcustomer.setCststatus(cststatus);
        customerService.update(reqcustomer);

        Customer customer = customerService.getCustomer(reqcustomer);
        System.out.println(customer.getCstname());

        request.getSession().setAttribute("customer", customer);
        return "customer_update";
    }



    @RequestMapping("/viewcustomer")
    public String viewcustomer(Model model) {
        List<Customer> customers = new ArrayList<>();
        customers = customerService.getAll();
        model.addAttribute("customers", customers);
        return "customer-view";
    }


    @RequestMapping("/logout")
    public String logout() {
        return "redirect:/admin/registration";
    }




}
