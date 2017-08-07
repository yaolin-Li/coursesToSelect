import java.util.*;
public class TestGeneric 
{
	/**
	����
	*/
	public List<Course> courses;
	
	public TestGeneric(){
		this.courses = new ArrayList<Course>();
	}
	/**
		���ͽ�Ͽ�����ӷ�ʡ����Ķ���ʵ��
	*/

	public void testChild(){
		ChildCourse ccr = new ChildCourse();
		ccr.id="3";
		ccr.name = "���������͵�ʵ�����";
		courses.add(ccr);
	}

	public void testAdd(){
		Course cr = new Course("1","��β��");
		courses.add(cr);
		//courses.add("adasdad");
		//���ͼ����в�����ӷ�������֮��Ķ���
		Course cr2 = new Course("2","��ʡ����");
		courses.add(cr2);
	}

	public void testForeach(){
		for(Course cr:courses){
			System.out.println("�γ� �� "+cr.id+" : "+cr.name);
		}
	}
	/**
	���Ͳ���ʹ�û�������
	*/
	public void testBaicType(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1); 
		System.out.println("\n�������ͱ���ʹ�ð�װ���� "+list.get(0));
	}

	public static void main(String[] args) 
	{
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		//tg.testForeach();
		tg.testChild();
		tg.testForeach();
		tg.testBaicType();
	}
}
