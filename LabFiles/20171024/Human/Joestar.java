public class Joestar {
public static void main (String args[]){
	Chinese chinese=new Chinese("王老二");
	chinese.sayHello();
	Japanese japanese =new Japanese("新垣結衣");
	japanese.sayHello();
	English english =new English ("Tom Cruise");
	english.sayHello();
}
}

class Chinese extends Human {

	public Chinese(String name) {
		super(name);
	}
	
	public void sayHello(){
		System.out.println("你好！我叫"+name+"，很高兴认识你。");
	}
}

class Japanese extends Human{
	Japanese (String name ){
		super(name);
	}
	
	public void sayHello(){
		System.out.println("初めまして、私は"+name+"と申します.");
	}
}

class English extends Human{
	English (String name){
		super(name);
	}
	
	public void sayHello(){
		System.out.println("Hello!I'm "+name+ " and nice to meet you.");
	}
}
