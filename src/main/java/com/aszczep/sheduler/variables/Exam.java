package com.aszczep.sheduler.variables;


import com.aszczep.sheduler.parameters.Subject;
import com.aszczep.sheduler.parameters.Room;
import com.aszczep.sheduler.parameters.Teacher;
import com.aszczep.sheduler.parameters.Timeslot;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Exam {
    private Timeslot timeslot;
    private Subject subject;
    private Teacher teacher;
    private Room room;

    public Boolean checkRoomSize(){
        return getSubject().getStudentCount() <= getRoom().getSize();
    }

    public Boolean checkTeacherAvailability(){
        return getTeacher().getAvailableTimeslots().contains(timeslot);
    }


}
