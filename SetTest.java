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
			���������Ŀ
		*/
		Course cr1 = new Course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp = (Course)coursesToSelect.get(0);
		//System.out.println(temp.name+" : "+temp.id);

		Course cr2 = new Course("2","C����");
		coursesToSelect.add(cr2);
		Course temp2 = (Course)coursesToSelect.get(0);
		//System.out.println(temp2.name+" : "+temp2.id);
		
		//coursesToSelect.add(cr1);
		//Course temp0 = (Course)coursesToSelect.get(2);
		//System.out.println(temp0.name+" : "+temp0.id);
		
		Course cr3 = new Course("3","B����");
		coursesToSelect.add(cr3);
		//Course temp3 = (Course)coursesToSelect.get(2);
		//System.out.println(temp3.name+" : "+temp3.id);
		
		Course[] course = {new Course("4","��ɢ��ѧ"),new Course("5","�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		//Course temp3 = (Course)coursesToSelect.get(3);
		//Course temp4 = (Course)coursesToSelect.get(4);
		//System.out.println(temp3.name+" : "+temp3.id+"\n"+temp4.name+" : "+temp4.id);
		
		Course[] course2 = {new Course("6","��ɢ��ѧ2"),new Course("7","�������2")};
		coursesToSelect.addAll(Arrays.asList(course2));
		//Course temp5 = (Course)coursesToSelect.get(2);
		//Course temp6 = (Course)coursesToSelect.get(3);
		//System.out.println(temp5.name+" : "+temp5.id+"\n"+temp6.name+" : "+temp6.id);

	}


	public void testForeach(){
		System.out.println("\n���¿γ̴�ѡ");
		for(Object obj:coursesToSelect){
			Course cr = (Course)obj;
			System.out.println("�γ� �� "+cr.id+" : "+cr.name);
		}
	}

	/**
	 * ����ѧ������ѡ��
	 * @param args
	 */
	
	public void testListContains(){
		Course course = coursesToSelect.get(0);
		//��ӡ����Ƿ��������
		System.out.println("ȡ�ñ�ѡ�γ̣�"+course.name);
		System.out.println("��ѡ�γ��Ƿ�����γ̣�"+course.name+" , "+
		coursesToSelect.contains(course));
		//��ʾ����γ�����
		System.out.println("������γ����ƣ�");
		String name = console.next();
		Course course2 = new Course();
		course2.name = name;
		System.out.println("�´����γ̣�"+course2.name);
		System.out.println("ȡ�ñ�ѡ�γ̣�"+course2.name);
		System.out.println("��ѡ�γ��Ƿ�����γ̣�"+course2.name+" , "+
				coursesToSelect.contains(course2));
	//ͨ��indexOf�ķ�������ȡ����λ��
		if(coursesToSelect.contains(course2)){
			System.out.println("�γ̣�"+course2.name+" ��λ���� "+coursesToSelect.indexOf(course2));
		}
	}
	


	/**
	 * 
	 * ����ѧ������ѡ��
	 * @param student
	 */
	public void createStudentAndSelect()
	{
		student = new Student("1","С��");
		System.out.println("\n��ӭѧ�� �� "+student.name+" ѡ�Σ�");
		Scanner console = new Scanner(System.in);
		for(int i = 0;i<3;i++){
			System.out.println("������γ�ID��");
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
	 * set��contain����
	 * @param student
	 */
	public void testSetContains(){
		//��ʾ����γ�����
		System.out.println("����γ�����:");
		String name = console.next();
		Course course2 = new Course();
		course2.name = name;
		System.out.println("�´����γ̣�"+course2.name);
		System.out.println("ȡ�ñ�ѡ�γ̣�"+course2.name);
		System.out.println("��ѡ�γ��Ƿ�����γ̣�"+course2.name+" , "+
				student.courses.contains(course2));

	}
	
	public void testForEachForSet(Student student){
	
		System.out.println("��ѡ���ˣ�"+student.courses.size()+" �ſγ�");
		for(Course cr:student.courses){
			System.out.println("ѡ���˿γ̣� "+cr.id+" : "+cr.name);
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