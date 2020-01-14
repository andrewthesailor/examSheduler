package com.aszczep.sheduler.parameters;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private Integer id;
    private String name;
    private String surname;
    private List<Subject> subjects;
    private List<Timeslot>availableTimeslots;

}
