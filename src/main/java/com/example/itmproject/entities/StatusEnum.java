package com.example.itmproject.entities;

public enum StatusEnum {
    toberepaird,
    repaired,
    unrepairable;

    public static StatusEnum toEnum(String status){
        if(status.equals(StatusEnum.toberepaird.name())){
            return StatusEnum.toberepaird;
        } else if (status.equals(StatusEnum.repaired.name())) {
            return StatusEnum.repaired;
        } else if (status.equals(StatusEnum.unrepairable.name())) {
            return StatusEnum.unrepairable;
        }
        return null;
    }

}







