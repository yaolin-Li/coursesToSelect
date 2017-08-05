import java.util.*;
/**
	备选课程类
*/
public class ListTest 
{
	public List coursesToSelect;
	public ListTest()
	{
		this.coursesToSelect = new ArrayList<String>();
	//用于存放备选课程
	}
	public void testAdd()
	{
		/**
			用于添加项目
		*/
		Course cr1 = new Course("1","数据结构");
		coursesToSelect.add(cr1);
		Course temp = (Course)coursesToSelect.get(0);
		System.out.println(temp.name+" : "+temp.id);

		Course cr2 = new Course("2","C语言");
		coursesToSelect.add(0,cr2);
		Course temp2 = (Course)coursesToSelect.get(0);
		System.out.println(temp2.name+" : "+temp2.id);
		
		coursesToSelect.add(cr1);
		Course temp0 = (Course)coursesToSelect.get(2);
		System.out.println(temp0.name+" : "+temp0.id);
		/**
		Course cr3 = new Course("3","B语言");
		coursesToSelect.add(2,cr3);
		Course temp3 = (Course)coursesToSelect.get(2);
		System.out.println(temp3.name+" : "+temp3.id);
		*/
		Course[] course = {new Course("3","离散数学"),new Course("4","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course)coursesToSelect.get(3);
		Course temp4 = (Course)coursesToSelect.get(4);
		System.out.println(temp3.name+" : "+temp3.id+"\n"+temp4.name+" : "+temp4.id);

		Course[] course2 = {new Course("5","离散数学2"),new Course("6","汇编语言2")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course temp5 = (Course)coursesToSelect.get(2);
		Course temp6 = (Course)coursesToSelect.get(3);
		System.out.println(temp5.name+" : "+temp5.id+"\n"+temp6.name+" : "+temp6.id);

	


	}
	/**
	取得元素
	*/
	public void testGet(){
		int size = coursesToSelect.size();
		for(int i = 0 ; i< size;i++){
			Course cr = (Course)coursesToSelect.get(i);
			System.out.println("课程 "+cr.id+" : "+cr.name);

		}
	}
	/**
	通过迭代器遍历
	*/
	public void testIterator(){
		//通过集合的迭代器访问
		Iterator it = coursesToSelect.iterator();
		System.out.println("\n如下课程待选(通过迭代器遍历)");
		while(it.hasNext()){
			Course cr = (Course)it.next();
			System.out.println("课程 ： "+cr.id+" : "+cr.name);
		}
	}
	/**
		通过foreach()
	*/
	public void testForeach(){
		System.out.println("\n如下课程待选(通过Foreach遍历)");
		for(Object obj:coursesToSelect){
			Course cr = (Course)obj;
			System.out.println("课程 ： "+cr.id+" : "+cr.name);
		}
	}
	/**
	修改元素
	*/
	public void testModify(){
		coursesToSelect.set(4,new Course("7","毛概"));
	}
	/**
	删除元素
	*/
	public void testRemove(int num){
		//Course cr = (Course)coursesToSelect.get(num);
		System.out.println("\n待删除课程 ：5和6 ");
		Course[] courses = {(Course)coursesToSelect.get(5),(Course)coursesToSelect.get(6)};
		coursesToSelect.removeAll(Arrays.asList(courses));
		//coursesToSelect.remove(cr);
		System.out.println("删除成功");
		testForeach();

	}

/**
添加奇怪的东西
*/

	public void testType(){
		System.out.println("\n添加奇怪的东西");
		coursesToSelect.add("我不是课程");
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
