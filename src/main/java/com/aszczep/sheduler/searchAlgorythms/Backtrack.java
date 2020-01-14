package com.aszczep.sheduler.searchAlgorythms;

import com.aszczep.sheduler.constrains.Constrains;
import com.aszczep.sheduler.parameters.Subject;
import com.aszczep.sheduler.parameters.Room;
import com.aszczep.sheduler.parameters.Timeslot;
import com.aszczep.sheduler.utils.InitUtils;
import com.aszczep.sheduler.variables.Exam;
import com.aszczep.sheduler.variables.Timetable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Backtrack {
    private List<Subject> subjects;
    private List<Room> rooms;
    private List<Timeslot> timeslots;

    public Timetable solve() {
        return solveRecursive(new Timetable(), subjects);
    }

    public Timetable solveRecursive(Timetable timetable, List<Subject> subjectsToAssign) {
        if (subjectsToAssign.isEmpty() && Constrains.verifyConstrains(timetable))
            return timetable;
        ListIterator<Room> roomIter = rooms.listIterator();
        while(roomIter.hasNext()) {
            Room roomToAssign = roomIter.next();
            List<Exam> exams = timetable.getExams();
            ListIterator<Timeslot> iter = timeslots.listIterator();
            while (iter.hasNext()) {
                Timeslot timeslotToAssign = iter.next();
                ListIterator<Subject> subjectIter = subjectsToAssign.listIterator();
                while (subjectIter.hasNext()) {
                    Subject subject = subjectIter.next();
                    Exam exam = new Exam();
                    exam.setRoom(roomToAssign);
                    exam.setSubject(subject);
                    exam.setTeacher(subject.getTeacher());
                    exam.setTimeslot(timeslotToAssign);
                    exams.add(exam);
                    Timetable solution = new Timetable(exams);
                    if (Constrains.verifyConstrains(solution)) {
//                        iter.remove();
//                        if (!iter.hasNext()) {
//                            roomIter.remove();
//                        }
                        subjectIter.remove();
                        solution = solveRecursive(timetable, subjectsToAssign);
                        if (solution != null)
                            return solution;
                    }
                    exams.remove(exam);
                }
            }
        }
        return null;
    }

}
