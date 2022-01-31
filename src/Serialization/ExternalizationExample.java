package Serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizationExample implements Externalizable{

	String s;
	int i;
	int j;
	
	public ExternalizationExample(){
	
		System.out.println("call ExternalizationExample default constructors");
	}
	
	ExternalizationExample(String s,int i,int j){
		this.s = s;
		this.i = i;
		this.j = j;
	}
	
	@Override
	public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		s = (String) oi.readObject();
		i = oi.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput oo) throws IOException {
		// TODO Auto-generated method stub
		
		oo.writeObject(s);
		oo.writeInt(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
