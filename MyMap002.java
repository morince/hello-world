package cn.kilido.collection;

import java.util.LinkedList;

public class MyMap002 {
	LinkedList[] arr = new LinkedList[999];
	int size;
	public void put(Object key,Object value){
		MyEntry e = new MyEntry(key, value);
		int a = key.hashCode()%arr.length;
		int hash = key.hashCode();
		hash = hash<0?-hash:hash;
		if(arr[a]==null){
			LinkedList list = new LinkedList();
			arr[a] = list;
			list.add(e);
		}else{
			LinkedList list = arr[a];
			for (int i = 0; i <list.size(); i++) {
				MyEntry e2 = (MyEntry)list.get(i);
				if(e2.key.equals(key)){
					e2.value = value;
					return;
				}	
			}
			arr[a].add(e);
		}
	}	
	public Object get(Object key){
		int a = key.hashCode()%arr.length;
		if(arr[a]!=null){
		LinkedList list = arr[a];
		for (int i = 0; i <list.size(); i++) {
			MyEntry e = (MyEntry)list.get(i);
			if(e.key.equals(key)){
				return  e.value;
			}
		}
		}
		return null;
	}
	
	public static void main(String[] args) {
		MyMap002 m = new MyMap002();
		m.put("Nick",new Actor("K"));
		m.put("Luna",new Actor("a"));
		Actor a = (Actor)m.get("Luna");
		System.out.println(a.name);
		
	
		
	}

}
