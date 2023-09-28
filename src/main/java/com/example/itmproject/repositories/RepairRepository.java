package com.example.itmproject.repositories;


import com.example.itmproject.entities.Repair;
//import com.example.itmproject.entities.Status;
//import com.example.itmproject.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepairRepository extends JpaRepository<Repair,Long> {

    List<Repair>findAll();

    @Query("select r from Repair r where r.repair_id=?1")
    Repair findAllById(Long repair_id);

//    Repair findAllById_status(Long id_status);

    //@Query("select r from Repair r where r.status_enum=?1")
    //Repair findAllByStatus_enum(@Param("status") String status_enum);


}
