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
	    	list= new ArrayList<>();
			 list.add("APHILIP Test Afeter lunch hjk");
			 list.add("VSANTHOSH Second");
	        message = "\tHello World !\n";
	    }
	    
	public List<String> getList(){		
		return list;
	}
	 

}
