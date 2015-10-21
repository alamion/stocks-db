package com.github.alamion.stocks_db.dao;

import com.github.alamion.stocks_db.model.Stock;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author A.Putintsev
 */
public interface StockRepository extends CrudRepository<Stock, Integer> {

    List<Stock> findByTicker(String ticker);
}
