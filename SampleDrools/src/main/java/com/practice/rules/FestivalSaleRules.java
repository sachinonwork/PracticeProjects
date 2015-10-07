package com.practice.rules;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

import com.practice.entities.Person;
import com.practice.entities.SaleableItem;

public class FestivalSaleRules {
    public double getApplicableDiscount(Person person, SaleableItem item) {
    	StatefulKnowledgeSession ksession = initFestivalSalesRules();
    	if(ksession == null) {
    		return 0;
    	}
    	ksession.insert(person);
    	ksession.insert(item);
    	
    	ksession.fireAllRules();
    	System.out.println("discount calculated is:" + item.getSaleDiscountPercent());
    	return item.getSaleDiscountPercent();
        
    }

	private StatefulKnowledgeSession initFestivalSalesRules() {
		
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
    	
    	kbuilder.add( ResourceFactory.newClassPathResource("FestivalSaleRules.drl"),  ResourceType.DRL);
    	if(kbuilder.hasErrors()) {
    		System.out.println("Errors are:" + kbuilder.getErrors());
    		return null;    		
    	}
    	KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
    	kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
    	StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		return ksession;
	}
}
