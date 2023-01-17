package com.controller;

import com.domain.*;
import com.service.*;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {


    private final CustomerService customerService;
    private final ShopService shopService;
    private final ReviewService reviewService;



    public CustomerController(CustomerService customerService, ShopService shopService, ReviewService reviewService) {
        this.customerService = customerService;
        this.shopService = shopService;
        this.reviewService = reviewService;
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/registration")
    public String StRegistration(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customer_regandlogin";
    }


    @RequestMapping("/update")
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
        return "customer-Profile";
    }

    @RequestMapping("/createcustomer")
    public String create(@Valid @ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        return "redirect:/customer/registration";
    }


    @RequestMapping("/customerlogin")
    public String login(@Valid @RequestParam("customerid") String customerid, @RequestParam("password") String password, Model model, HttpServletRequest request) {
        Customer reqcustomer = new Customer();
        reqcustomer.setCstid(customerid);
        reqcustomer.setCstpassword(password);


        Customer customer = customerService.getCustomer(reqcustomer);
        if (customer != null) {
            model.addAttribute("customer", customer);
            request.getSession().setAttribute("customer", customer);
            return "customer-Profile";
        } else {
            model.addAttribute("msg", "failed");
            return "redirect:/customer/registration";
        }
    }



    @RequestMapping("/Profile")
    public String Profile(){
        return "customer-Profile";
    }

    @RequestMapping("/searchworkshop")
    public String search(@Valid @RequestParam(name = "searchValue", defaultValue = "") String service, Model model) {
        List<Shop> shops = new ArrayList<>();
        if (service == null) {
            //shops = shopService.getAll();
        } else {
            shops = shopService.getbyshopname(service);
        }
        model.addAttribute("shops", shops);
        return "customer-searchworkshop";

    }

    @RequestMapping("/customercheckreview")
    public String givenreviewycustomer(Model model){
        List<Review> reviews = new ArrayList<>();
        reviews = reviewService.getrevbycstid("1112223333");
        model.addAttribute("reviews", reviews);
        return "customer_review";
    }

    @RequestMapping("/homeservice")
    public String homeservice(){
        return "customer-Profile";
    }




    @RequestMapping("/logout")
    public String logout() {
        return "redirect:/customer/registration";
    }

}
