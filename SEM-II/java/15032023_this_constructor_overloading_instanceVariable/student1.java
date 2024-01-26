class CalculateAvg{
    String name;            //instence variable
    double total_marks;     //instence variable
    int sub;                //instence variable
}
class student1{
    public static void main(String[] args) {
        CalculateAvg kalidas = new CalculateAvg();
        kalidas.name = "kalidas mehta";
        kalidas.total_marks = 500;
        kalidas.sub = 5;
        System.out.println(kalidas.name + " " + kalidas.total_marks + " " + kalidas.sub);
        double avg = kalidas.total_marks/kalidas.sub;
        System.out.println("Average : "+ avg);

        CalculateAvg harshad = new CalculateAvg();
        harshad.name = "harshad mehta";
        harshad.total_marks = 500;
        harshad.sub = 6;
        System.out.println(harshad.name + " " + harshad.total_marks + " " + harshad.sub);
        avg = harshad.total_marks/harshad.sub;
        System.out.println("Average : "+ avg);        
    }    
}