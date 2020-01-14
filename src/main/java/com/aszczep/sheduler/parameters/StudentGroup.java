package com.aszczep.sheduler.parameters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StudentGroup {
    private String course;
    private Integer semester;

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        if(this.getCourse().equals(((StudentGroup) obj).getCourse())){
            return this.getSemester().intValue()==((StudentGroup) obj).getSemester().intValue();
        }
        return false;
    }

}
