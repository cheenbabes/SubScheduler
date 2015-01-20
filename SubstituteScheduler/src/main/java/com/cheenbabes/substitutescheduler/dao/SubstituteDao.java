/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cheenbabes.substitutescheduler.dao;

import com.cheenbabes.substitutescheduler.dto.Substitute;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author ebaibourine
 */
public interface SubstituteDao {
 
    Substitute addSubstitute(Substitute sub);
    
    void deleteSubstitute(int subId);
    
    void updateSubstitute(int subId);
    
    Substitute getSubById(int SubId);
    
    List<Substitute> getAllOnCallSubstitutes();
    
    List<Substitute> getAllAvailableSubsDateRange(LocalDate startDate, LocalDate endDate);
    
}
