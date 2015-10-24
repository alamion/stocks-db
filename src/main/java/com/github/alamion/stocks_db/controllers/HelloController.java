package com.github.alamion.stocks_db.controllers;

import com.github.alamion.stocks_db.dao.SecurityRepository;
import com.github.alamion.stocks_db.model.Security;
import com.github.alamion.stocks_db.model.SecurityType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private SecurityRepository stockRepository;

    @RequestMapping("/hello")
    public String hello(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name,
            Model model) {
//        model.addAttribute("name", name);
//        return "helloworld";
//        Security stock = new Security();
//        stock.setCode("AFLT");
//        stock.setName("Аэрофлот");
//        stock.setType(SecurityType.STOCK);
//        stockRepository.save(stock);

        String stockString = "";
        for (Security stock1 : stockRepository.findAll())
        {
            stockString += stock1.toString();
            stockString += " ";
        }
        model.addAttribute("stock", stockString);
        return "helloworld";
    }

    public SecurityRepository getStockRepository() {
        return stockRepository;
    }

    public void setStockRepository(SecurityRepository stockRepository) {
        this.stockRepository = stockRepository;
    }
}