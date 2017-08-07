/**
�γ���
*/
public class  Course
{
public String id;

public String name;

public Course(){}

public Course(String id,String name)
	{
		this.name = name;
		this.id = id;
	}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (!(obj instanceof Course))
		return false;
	Course other = (Course) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
}
