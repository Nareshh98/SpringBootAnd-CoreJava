package com.relations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.Entity.Item;

public interface IteamRepository extends JpaRepository<Item, Integer> {

}
