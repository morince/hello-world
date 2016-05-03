package cn.kilido.collection;
/**
 * 自定义实现类似Map的功能
 * 初始版
 * Map存放键值对，根据键对象找到对应的值对象；
 * @author kilid
 *
 */
public class MyMap001 {
	MyEntry[] arr = new MyEntry[999];
	int size;
	
	public void put(Object key,Object value){//键值不能重复；
		MyEntry e = new MyEntry(key, value);
		for(int i=0;i<size;i++){//解决键值对重复的问题；
			if(arr[i].key.equals(key)){
				arr[i].value = value;
				return;
			}
		}
		arr[size++] = e;
		
		
	}
	
	public Object get(Object key){
		for(int i=0;i<size;i++){
			if(arr[i].key.equals(key)){
				return arr[i].value;
			}
		}
		return null;
	}
	public boolean containsKey(Object key){
		for(int i=0;i<size;i++){
			if(arr[i].key.equals(key)){
				return true;
			}
		}
		return false;
	}
	public boolean containsValue(Object value){
		for(int i=0;i<size;i++){
			if(arr[i].value.equals(value)){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		MyMap001 m = new MyMap001();
		m.put("白洛因",new Actor("许魏洲"));
		m.put("顾海",new Actor("黄景瑜"));
		Actor a = (Actor)m.get("白洛因");
		System.out.println(a.name);
		
	
	
	}
}
class MyEntry{
	Object key;
	Object value;
	public MyEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	
	
}