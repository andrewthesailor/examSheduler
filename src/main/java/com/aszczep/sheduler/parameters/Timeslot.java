package com.aszczep.sheduler.parameters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Timeslot {
    //weekday
    private Integer day;
    //3hour exam slot 8-11 1, 11-14 2, 14-17 3, 17-20 4
    private Integer slot;

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        if(this.getDay().intValue()==((Timeslot) obj).getDay().intValue()){
            return this.getSlot().intValue()==((Timeslot) obj).getSlot().intValue();
        }
        return false;
    }


}
