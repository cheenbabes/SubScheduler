/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cheenbabes.substitutescheduler.dto;

import java.util.List;

/**
 *
 * @author ebaibourine
 */
public class Substitute {
    int subId;
    String firstName;
    String lastName;
    String streetAddress;
    String city;
    String state;
    String zip;
    String phone;
    boolean onCall = false;
    boolean available = false;
    List<Event> events;
    List<ATime> schedule;
}
