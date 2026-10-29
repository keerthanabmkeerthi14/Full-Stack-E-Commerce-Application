package com.keerthanabm.ecomproj.repo;

import com.keerthanabm.ecomproj.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
