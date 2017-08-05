import java.util.*;
/**
	��ѡ�γ���
*/
public class ListTest 
{
	public List coursesToSelect;
	public ListTest()
	{
		this.coursesToSelect = new ArrayList<String>();
	//���ڴ�ű�ѡ�γ�
	}
	public void testAdd()
	{
		/**
			���������Ŀ
		*/
		Course cr1 = new Course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp = (Course)coursesToSelect.get(0);
		System.out.println(temp.name+" : "+temp.id);

		Course cr2 = new Course("2","C����");
		coursesToSelect.add(0,cr2);
		Course temp2 = (Course)coursesToSelect.get(0);
		System.out.println(temp2.name+" : "+temp2.id);
		
		coursesToSelect.add(cr1);
		Course temp0 = (Course)coursesToSelect.get(2);
		System.out.println(temp0.name+" : "+temp0.id);
		/**
		Course cr3 = new Course("3","B����");
		coursesToSelect.add(2,cr3);
		Course temp3 = (Course)coursesToSelect.get(2);
		System.out.println(temp3.name+" : "+temp3.id);
		*/
		Course[] course = {new Course("3","��ɢ��ѧ"),new Course("4","�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course)coursesToSelect.get(3);
		Course temp4 = (Course)coursesToSelect.get(4);
		System.out.println(temp3.name+" : "+temp3.id+"\n"+temp4.name+" : "+temp4.id);

		Course[] course2 = {new Course("5","��ɢ��ѧ2"),new Course("6","�������2")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course temp5 = (Course)coursesToSelect.get(2);
		Course temp6 = (Course)coursesToSelect.get(3);
		System.out.println(temp5.name+" : "+temp5.id+"\n"+temp6.name+" : "+temp6.id);

	


	}
	/**
	ȡ��Ԫ��
	*/
	public void testGet(){
		int size = coursesToSelect.size();
		for(int i = 0 ; i< size;i++){
			Course cr = (Course)coursesToSelect.get(i);
			System.out.println("�γ� "+cr.id+" : "+cr.name);

		}
	}
	/**
	ͨ������������
	*/
	public void testIterator(){
		//ͨ�����ϵĵ���������
		Iterator it = coursesToSelect.iterator();
		System.out.println("\n���¿γ̴�ѡ(ͨ������������)");
		while(it.hasNext()){
			Course cr = (Course)it.next();
			System.out.println("�γ� �� "+cr.id+" : "+cr.name);
		}
	}
	/**
		ͨ��foreach()
	*/
	public void testForeach(){
		System.out.println("\n���¿γ̴�ѡ(ͨ��Foreach����)");
		for(Object obj:coursesToSelect){
			Course cr = (Course)obj;
			System.out.println("�γ� �� "+cr.id+" : "+cr.name);
		}
	}
	/**
	�޸�Ԫ��
	*/
	public void testModify(){
		coursesToSelect.set(4,new Course("7","ë��"));
	}
	/**
	ɾ��Ԫ��
	*/
	public void testRemove(int num){
		//Course cr = (Course)coursesToSelect.get(num);
		System.out.println("\n��ɾ���γ� ��5��6 ");
		Course[] courses = {(Course)coursesToSelect.get(5),(Course)coursesToSelect.get(6)};
		coursesToSelect.removeAll(Arrays.asList(courses));
		//coursesToSelect.remove(cr);
		System.out.println("ɾ���ɹ�");
		testForeach();

	}

/**
�����ֵĶ���
*/

	public void testType(){
		System.out.println("\n�����ֵĶ���");
		coursesToSelect.add("�Ҳ��ǿγ�");
	}

	public static void main(String[] args)
	{
		ListTest it = new ListTest();
		it.testAdd();
		it.testType();
		//it.testGet();
		//it.testIterator();
		//it.testModify();
		it.testForeach();
		//it.testRemove(4);
		

	}
}
