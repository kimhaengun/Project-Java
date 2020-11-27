package ch05;

//�������̽��� new�� �� ����. because �߻� �޼��带 ������ ������
//�ݵ�� ���� �Լ��� ����ϰ� ����. /Ÿ�� ��ġ(������)

//�������̽� ����-����� ����� ��
//ex)�ڵ��� ���� 
interface Animal2{
	void sound(); //�߻�޼��� (�Լ��� ��ü�� ����.�������.)
}
class Dog2 implements Animal2{
	//implements = ����
	//�������̵� (��ȿȭ �ϴ�.->�θ��� �Լ��� ��ȿȭ) ������ �ƴ� ����
	public void sound() {
		System.out.println("�۸�");
	} 
	
}
class Cat2 implements Animal2{
	//�������̵� (��ȿȭ �ϴ�.->�θ��� �Լ��� ��ȿȭ)
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("�Ŀ�");
	}
}
class Bird2 implements Animal2{
	//�������̵� (��ȿȭ �ϴ�.->�θ��� �Լ��� ��ȿȭ)
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("±±");
	}
}
class Tiger2 implements Animal2{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}
	
}
class Monkey implements Animal2{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
	System.out.println("����");	
	}
	
}
//Monkey Ŭ������ ����� ���� ����ϰ�
//�ݵ�� Animal2�� �����ϼ���.
public class Inherit04 {
	
	static void start(Animal2 a) {
		a.sound();
	}
	//�ڱ� �ڽ��� Ŭ������ static�� ȣ���� ���� Ŭ������ �������� ��48.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start(new Dog2());
		start(new Cat2());
		start(new Bird2());
		start(new Tiger2());
		start((new Monkey()));
	}

}
