/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.nigeriaemr.ndrUtils;

/**
 * @author MORRISON.I
 */
public class ConstantsUtil {
	
	public static final int PEPFAR_IDENTIFIER_INDEX = 4;
	
	public static final int HOSPITAL_IDENTIFIER_INDEX = 5;
	
	public static final int OTHER_IDENTIFIER_INDEX = 3;
	
	public static final int HTS_IDENTIFIER_INDEX = 8;
	
	public static final int PMTCT_IDENTIFIER_INDEX = 6;
	
	public static final int EXPOSE_INFANT_IDENTIFIER_INDEX = 7;
	
	public static final int PEP_ED_IDENTIFIER_INDEX = 9;
	
	public static final String COMMUNITY_TESTER_TABLE = "community_testers";
	
	public static final String PATIENT_CONTACT_TABLE = "patient_contacts";
	
	public static final String FACILITY_LOCATION_TABLE = "facility_has_location";
	
	public static final int ADMISSION_ENCOUNTER_TYPE = 2;
	
	//Endpoints
	//public static final String BASE_URL = "https://hts.shieldnigeriaproject.com/api";
	
	public static final String BASE_URL = "https://hts.shieldnigeriaproject.com/api/nmrs";
	
	public static final String GET_COMMUNITY_TESTER = "/GetTester";
	
	public static final String GET_ClIENT = "/GetClientReferal";
	
}
