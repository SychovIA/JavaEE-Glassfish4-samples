package com.demo.jpql.namedbean;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.demo.jpql.entity.UsState;



@Named
@RequestScoped
public class SelectQueryBean {
	 @PersistenceContext
	    private EntityManager entityManager;

	    private List<UsState> matchingStatesList;
	    
	    private String usStates;
	    
	    public void findStates(ActionEvent event) {
	    	
	        try {
	            Query query = entityManager.createNamedQuery("UsState.find");
	            query.setParameter("name", usStates + "%");
	            matchingStatesList = query.getResultList();
	        } catch (Exception e) {
	        	
	            e.printStackTrace();
	        }
			
	    }
	    
	    public List<UsState> completeState(String states){
	    	List<UsState> filteredStates = new ArrayList<>();
	    	 try {
		            Query query = entityManager.createNamedQuery("UsState.find");
		            query.setParameter("name", states + "%");
		            filteredStates = query.getResultList();
		        } catch (Exception e) {
		        	
		            e.printStackTrace();
		        }
			return filteredStates; 
	    }

	    public List<UsState> getMatchingStatesList() {
	        return matchingStatesList;
	    }

	    public void setMatchingStatesList(List<UsState> matchingStatesList) {
	        this.matchingStatesList = matchingStatesList;
	    }

		public String getUsStates() {
			return usStates;
		}

		public void setUsStates(String usStates) {
			this.usStates = usStates;
		}


}


