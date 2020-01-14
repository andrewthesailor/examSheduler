package com.aszczep.sheduler.parameters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    private Integer id;
    private Integer number;
    private Integer size;
}