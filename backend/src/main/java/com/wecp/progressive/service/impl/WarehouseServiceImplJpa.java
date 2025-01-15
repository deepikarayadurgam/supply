<<<<<<< HEAD

package com.wecp.progressive.service.impl;

import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.exception.NoWarehouseFoundForSupplierException;
import com.wecp.progressive.repository.ProductRepository;
import com.wecp.progressive.repository.WarehouseRepository;
import com.wecp.progressive.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

@Service
public class WarehouseServiceImplJpa implements WarehouseService {

    private WarehouseRepository warehouseRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    public WarehouseServiceImplJpa(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    @Override
    public List<Warehouse> getAllWarehouses() throws SQLException {
        return warehouseRepository.findAll();
=======
package com.wecp.progressive.service.impl;

import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class WarehouseServiceImplJpa implements WarehouseService {

    @Override
    public List<Warehouse> getAllWarehouses() throws SQLException {
        return List.of();
>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b
    }

    @Override
    public int addWarehouse(Warehouse warehouse) throws SQLException {
<<<<<<< HEAD
        return warehouseRepository.save(warehouse).getWarehouseId();
=======
        return -1;
>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() throws SQLException {
<<<<<<< HEAD
        List<Warehouse> sortedWarehouses = warehouseRepository.findAll();
        Collections.sort(sortedWarehouses);
        return sortedWarehouses;
    }

    @Override
    @Transactional
    public void updateWarehouse(Warehouse warehouse) throws SQLException {
        warehouseRepository.save(warehouse);
    }

    @Override
    @Transactional
    public void deleteWarehouse(int warehouseId) throws SQLException {
        productRepository.deleteByWarehouseId(warehouseId);
        warehouseRepository.deleteById(warehouseId);
=======
        return List.of();
    }

    @Override
    public void updateWarehouse(Warehouse warehouse) throws SQLException {

    }

    @Override
    public void deleteWarehouse(int warehouseId) throws SQLException {

>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b
    }

    @Override
    public Warehouse getWarehouseById(int warehouseId) throws SQLException {
<<<<<<< HEAD
        return warehouseRepository.findByWarehouseId(warehouseId);
    }

    @Override
    public List<Warehouse> getWarehouseBySupplier(int supplierId) throws NoWarehouseFoundForSupplierException {
        List<Warehouse> warehouseList = warehouseRepository.findAllBySupplier_SupplierId(supplierId);
        if (warehouseList.isEmpty()) {
            throw new NoWarehouseFoundForSupplierException("Cannot find warehouse by this supplier id");
        }
        return warehouseList;
    }
}
=======
        return null;
    }

    @Override
    public List<Warehouse> getWarehouseBySupplier(int supplierId) {
        return null;
    }
}
>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b
