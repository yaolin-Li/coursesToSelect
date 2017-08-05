import java.util.*;
public class TestGeneric 
{
	/**
	泛型
	*/
	public List<Course> courses;
	
	public TestGeneric(){
		this.courses = new ArrayList<Course>();
	}
	
	public void testAdd(){
		Course cr = new Course("1","鱼尾纹");
		courses.add(cr);
		//courses.add("adasdad");
		//泛型集合中不能添加泛型类型之外的对象
		Course cr2 = new Course("2","反省基础");
		courses.add(cr2);
	}

	public void testForeach(){
		for(Course cr:courses){
			System.out.println("课程 ： "+cr.id+" : "+cr.name);
		}
	}

	public static void main(String[] args) 
	{
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		tg.testForeach();
	}
}
