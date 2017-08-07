import java.util.*;
import java.util.Map.Entry;

public class MapTest {
/**
 * ѧ����
 */
	public Map<String,Student> students;
	/**
	 * ��ʼ��students����
	 */
	public MapTest(){
		this.students = new HashMap<String,Student>();
	}
	/**
	 * ������ӣ�����ѧ��ID,�ж��Ƿ�ռ��
	 */
	public void testPut(){
		Scanner console = new Scanner(System.in);
		int i = 0;
		while(i < 3){
			System.out.println("������ѧ��ID��");
			String ID = console.next();
			//�ж��Ƿ�ռ��
			Student st = students.get(ID);
			if(st == null){
				System.out.println("������ѧ�������� ");
				String name = console.next();
				Student newStudent = new Student(ID,name);
				students.put(ID, newStudent);
				System.out.println("�ɹ����ѧ����"+students.get(ID).name);
				i++;
			}else{
				System.out.println("��ѧ��ID�ѱ�ռ�ã�");
				continue;
			}
		}		
	}
	/**
	 * ����Map��keyset
	 */
	public void testKeySet(){
		//ͨ��keySet,�������еĽ�
		Set<String> keySet = students.keySet();
		//����keySetȡ��value
		System.out.println("�ܹ��У�"+students.size()+" ��ѧ����");
		for(String stuId:keySet){
			Student st = students.get(stuId);
			if(st !=null){
				System.out.println("ѧ����"+st.name);
			}
		}
	}
	/**
	 * ����ɾ��ӳ��
	 * @param args
	 */
	public void testRemvoe(){
		Scanner console = new Scanner(System.in);
		while(true){
		//��ʾ�����ɾ��ѧ����ID
		System.out.println("�������ɾ��ѧ����ID");
		//��ȡID
		String ID = console.next();
		Student st = students.get(ID);
		if(st == null){
			System.out.println("��ID�����ڣ�");
			continue;
		}
		students.remove(ID);
		System.out.println("�ɹ�ɾ��ѧ����"+st.name);
		break;
	}
}
	/**
	 * ͨ��entrySet������Map
	 * @param args
	 */
	public void testEntrySet(){
		Set<Entry<String,Student>> entrySet = students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("ȡ�ü���"+entry.getKey());
			System.out.println("��Ӧ��ֵΪ"+entry.getValue().name);
		}
	}
	/**
	 * ����put�����޸�map�����е�ӳ��
	 * @param args
	 */
	public void testModify(){
		//��ʾҪ�޸ĵ�ѧ��ID
		System.out.println("Ҫ�޸ĵ�ѧ��ID:");
		Scanner console = new Scanner(System.in);
		while(true){
			String stuID = console.next();
			Student student = students.get(stuID);
			if(student==null){
				System.out.println("��ID�����ڣ����������룺");
				continue;
			}
			//��ʾ��ǰ��Ӧѧ��
			System.out.println("��ǰ��ѧ��ID��Ӧ��ѧ��Ϊ��"+student.name);
			System.out.println("�������µ�ѧ��������");
			String name = console.next();
			Student newStudent = new Student(stuID,name);
			students.put(stuID, newStudent);
			System.out.println("�޸ĳɹ���");
			break;
		}
	}
	/**
	 * ��map ���Ƿ����ĳ��KEYֵ��VALUEֵ
	 * @param args
	 */
	
	public void testContainsKeyOrValue(){
		//��ʾ�û�����ѧ��ID
		System.out.println("����ѧ��ID:");
		Scanner console = new Scanner(System.in);
		String id = console.next(); 
		System.out.println("�������ѧ��IDΪ��"+id+" �� ��ѧ��ӳ������Ƿ���ڣ�"+
		students.containsKey(id));
		if(students.containsKey(id)){
			System.out.println("��Ӧ��ѧ��Ϊ��"+students.get(id).name);
		}
		System.out.println("������Ҫ��ѯ��ѧ��������");
		String name = console.next();
		if(students.containsValue(new Student(null,name))){
			System.out.println("��ѧ��ӳ����а���ѧ����"+name);
		}else{
			System.out.println("��ѧ��ӳ����в�������ѧ��");
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
