/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cheenbabes.substitutescheduler.dto;

import java.time.LocalDate;

/**
 *
 * @author ebaibourine
 */
public class Event {
    int event_id;
    String eventName;
    int schoolId;
    int subId;
    LocalDate startDate;
    LocalDate endDate;
}
