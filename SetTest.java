import java.util.*;
public class SetTest 
{
	public List<Course> coursesToSelect;
	
	private Scanner console;
	
	public Student student;
	public SetTest(){
		coursesToSelect = new ArrayList<Course>();
		console = new Scanner(System.in);
	}

		public void testAdd()
	{
		/**
			用于添加项目
		*/
		Course cr1 = new Course("1","数据结构");
		coursesToSelect.add(cr1);
		Course temp = (Course)coursesToSelect.get(0);
		//System.out.println(temp.name+" : "+temp.id);

		Course cr2 = new Course("2","C语言");
		coursesToSelect.add(cr2);
		Course temp2 = (Course)coursesToSelect.get(0);
		//System.out.println(temp2.name+" : "+temp2.id);
		
		//coursesToSelect.add(cr1);
		//Course temp0 = (Course)coursesToSelect.get(2);
		//System.out.println(temp0.name+" : "+temp0.id);
		
		Course cr3 = new Course("3","B语言");
		coursesToSelect.add(cr3);
		//Course temp3 = (Course)coursesToSelect.get(2);
		//System.out.println(temp3.name+" : "+temp3.id);
		
		Course[] course = {new Course("4","离散数学"),new Course("5","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		//Course temp3 = (Course)coursesToSelect.get(3);
		//Course temp4 = (Course)coursesToSelect.get(4);
		//System.out.println(temp3.name+" : "+temp3.id+"\n"+temp4.name+" : "+temp4.id);
		
		Course[] course2 = {new Course("6","离散数学2"),new Course("7","汇编语言2")};
		coursesToSelect.addAll(Arrays.asList(course2));
		//Course temp5 = (Course)coursesToSelect.get(2);
		//Course temp6 = (Course)coursesToSelect.get(3);
		//System.out.println(temp5.name+" : "+temp5.id+"\n"+temp6.name+" : "+temp6.id);

	}


	public void testForeach(){
		System.out.println("\n如下课程待选");
		for(Object obj:coursesToSelect){
			Course cr = (Course)obj;
			System.out.println("课程 ： "+cr.id+" : "+cr.name);
		}
	}

	/**
	 * 创建学生对象并选课
	 * @param args
	 */
	
	public void testListContains(){
		Course course = coursesToSelect.get(0);
		//打印输出是否包含对象
		System.out.println("取得备选课程："+course.name);
		System.out.println("备选课程是否包含课程："+course.name+" , "+
		coursesToSelect.contains(course));
		//提示出入课程名称
		System.out.println("请输入课程名称：");
		String name = console.next();
		Course course2 = new Course();
		course2.name = name;
		System.out.println("新创建课程："+course2.name);
		System.out.println("取得备选课程："+course2.name);
		System.out.println("备选课程是否包含课程："+course2.name+" , "+
				coursesToSelect.contains(course2));
	//通过indexOf的方法来获取索引位置
		if(coursesToSelect.contains(course2)){
			System.out.println("课程："+course2.name+" 的位置是 "+coursesToSelect.indexOf(course2));
		}
	}
	


	/**
	 * 
	 * 创建学生对象并选课
	 * @param student
	 */
	public void createStudentAndSelect()
	{
		student = new Student("1","小明");
		System.out.println("\n欢迎学生 ： "+student.name+" 选课！");
		Scanner console = new Scanner(System.in);
		for(int i = 0;i<3;i++){
			System.out.println("请输入课程ID：");
			String courseid = console.next();
			for(Course cr:coursesToSelect){
				if(cr.id.equals(courseid)){
					student.courses.add(cr);
					//student.courses.add(cr);
				}
			}
		}
	}
	/**
	 * set的contain方法
	 * @param student
	 */
	public void testSetContains(){
		//提示输入课程名称
		System.out.println("输入课程名称:");
		String name = console.next();
		Course course2 = new Course();
		course2.name = name;
		System.out.println("新创建课程："+course2.name);
		System.out.println("取得备选课程："+course2.name);
		System.out.println("备选课程是否包含课程："+course2.name+" , "+
				student.courses.contains(course2));

	}
	
	public void testForEachForSet(Student student){
	
		System.out.println("共选择了："+student.courses.size()+" 门课程");
		for(Course cr:student.courses){
			System.out.println("选择了课程： "+cr.id+" : "+cr.name);
		}
	}

public static void main(String[] args) 
{
	SetTest st = new SetTest();
	st.testAdd();
	st.testListContains();
	st.testForeach();
//	st.createStudentAndSelect();
//	st.testSetContains();
  }
}