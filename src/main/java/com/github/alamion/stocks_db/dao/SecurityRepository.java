package com.github.alamion.stocks_db.dao;

import com.github.alamion.stocks_db.model.Security;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author A.Putintsev
 */
public interface SecurityRepository extends CrudRepository<Security, Integer> {

    List<Security> findByCode(String code);
}
