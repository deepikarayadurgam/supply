package com.wecp.progressive.repository;

<<<<<<< HEAD
import com.wecp.progressive.entity.Supplier;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

    // @Modifying
    // @Transactional
    void deleteBySupplierId(@Param("supplierId") int supplierId);

    Supplier findBySupplierId(@Param("supplierId") int supplierId);

    Supplier findByUsername(String username);

    Supplier findByEmail(String email);
}
=======

public interface SupplierRepository {
}
>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b
