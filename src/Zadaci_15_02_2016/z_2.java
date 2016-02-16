package Zadaci_15_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (OutOfMemoryError) Write a program that causes the JVM to throw an
 * OutOfMemoryError and catches and handles this error.
 */
public class z_2 {

	public static void main(String[] args) {
	
		try{
			int[] niz = new int[100];
			while(true){
			for (int i = 0; i < niz.length;i++){
				niz[i] = (int)(Math.random()*100);
			}
			}
			}catch (OutOfMemoryError ex){
				System.out.println("out of memory!");
			}
		}

	}


