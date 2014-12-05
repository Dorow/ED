
public class Vector {
	
	public static int min(int[] a){
		int x = a[0];
		for(int i=0;i<a.length;i++)
			if(x>a[i])
				x=a[i];
		return x;		
	}
	
	public static int indexOf(int[] a, int b){
		for(int i=0;i<a.length;i++)
			if(a[i]==b)
				return i;
		return -1;		
	}
	
	
	
	public static void main (String arg []){
		int[] v = new int []{7,8,9,10,11,};
		System.out.println("El numero menor es " + min(v));
		System.out.println("El numero buscado esta en la posicion " + indexOf(v,5));
	}
}
