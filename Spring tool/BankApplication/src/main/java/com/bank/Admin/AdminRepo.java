package com.bank.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepo extends JpaRepository<AdminTable, Long> {



}

