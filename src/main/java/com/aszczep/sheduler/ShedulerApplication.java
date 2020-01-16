package com.aszczep.sheduler;

import com.aszczep.sheduler.parameters.*;
import com.aszczep.sheduler.searchAlgorythms.Backtrack;
import com.aszczep.sheduler.searchAlgorythms.ForwardChecking;
import com.aszczep.sheduler.variables.Timetable;
import org.hibernate.mapping.Collection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ShedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShedulerApplication.class, args);

		Teacher teacher = new Teacher();
		teacher.setId(1);
		Timeslot timeslot = new Timeslot(1,1);
		Timeslot timeslot1 = new Timeslot(2,1);

		Timeslot timeslot11 = new Timeslot(1,1);
		Timeslot timeslot21 = new Timeslot(2,1);
		Timeslot timeslot2 = new Timeslot(1,2);
		List<Timeslot> timeslots = new ArrayList<>();
		timeslots.add(timeslot11);
		timeslots.add(timeslot21);
		teacher.setAvailableTimeslots(timeslots);

		List<Timeslot> timeslots1 = new ArrayList<>();
		timeslots1.add(timeslot2);
		timeslots1.add(timeslot);
		timeslots1.add(timeslot1);

		StudentGroup studentGroup = new StudentGroup("test",1);

		Subject subject = new Subject();
		subject.setId(2);
		subject.setTeacher(teacher);
		subject.setStudentGroup(studentGroup);
		subject.setStudentCount(20);

		Subject subject1 = new Subject();
		subject1.setId(3);
		subject1.setTeacher(teacher);
		subject1.setStudentGroup(studentGroup);
		subject1.setStudentCount(20);

		List<Subject> subjectList = new ArrayList<>();

		subjectList.add(subject);
		subjectList.add(subject1);

		Room room = new Room(10,10,30);

		List<Room> rooms = new ArrayList<>();
		rooms.add(room);

		ForwardChecking backtrack = new ForwardChecking();
		backtrack.setRooms(rooms);
		backtrack.setSubjects(subjectList);
		backtrack.setTimeslots(timeslots1);
		Timetable timetable = backtrack.solve();
		if(timetable!=null){
			System.out.println("gut");
		}


	}

}
