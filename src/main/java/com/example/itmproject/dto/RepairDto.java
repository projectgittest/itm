package com.example.itmproject.dto;

import com.example.itmproject.entities.Report;
//import com.example.itmproject.entities.Status;
//import com.example.itmproject.entities.Status;
//import com.example.itmproject.entities.Status;
//import com.example.itmproject.entities.Status;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

import com.example.itmproject.entities.Repair;
import com.example.itmproject.entities.StatusEnum;

import java.sql.Date;

public class RepairDto {

    private String brand;

    private String customer_name;

    private String customer_surname;

    private Date dateof_purchase;

    private long serial_nr;

   // private String status_enum;

    private int price;

    private String changed;

   private String StatusEnum;
   private String description;
    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_surname() {
        return customer_surname;
    }

    public void setCustomer_surname(String customer_surname) {
        this.customer_surname = customer_surname;
    }

    public Date getDateof_purchase() {
        return dateof_purchase;
    }

    public void setDateof_purchase(Date dateof_purchase) {
        this.dateof_purchase = dateof_purchase;
    }

    public long getSerial_nr() {
        return serial_nr;
    }

    public void setSerial_nr(long serial_nr) {
        this.serial_nr = serial_nr;
    }

    public String getStatusEnum() {
        return StatusEnum;
    }

    public void setStatusEnum(String statusEnum) {
        StatusEnum = statusEnum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /*  public String getStatus_enum() {
        return status_enum;
    }

   // public void setStatus_enum(String status_enum) {
        this.status_enum = status_enum;
    }


   */


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getChanged() {
        return changed;
    }

    public void setChanged(String changed) {
        this.changed = changed;
    }

    public static RepairDto toDto(Repair repair){
        RepairDto dto = new RepairDto();
        dto.setBrand(repair.getBrand());
        dto.setCustomer_name(repair.getCustomer_name());
        dto.setCustomer_surname(repair.getCustomer_surname());
        dto.setDateof_purchase(repair.getDateof_purchase());
        dto.setSerial_nr(repair.getSerial_nr());
       // dto.setStatus_enum(repair.getStatus_enum());
       dto.setStatusEnum(repair.getStatus().name());
        dto.setPrice(repair.getPrice());
        dto.setChanged(repair.getChanged());
      //  dto.setStatus_enum(repair.getStatus_enum());

        return dto;
    }

    public static Repair toEntity(RepairDto repairDto){
        Repair entity=new Repair();
        entity.setBrand(repairDto.getBrand());
        entity.setCustomer_name(repairDto.getCustomer_name());
        entity.setCustomer_surname(repairDto.getCustomer_surname());
        entity.setDateof_purchase(repairDto.getDateof_purchase());
        entity.setSerial_nr(repairDto.getSerial_nr());
       // entity.setStatus_enum(repairDto.getStatus_enum());
       entity.setStatus(com.example.itmproject.entities.StatusEnum.toEnum(repairDto.getStatusEnum()));
        entity.setPrice(repairDto.getPrice());
        entity.setChanged(repairDto.getChanged());
       // entity.setStatus_enum(repairDto.getStatus_enum());

        return entity;
    }
}
