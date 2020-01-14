package com.aszczep.sheduler.parameters;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Subject {
    private Integer id;
    private String name;
    private Integer studentCount;
    private StudentGroup studentGroup;
    private Teacher teacher;
}
