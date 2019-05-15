class TestArray{
	public static void main(String[] args){
int a[]={10,20,30,40,50};            //Initilization
for(int i=0;i<a.length;i++){         //length is the property
	System.out.print(a[i]+" ");  // Print is used to in horizontal display of data and +" " is used for blanks
}
System.out.println();            //is used to change the line for average
float sum=0, avg;
for(int i=0;i<a.length;i++)      //calculating the values
	sum+=a[i];
avg=sum/a.length;
System.out.println("Average="+ avg);
}
}