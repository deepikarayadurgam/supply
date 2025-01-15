package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import com.wecp.progressive.dao.SupplierDAO;
=======
>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b
import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class SupplierServiceImplArraylist implements SupplierService {

<<<<<<< HEAD
    private SupplierDAO supplierDAO;

    public SupplierServiceImplArraylist(SupplierDAO supplierDAO) {
        this.supplierDAO = supplierDAO;
    }


    private static List<Supplier> supplierList;
    
    public SupplierServiceImplArraylist(){
        supplierList = new ArrayList<>();
    }
=======
    private static List<Supplier> supplierList = new ArrayList<>();
>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierList;
    }

    @Override
    public int addSupplier(Supplier supplier) {
        supplierList.add(supplier);
        return supplierList.size();
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        List<Supplier> sortedSupplier = supplierList;
<<<<<<< HEAD
        sortedSupplier.sort(Comparator.comparing(Supplier::getSupplierName)); 
        return sortedSupplier;
    }


=======
        sortedSupplier.sort(Comparator.comparing(Supplier::getSupplierName)); // Sort by supplier name
        return sortedSupplier;
    }

>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b
    @Override
    public void emptyArrayList() {
        supplierList = new ArrayList<>();
    }
}