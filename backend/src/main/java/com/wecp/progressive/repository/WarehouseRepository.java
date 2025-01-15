package com.wecp.progressive.repository;

<<<<<<< HEAD
import com.wecp.progressive.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
    Warehouse findByWarehouseId(@Param("warehouseId") int warehouseId);

    List<Warehouse> findAllBySupplier_SupplierId(@Param("supplierId") int supplierId);

    @Modifying
    @Transactional
    @Query("DELETE FROM Warehouse w WHERE supplier_id = :supplierId")
    void deleteBySupplierId(@Param("supplierId") int supplierId);
}
=======

public interface WarehouseRepository {
}
>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b
