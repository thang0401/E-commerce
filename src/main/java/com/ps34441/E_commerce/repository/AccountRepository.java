package com.ps34441.E_commerce.repository;

import com.ps34441.E_commerce.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository< Account, String> {
}
