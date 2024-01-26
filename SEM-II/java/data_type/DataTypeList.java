class DataType {

  public static void main(String[] s) {
    var b1 = true;
    var b2 = false;
    var str = "hello";
    var c = 'A';
    var num = 123;
    var f = 3.14f;
    var d = 3.14;

    System.out.println(((Object) b1).getClass().getSimpleName()); //boolean
    System.out.println(((Object) b2).getClass().getSimpleName()); //boolean
    System.out.println(((Object) str).getClass().getSimpleName()); //string
    System.out.println(((Object) c).getClass().getSimpleName()); //character
    System.out.println(((Object) num).getClass().getSimpleName()); //integer
    System.out.println(((Object) f).getClass().getSimpleName()); //float
    System.out.println(((Object) d).getClass().getSimpleName()); //double
  }
}
