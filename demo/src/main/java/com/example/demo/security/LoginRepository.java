package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class LoginRepository {
    //test

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public String findPasswordByIdNumber(String idNumber) {
        Map<String, Object> paramMap = new HashMap<>();
        String sql = "SELECT password FROM employee WHERE id_number = :id_number";
        paramMap.put("id_number", idNumber);
        return jdbcTemplate.queryForObject(sql, paramMap, String.class);
    }



    public int getRoleId(String idNumber){
        Map<String, Object> paramMap = new HashMap<>();
        String sql = "SELECT user_role FROM employee WHERE id_number= :idNumber";
        paramMap.put("idNumber", idNumber);
        return jdbcTemplate.queryForObject(sql, paramMap, Integer.class);
    }


}
