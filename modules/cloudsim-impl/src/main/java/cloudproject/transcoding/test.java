package cloudproject.transcoding;

import java.util.Random;

public class test {

	public static void main(String[] args) {
		Random random = new Random();
		double cmp = random.nextDouble();
		System.out.println(cmp);
		boolean drop;
		if(0.2 < cmp){
			drop = true;
		}else{
			drop = false;
		}
		System.out.println(drop);
	}

}
