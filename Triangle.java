
 class Triangle
 {int feet ;int inch;
   Triangle()
   {feet=0;
   inch=0;
   }
   Triangle(int f,int i)
   {feet=f;
   inch=i;
   }
   void display()
   {System.out.print(feet+" ");
   System.out.println(inch);
   }
   Triangle addHeight(Triangle X,Triangle Y)
   {Triangle O= new Triangle();
   int t1,t2;
   t1=X.feet*12+X.inch;
   t2=Y.feet*12+Y.inch;
   O.feet=(t1+t2)/12;
   O.inch=(t1+t2)%12;
   return O;
   }
   
	public static void main(String[] args)
	{ System.out.println("Welcome to the programme to add 2 heights ");
	Triangle X=new Triangle(12,3);
	Triangle Y=new Triangle(4,11);
	Triangle O=new Triangle();
	O=O.addHeight(X,Y);
	X.display();
	Y.display();
	O.display();
	}

}
