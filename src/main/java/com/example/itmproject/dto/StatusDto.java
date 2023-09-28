//package com.example.itmproject.dto;
//
//import com.example.itmproject.entities.StatusEnum;
//
//public class StatusDto {
//    private String description;
//
//    private String name;
//
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public static StatusDto toDto(StatusEnum statusEnum){
//        StatusDto dto=new StatusDto();
//        dto.setDescription(statusEnum.getDescription());
//        dto.setName(statusEnum.getName());
//
//
//        return dto;
//    }
//
//    public static StatusEnum toEntity(StatusDto statusDto){
//        StatusEnum entity=new StatusEnum();
//        entity.setDescription(statusDto.getDescription());
//        entity.setName(statusDto.getName());
//
//        return entity;
//    }
//
//}
