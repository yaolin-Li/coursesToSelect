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
	/**
		泛型结合可以添加反省子类的对象实例
	*/

	public void testChild(){
		ChildCourse ccr = new ChildCourse();
		ccr.id="3";
		ccr.name = "我是子类型的实验对象";
		courses.add(ccr);
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
	/**
	泛型不能使用基本类型
	*/
	public void testBaicType(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1); 
		System.out.println("\n基本类型必须使用包装类型 "+list.get(0));
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
