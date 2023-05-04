public class Tester{
  public static void main(String[]args){
    MyString a = new MyString( );
    char[]hello={'a','c','d','e'};
    MyString b = new MyString(hello); 
    MyString c = new MyString("catalonia");
    MyString d = new MyString("ca");
    System.out.println(b.length());
    System.out.println(c.charAt(1));
    System.out.println(b.startsWith(c));
    System.out.println(c.startsWith(d));
    System.out.println(b.startsWith("aced"));
    System.out.println(c.endsWith(d));
    System.out.println(c.endsWith(c));
    System.out.println(b.endsWith("de"));
    MyString e=c.replaceFirst('a','s');
    System.out.println(e.startsWith("catalonia"));
    System.out.println(e.startsWith("cstalonia"));
    System.out.println(e.endsWith("cstalonia"));
    MyString f=c.replaceAll('a','s');
    System.out.println(f.startsWith("catalonia"));
    System.out.println(f.startsWith("cstslonis"));
    System.out.println(f.endsWith("cstslonis"));
     MyString g = new MyString("CaTCh");
    MyString h=g.toLowerCase();
    System.out.println(h.startsWith("CaTCh"));
    System.out.println(h.startsWith("catch"));
    System.out.println(h.endsWith("catch"));
    h.toUpperCase();
    System.out.println(h.startsWith("CaTCh"));
    System.out.println(h.startsWith("CATCH"));
    System.out.println(h.endsWith("CATCH"));
    g.toUpperCase();
    System.out.println(h.equals(g));
    g=new MyString("ball");
    System.out.println(h.equals(g));
    MyString i=new MyString ("BaLl");
    System.out.println(i.equalsIgnoreCase(g));
    i.show();
    g.show();
    System.out.println(i.compareTo(g));
    System.out.println(i.compareToIgnoreCase(g));
    System.out.println("*************************************");
    i=new MyString ("BaLll");
    System.out.println(i.compareTo(g));
    System.out.println(i.compareToIgnoreCase(g));
    System.out.println("*************************************");
    i=new MyString ("ball");
    System.out.println(i.compareTo(g));
    System.out.println(i.compareToIgnoreCase(g));
    System.out.println("*************************************");
    i=new MyString ("ban");
    System.out.println(i.compareTo(g));
    System.out.println(i.compareToIgnoreCase(g));
    System.out.println("*************************************");
    System.out.println(i.compareTo("ban"));
    System.out.println(i.compareTo("bang"));
    System.out.println(i.compareTo("Ban"));
    System.out.println("*************************************");
    System.out.println(i.compareToIgnoreCase("aan"));
    System.out.println(i.compareToIgnoreCase("bang"));
    System.out.println(i.compareToIgnoreCase("Ban"));
    System.out.println("*************************************");
    g=i.substring(1);
    g.show();
    System.out.println("*************************************");
    g=i.substring(1,1);
    g.show();
    i=new MyString("it's show time");
    System.out.println("*************************************");
    System.out.println(i.lastIndexOf('s'));
    System.out.println(i.indexOf('s'));
    System.out.println("*************************************");
    System.out.println(i.lastIndexOf('s',5));
    System.out.println(i.indexOf('s',6));
    System.out.println("*************************************");
    System.out.println(g.indexOf(i));
    g=new MyString("sh");
    System.out.println(i.indexOf(g));
    g=new MyString("sl");
    System.out.println(i.indexOf(g));
    g=new MyString("za");
    System.out.println(i.indexOf(g));
    System.out.println("*************************************");
    i=new MyString("it's show time. now show");
    g=new MyString("za");
    System.out.println(i.lastIndexOf(g));
    g=new MyString("sh");
    System.out.println(i.lastIndexOf(g));
    g=new MyString("show");
    System.out.println(i.lastIndexOf(g));
    System.out.println("*************************************");
    System.out.println(i.indexOf("show"));
    System.out.println(i.indexOf("sl"));
    System.out.println("*************************************");
    System.out.println(i.lastIndexOf("show"));
    g=i.concat(g);
    g.show();
    System.out.println("*************************************");
    g=i.concat(hello);
    g.show();
    System.out.println("*************************************");
    g=i.concat(" why so serious???");
    g.show();
  }
}