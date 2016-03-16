package antypierwsze;
public class Antypierwsze {
 
        public static int IloscDzielnikow(double n)
        {
                int s=1;
                int d=1;
                int i=2;
 
                do{
                        if(n%i==0)
                        {
                                n/=i;
                                d++;
                        }
                        else
                        {
                                s*=d;
                                i++;
                                d=1;
                        }
                }while((n!=1)||(d!=1));
 
                return s;
        }
 
        public static long NWD(long a,long b)
        {
                do{
                        if(a>b)
                        {
                                a-=b;
                        }
                        else
                                b-=a;
                }while(a!=b);
 
                return a;
        }
  
        public static void AntyP(long n)
        {
                long max=1;
                long i=2;
                long a=1;
                long b=1;
                long c=1;
                long d =1;
                long e=1;
                long t = 1;
                do
                {
                        if(IloscDzielnikow(i)>max)
                        {
                                System.out.println(i + " o "+ IloscDzielnikow(i)+" dzielnikach,");
                                max=IloscDzielnikow(i);
                                if(t%4==1)
                                {
                                        b=i;
                                        t++;
                                }
                                else if(t%4==2)
                                {
                                        c=i;
                                        t++;
                                }
                                else if(t%4==3)
                                {
                                        t++;
                                        d=i;
 
                                }
                                else if(t%4==0)
                                {
                                        t++;
                                        e=i;
                                        
                                }
                                if(t>3)
                                {
                                	long key = NWD(b,c);
                                    long yek = NWD(key,d);
                                    a=NWD(i,yek);
                                    System.out.println("NWD(b,c,d,e)=("+b+","+c+","+d+","+e+")="+a);
                                }
                                i+=a;
                                
                                System.out.println("i="+i+", t="+t);
 
 
 
                        }
                        else
                                i+=a;
 
                        System.out.println("i="+i+", t="+t);
                	}while(n>i);
                System.out.println("n="+n+", i="+i);
                
                
        }
 
 
        public static void main(String[] args) {
                long n=9223372036854775807l;
                AntyP(n);
 
        }
 
}