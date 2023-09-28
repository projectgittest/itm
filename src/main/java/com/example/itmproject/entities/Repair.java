package com.example.itmproject.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "repair")
public class Repair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long repair_id;

    private String brand;

    @Column(name = "customer_name")
    private String customer_name;

    @Column(name = "customer_surname")
    private String customer_surname;

    private Date dateof_purchase;

    private long serial_nr;

   /* @Column(name = "status_enum")
    @Enumerated(EnumType.STRING)
    private Status status_enum;

    */

    @Column(name = "price")
    private int price;

    @Column(name = "changed")
    private String changed;

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "status")
    private StatusEnum status;

    @Column(name = "description")
    private String description;


    //@Column(name = "status_enum")
   //private String status_enum;
    //@OneToMany(mappedBy = "repair_id")
   // private Collection<Report> reports;
    public Repair() {
    }

    public Long getRepair_id() {
        return repair_id;
    }

    public void setRepair_id(Long repair_id) {
        this.repair_id = repair_id;
    }

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

    /*public Status getStatus_enum() {
        return status_enum;
    }

    public void setStatus_enum(Status status_enum) {
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

    /*public String getStatus_enum() {
        return status_enum;
    }

    public void setStatus_enum(String status_enum) {
        this.status_enum = status_enum;
    }

     */

}
