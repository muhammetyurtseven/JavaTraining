int hops = 0;
int jumps = 0;
jumps = hops++;
if(jumps)//if(jumps)  karþýlýðý if(0) olarak deðerlendirilir. 0 bir boolean deðer olmadýðý için derlenmez. Gelen jumps deðeride alakasýzdýr.
System.out.print("Jump!");
else System.out.print("Hop!");