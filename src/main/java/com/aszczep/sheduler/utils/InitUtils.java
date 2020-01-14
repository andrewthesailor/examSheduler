package com.aszczep.sheduler.utils;

import com.aszczep.sheduler.parameters.Room;
import com.aszczep.sheduler.parameters.Timeslot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class InitUtils {
    public static HashMap<Room, ArrayList<Timeslot>>getRoomTimeslotCombination(List<Room>rooms, List<Timeslot>timeslots){
        HashMap<Room, ArrayList<Timeslot>>combination = new HashMap<>();
        for(Room room: rooms){
            combination.put(room, (ArrayList<Timeslot>) timeslots);
        }
        return combination;
    }


}
