package cn.kilido.collection;
/**
 * �Զ���ʵ������Map�Ĺ���
 * ��ʼ��
 * Map��ż�ֵ�ԣ����ݼ������ҵ���Ӧ��ֵ����
 * @author kilid
 *
 */
public class MyMap001 {
	MyEntry[] arr = new MyEntry[999];
	int size;
	
	public void put(Object key,Object value){//��ֵ�����ظ���
		MyEntry e = new MyEntry(key, value);
		for(int i=0;i<size;i++){//�����ֵ���ظ������⣻
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
		m.put("������",new Actor("��κ��"));
		m.put("�˺�",new Actor("�ƾ��"));
		Actor a = (Actor)m.get("������");
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