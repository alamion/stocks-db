package com.github.alamion.stocks_db.controllers;

import com.github.alamion.stocks_db.dao.StockRepository;
import com.github.alamion.stocks_db.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private StockRepository stockRepository;

    @RequestMapping("/hello")
    public String hello(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name,
            Model model) {
//        model.addAttribute("name", name);
//        return "helloworld";
        Stock stock = new Stock();
        stock.setTicker("AFLT");
        stockRepository.save(stock);

        String stockString = "";
        for (Stock stock1 : stockRepository.findAll())
        {
            stockString += stock1.toString();
            stockString += " ";
        }
        model.addAttribute("stock", stockString);
        return "helloworld";
    }

    public StockRepository getStockRepository() {
        return stockRepository;
    }

    public void setStockRepository(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }
}