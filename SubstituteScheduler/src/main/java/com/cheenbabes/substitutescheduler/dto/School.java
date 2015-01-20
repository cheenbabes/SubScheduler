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
public class School {
    int schoolId;
    String name;
    String streetAddress;
    String city;
    String state;
    String zip;
    String contactPerson;
    String phone;
    List<Event> events;
    
}
