package com.over;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company {
public static void main(String[] args) {
	
	List<Client> li = new ArrayList();
	li.add(new Client (123, "Java", 98765434567l));
	li.add(new Client(454, "Maven", 6578765467l));
	li.add(new Client(876, "Framework",456787l));
	
//	Iterator<Client> iterator = li.iterator();
//	while(iterator.hasNext()) {
//		Client next = iterator.next();
//		if(next.getId())
//	}
	
	Iterator<Client> iterator = li.iterator();
	iterator.forEachRemaining(System.out::println);
	
	
	
}

}
