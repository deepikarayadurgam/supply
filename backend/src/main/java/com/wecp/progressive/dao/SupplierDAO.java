package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Supplier;

import java.sql.SQLException;
import java.util.List;

public interface SupplierDAO {
    int addSupplier(Supplier supplier) throws SQLException;
    Supplier getSupplierById(int supplierId) throws SQLException;
    void updateSupplier(Supplier supplier) throws SQLException;
<<<<<<< HEAD
    void deleteSupplier(int supplierId) throws SQLException ;
    List<Supplier> getAllSuppliers()  throws SQLException;
}
=======
    void deleteSupplier(int supplierId) throws SQLException;
    List<Supplier> getAllSuppliers() throws SQLException;
}
>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b
