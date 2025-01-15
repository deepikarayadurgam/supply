package com.wecp.progressive.entity;

<<<<<<< HEAD
import javax.persistence.*;
=======
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b

@Entity
public class Warehouse implements Comparable<Warehouse> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int warehouseId;
<<<<<<< HEAD
    
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
=======
    private int supplierId;
>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b
    private String warehouseName;
    private String location;
    private int capacity;

    public Warehouse() {
    }

    public Warehouse(int warehouseId, int supplierId, String warehouseName, String location, int capacity) {
        this.warehouseId = warehouseId;
<<<<<<< HEAD
        this.supplier.setSupplierId(supplierId);
=======
        this.supplierId = supplierId;
>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b
        this.warehouseName = warehouseName;
        this.location = location;
        this.capacity = capacity;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

<<<<<<< HEAD
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
=======
    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int compareTo(Warehouse otherWarehouse) {
        // Implement comparison logic based on warehouse capacity
        return Double.compare(otherWarehouse.getCapacity(), this.getCapacity());
    }
}