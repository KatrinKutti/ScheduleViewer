package com.example.demo.security;

import com.example.demo.errorHandling.ScheduleException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;


@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public String findPasswordByUserName(String idNumber) {
        if (loginRepository.getRoleId(idNumber) == 2) {
            return loginRepository.findPasswordByIdNumber(idNumber);

        } else if (loginRepository.getRoleId(idNumber) == 1) {
            return loginRepository.findPasswordByIdNumber(idNumber);
        }
        else{
            throw new ScheduleException("Computer says NO!");
        }
    }

}
