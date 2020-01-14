package com.aszczep.sheduler.searchAlgorythms;

import com.aszczep.sheduler.constrains.Constrains;
import com.aszczep.sheduler.parameters.Room;
import com.aszczep.sheduler.parameters.StudentGroup;
import com.aszczep.sheduler.parameters.Subject;
import com.aszczep.sheduler.parameters.Timeslot;
import com.aszczep.sheduler.variables.Exam;
import com.aszczep.sheduler.variables.Timetable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ForwardChecking {
    private List<Subject> subjects;
    private List<Room> rooms;
    private List<Timeslot> timeslots;
    private HashMap<StudentGroup, List<Timeslot>> studentGroupTimeDomain;
    private HashMap<StudentGroup,List<Subject>> studentGroupSubjects;

    public Timetable solve() {
        createDomains();
        return solveRecursive(new Timetable(),subjects);
    }

    private Timetable solveRecursive(Timetable timetable, List<Subject> subjectsToAssign) {
        if (subjectsToAssign.isEmpty() && Constrains.verifyConstrains(timetable))
            return timetable;
        //for
        ListIterator<Room> roomIter = rooms.listIterator();
        while (roomIter.hasNext()) {
            Room roomToAssign = roomIter.next();
            List<Exam> exams = timetable.getExams();

            ListIterator<Subject>subjectListIterator = subjectsToAssign.listIterator();
            while(subjectListIterator.hasNext()){
                Subject subjectToAssign = subjectListIterator.next();
                




            }



        }

        return null;
    }


    private void createDomains() {
        HashMap<StudentGroup, List<Timeslot>> domains = new HashMap<>();
        for (Subject subject : getSubjects()) {
            domains.computeIfAbsent(subject.getStudentGroup(), k -> new ArrayList<>(timeslots));

        }


        studentGroupTimeDomain = domains;
    }

    private void clearDay(List<Timeslot> timeslots, Integer day) {
        timeslots.removeIf(temp -> temp.getDay().equals(day));
    }
}
