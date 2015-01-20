/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cheenbabes.substitutescheduler.dao;

import com.cheenbabes.substitutescheduler.dto.School;
import java.util.List;

/**
 *
 * @author ebaibourine
 */
public interface SchoolDao {
    
    School addSchool(School school);
    
    void deleteSchool(int schoolId);
    
    void updateSchool(int schoolId);
    
    School getSchoolById(int schoolId);
    
    List<School> getAllSchools();
     
}
