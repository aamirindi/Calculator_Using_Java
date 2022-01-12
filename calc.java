import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;


/* 
<applet code="calc" width=200 height=200>
</applet>
*/



public class calc extends Frame implements ActionListener
{
String msg= " ";
String ts=" ";
String n1,n2;
char op;
double a,b,c,prev,memory;
Button one,two,three,four,five,six,seven,eight,nine,ten,zero,dot,off;
Button backspace,clear,eq,plus,minus,mul,div,pm,sqrt,obx,sqr,sin,cos,tan;
Button mc,mr,ms,mplus,mstatus;
Panel p1=new Panel();
Panel p2=new Panel();
Panel p3=new Panel();
Panel p4=new Panel();

TextField display;

public calc()
{
setTitle("Calculator");
setLayout(new BorderLayout());
display=new TextField(30);
one=new Button("1");
two=new Button("2");
three=new Button("3");
four=new Button("4");
five=new Button("5");
six=new Button("6");
seven=new Button("7");
eight=new Button("8");
nine=new Button("9");
ten=new Button("10");
zero=new Button("0");
dot=new Button(".");
eq=new Button("=");
plus=new Button("+");
minus=new Button("-");
div=new Button(" / ");
mul=new Button("*");
sqrt=new Button("sqrt");
sin=new Button("sin");
cos=new Button("cos");
tan=new Button("tan");
clear=new Button("C");
mc=new Button("MC");
mr=new Button("MR");
ms=new Button("MS");
mplus=new Button("M+");
mstatus=new Button();

backspace=new Button("B");
off=new Button("off");

p1.add(display);
add(p1,BorderLayout.NORTH);

p4.setLayout(new GridLayout(3,1,5,5));
p4.add(backspace);
p4.add(clear);
p4.add(off);
add(p4,BorderLayout.EAST);

p3.setLayout(new GridLayout(5,2,5,5));
p3.add(mstatus);
p3.add(mc);
p3.add(mr);
p3.add(ms);
p3.add(mplus);
add(p3,BorderLayout.WEST);

p2.setLayout(new GridLayout(5,4,5,5));

p2.add(seven);
p2.add(eight);
p2.add(nine);
p2.add(div);

p2.add(four);
p2.add(five);
p2.add(six);
p2.add(mul);

p2.add(one);
p2.add(two);
p2.add(three);
p2.add(minus);

p2.add(zero);
p2.add(dot);
p2.add(eq);
p2.add(plus);

p2.add(sin);
p2.add(cos);
p2.add(tan);
p2.add(sqrt);

add(p2,BorderLayout.CENTER);

display.setEditable(false);
p1.setBackground(Color.lightGray);
p2.setBackground(Color.lightGray);
p3.setBackground(Color.lightGray);
p4.setBackground(Color.lightGray);

display.addActionListener(this);
one.addActionListener(this);
two.addActionListener(this);
three.addActionListener(this);
four.addActionListener(this);
five.addActionListener(this);
six.addActionListener(this);
seven.addActionListener(this);
eight.addActionListener(this);
nine.addActionListener(this);
zero.addActionListener(this);
dot.addActionListener(this);
eq.addActionListener(this);
plus.addActionListener(this);
minus.addActionListener(this);
clear.addActionListener(this);
backspace.addActionListener(this);
div.addActionListener(this);
mul.addActionListener(this);
sqrt.addActionListener(this);
sin.addActionListener(this);
cos.addActionListener(this);
tan.addActionListener(this);
off.addActionListener(this);
mc.addActionListener(this);
mr.addActionListener(this);
ms.addActionListener(this);
mplus.addActionListener(this);

setVisible(true);
addWindowListener(new w());
setSize(300,300);
setResizable(false);
pack();
}

public void actionPerformed(ActionEvent ae)
{

String str=ae.getActionCommand();
	if(str.equals("1"))
	{
	ts=ts+"1";
	display.setText(ts);
	}
	else if (str.equals("2"))
	{
	ts=ts+"2";
	display.setText(ts);
	}
	else if (str.equals("3"))
	{
	ts=ts+"3";
	display.setText(ts);
	}
	else if (str.equals("4"))
	{
	ts=ts+"4";
	display.setText(ts);
	}
	else if (str.equals("5"))
	{
	ts=ts+"5";
	display.setText(ts);
	}
	else if (str.equals("6"))
	{
	ts=ts+"6";
	display.setText(ts);
	}
	else if (str.equals("7"))
	{
	ts=ts+"7";
	display.setText(ts);
	}
	else if (str.equals("8"))
	{
	ts=ts+"8";
	display.setText(ts);
	}
	else if (str.equals("9"))
	{
	ts=ts+"9";
	display.setText(ts);
	}
	else if (str.equals("0"))
	{
	ts=ts+"0";
	display.setText(ts);
	}
	else if (str.equals("."))
	{
	ts=ts+".";
	display.setText(ts);
	}

	else if (str.equals("+"))
	{
	n1=display.getText();
	ts=" ";
	a=Double.parseDouble(display.getText().trim());
	op='+';
	display.setText(ts);
	}

	else if (str.equals("-"))
	{
	n1=display.getText();
	ts=" ";
	display.setText(ts);
	a=Double.parseDouble(n1.trim());
	op='-';
	}

	else if (str.equals(" / "))
	{
	n1=display.getText();
	ts=" ";
	display.setText(ts);
	a=Double.parseDouble(n1.trim());
	op='/';
	}


	else if (str.equals("*"))
	{
	n1=display.getText();
	ts=" ";
	display.setText(ts);
	a=Double.parseDouble(n1.trim());
	op='*';
	}


	else if (str.equals("C"))
	{
	ts=" ";
	display.setText(ts);
	n1=" ";
	n2=" ";
	a=0;b=0;c=0;
	op='C';
	}

	else if (str.equals("B"))
	{
	msg=display.getText();
	ts=msg.substring(0,msg.length()-1);
	display.setText(ts);
	op='B';
	}

	else if (str.equals("sqrt"))
	{
	n1=display.getText();
	a=Double.parseDouble(n1.trim());
	a=Math.sqrt(a);
	ts=" "+a;
	display.setText(ts);
	//op='*';
	}


	else if (str.equals("sin"))
	{
	n1=display.getText();
	a=Double.parseDouble(n1.trim());
	a=Math.sin(a);
	ts=" "+a;
	display.setText(ts);
	//op='*';
	}

	else if (str.equals("cos"))
	{
	n1=display.getText();
	a=Double.parseDouble(n1.trim());
	a=Math.cos(a);
	ts=" "+a;
	display.setText(ts);
	//op='*';
	}


	else if (str.equals("tan"))
	{
	n1=display.getText();
	a=Double.parseDouble(n1.trim());
	a=Math.tan(a);
	ts=" "+a;
	display.setText(ts);
	//op='*';
	}


	else if (str.equals("MC"))
	{
	memory=0;
	mstatus.setLabel(" ");
	}


	else if (str.equals("MS"))
	{
	n1=display.getText();
	if(n1!=null)
	{	a=Double.parseDouble(n1.trim());
		memory=a;
		mstatus.setLabel("M");
	}
	}

	else if (str.equals("MR"))
	{
	ts=" "+memory;
	display.setText(ts);
	}

	else if (str.equals("M+"))
	{
	n1=display.getText();
	if(n1!=" ")
	{
	a=Double.parseDouble(n1.trim());
	memory=memory+a;
	}
	}

	else if (str.equals("tan"))
	{
	n1=display.getText();
	a=Double.parseDouble(n1.trim());
	a=Math.tan(a);
	ts=" "+a;
	display.setText(ts);
	//op='*';
	}

	else if (str.equals("off"))
	{
	setVisible(false);
	System.exit(0);
	}

	else if (str.equals("="))
	{
	String n3=" ";
	n2=display.getText();
	b=Double.parseDouble(n2.trim());

	switch(op)
	{
	case '+':c=a+b;break;
	case '-':c=a-b;break;
	case '/':c=a/b;break;
	case '*':c=a*b;break;
	default:c=b;
	}
    n3=n3+c;
	op='C';
	display.setText(n3);
}


}
public static void main(String args[])
{
calc c = new calc();
};

 class w extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{
setVisible(false);
System.exit(0);
}
}
}
