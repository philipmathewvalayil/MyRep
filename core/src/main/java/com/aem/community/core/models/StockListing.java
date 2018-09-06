package com.aem.community.core.models;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import java.util.*;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
@Model(adaptables=Resource.class)
public class StockListing {
	 private List<String> list;
	 
	 private String message;

	    @PostConstruct
	    protected void init() {
	    	
	        message = "\tHello World !\n";
	    }
	    
	public List<String> getList(){		
		list= new ArrayList<>();
		 list.add("APHILIP Test Afete ");
		 list.add("VSANTHOSH Second");
		return list;
	}
	 

}
