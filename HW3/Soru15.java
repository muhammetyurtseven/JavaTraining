int hops = 0;
int jumps = 0;
jumps = hops++;
if(jumps)//if(jumps)  kar��l��� if(0) olarak de�erlendirilir. 0 bir boolean de�er olmad��� i�in derlenmez. Gelen jumps de�eride alakas�zd�r.
System.out.print("Jump!");
else System.out.print("Hop!");