/**
 * this interface manage the differents connexions between users and administrative service
 * it containt method to get: user id, service id time of connexion, user's number in the waiting list for this service
 * 
 */
package com.mabayus.interfaces;

/**
 * @author user
 *
 */
import java.lang.String;
import java.util.Date;
import java.util.List;
public interface IConnexion {
	
	public List<Object> getUserListForService(String idService,String status, Date day); 
	
	public List<Object> getNNextuser(String idService,String status, Date day, int size);
}
