package com.example.itmproject.service;

import com.example.itmproject.dto.RepairDto;
//import com.example.itmproject.entities.Status;
//import com.example.itmproject.entities.Status;
import com.example.itmproject.repositories.RepairRepository;
import com.example.itmproject.entities.Repair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RepairService {

    @Autowired
    RepairRepository repairRepository;


    public RepairService(RepairRepository repairRepository){
        this.repairRepository=repairRepository;
    }


    List<Repair>repairs=new ArrayList<>();
    public List<Repair>findAll(){
        repairs=repairRepository.findAll();
        return repairs;
    }

    public Repair findAllById(Long repair_id){
        return repairRepository.findAllById(repair_id);
    }



    public void save(Repair repair) {
        repairRepository.save(repair);
    }

    public void deleteRepairsById(Long repair_id){
        repairRepository.deleteById(repair_id);
    }

//    public Repair findAllById_status(Long id_status) {
//        return repairRepository.findAllById_status(id_status);
//    }




   /* public void findAllByStatus_enum(String status_enum){
        repairRepository.findAllByStatus_enum(status_enum);
    }

    */


    /*public RepairDto save(RepairDto dto){
        Repair repairDto=repairRepository.save(RepairDto.toEntity(dto));
        return RepairDto.toDto(repairDto);
    }

     */

   /* public void status(Long repair_id){
        repairRepository.findAllById(repair_id);
    }

    */
}
