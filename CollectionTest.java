import java.util.*;
public class CollectionTest {
	/**
	 * ��Integer����
	 * @param args
	 */
	public void testSort1(){
		List<Integer> integerList = new ArrayList<Integer>();
		//����ʮ��100���ڵ������
		Random random = new Random();
		Integer k;
		for(int i = 0 ; i< 10 ; i++)
		{
			do{
			k = random.nextInt(100);
			}while(integerList.contains(k));
			integerList.add(k);
			System.out.println("�ɹ����������"+k);
		}
		System.out.println("__________����ǰ_________");
		for(Integer integer: integerList)
		{
			System.out.println("Ԫ�أ�"+integer);
		}
		Collections.sort(integerList);
		System.out.println("__________�����_________");
		for(Integer integer: integerList)
		{
			System.out.println("Ԫ�أ�"+integer);
		}
	}
	/**
	 * ��String��������
	 * @param args
	 */
	public void testSort2(){
		List<String> stringList = new ArrayList<String>();
		stringList.add("microsoft");
		stringList.add("google");
		stringList.add("lenvo");
		System.out.println("__________����ǰ_________");
		for(String string: stringList)
		{
			System.out.println("Ԫ�أ�"+string);
		}
		Collections.sort(stringList);
		System.out.println("__________�����_________");
		for(String string: stringList)
		{
			System.out.println("Ԫ�أ�"+string);
		}
	}
	/**
	 * Student��˳��
	 * @param args
	 */
	public void testSort3(){
		List<Student> studentList = new ArrayList<Student>();
		Random random = new Random();
		studentList.add(new Student(random.nextInt(1000)+"","Mike"));
		studentList.add(new Student(random.nextInt(1000)+"","Angela"));
		studentList.add(new Student(random.nextInt(1000)+"","Lucy"));
		studentList.add(new Student(10000+"","Beyonce"));
		System.out.println("__________����ǰ_________");
		for(Student student: studentList)
		{
			System.out.println("ѧ����"+student.id+":"+student.name);
		}
		Collections.sort(studentList);
		System.out.println("__________�����_________");
		for(Student student: studentList)
		{
			System.out.println("ѧ����"+student.id+":"+student.name);
		}
		Collections.sort(studentList,new StudentComparator());
		System.out.println("-------�������������------");
		for(Student student: studentList)
		{
			System.out.println("ѧ����"+student.id+":"+student.name);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionTest ct = new CollectionTest();
		//ct.testSort1();
		//ct.testSort2();
		ct.testSort3();
	}

}
