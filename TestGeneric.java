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

	public static void main(String[] args) 
	{
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		tg.testForeach();
	}
}
