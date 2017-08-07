import java.util.*;
import java.util.Map.Entry;

public class MapTest {
/**
 * 学生类
 */
	public Map<String,Student> students;
	/**
	 * 初始化students属性
	 */
	public MapTest(){
		this.students = new HashMap<String,Student>();
	}
	/**
	 * 测试添加：输入学生ID,判断是否被占用
	 */
	public void testPut(){
		Scanner console = new Scanner(System.in);
		int i = 0;
		while(i < 3){
			System.out.println("请输入学生ID：");
			String ID = console.next();
			//判断是否被占用
			Student st = students.get(ID);
			if(st == null){
				System.out.println("请输入学生姓名： ");
				String name = console.next();
				Student newStudent = new Student(ID,name);
				students.put(ID, newStudent);
				System.out.println("成功添加学生："+students.get(ID).name);
				i++;
			}else{
				System.out.println("该学生ID已被占用！");
				continue;
			}
		}		
	}
	/**
	 * 测试Map的keyset
	 */
	public void testKeySet(){
		//通过keySet,返回所有的建
		Set<String> keySet = students.keySet();
		//遍历keySet取得value
		System.out.println("总共有："+students.size()+" 个学生！");
		for(String stuId:keySet){
			Student st = students.get(stuId);
			if(st !=null){
				System.out.println("学生："+st.name);
			}
		}
	}
	/**
	 * 测试删除映射
	 * @param args
	 */
	public void testRemvoe(){
		Scanner console = new Scanner(System.in);
		while(true){
		//提示输入待删除学生的ID
		System.out.println("请输入待删除学生的ID");
		//获取ID
		String ID = console.next();
		Student st = students.get(ID);
		if(st == null){
			System.out.println("该ID不存在！");
			continue;
		}
		students.remove(ID);
		System.out.println("成功删除学生："+st.name);
		break;
	}
}
	/**
	 * 通过entrySet来便利Map
	 * @param args
	 */
	public void testEntrySet(){
		Set<Entry<String,Student>> entrySet = students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("取得键："+entry.getKey());
			System.out.println("对应的值为"+entry.getValue().name);
		}
	}
	/**
	 * 利用put方法修改map中已有的映射
	 * @param args
	 */
	public void testModify(){
		//提示要修改的学生ID
		System.out.println("要修改的学生ID:");
		Scanner console = new Scanner(System.in);
		while(true){
			String stuID = console.next();
			Student student = students.get(stuID);
			if(student==null){
				System.out.println("该ID不存在，请重新输入：");
				continue;
			}
			//提示当前对应学生
			System.out.println("当前该学生ID对应的学生为："+student.name);
			System.out.println("请输入新的学生姓名：");
			String name = console.next();
			Student newStudent = new Student(stuID,name);
			students.put(stuID, newStudent);
			System.out.println("修改成功！");
			break;
		}
	}
	/**
	 * 在map 中是否包含某个KEY值或VALUE值
	 * @param args
	 */
	
	public void testContainsKeyOrValue(){
		//提示用户输入学生ID
		System.out.println("输入学生ID:");
		Scanner console = new Scanner(System.in);
		String id = console.next(); 
		System.out.println("您输入的学生ID为："+id+" ， 在学生映射表中是否存在："+
		students.containsKey(id));
		if(students.containsKey(id)){
			System.out.println("对应的学生为："+students.get(id).name);
		}
		System.out.println("输入需要查询的学生姓名：");
		String name = console.next();
		if(students.containsValue(new Student(null,name))){
			System.out.println("在学生映射表中包含学生："+name);
		}else{
			System.out.println("在学生映射表中不包含该学生");
		}			
	}
		public static void main(String[] args){
			MapTest mt = new MapTest();
			mt.testPut();
			mt.testKeySet();
			//mt.testRemvoe();
			//mt.testEntrySet();
//			//mt.testKeySet();
//			mt.testModify();
//			mt.testEntrySet();
			mt.testContainsKeyOrValue();
		}
	
}
