// creating class and method by its object using new operator
// method ( with no return value, with no argument)
class CalculateAvg{
    String name;
    double total_marks;
    int sub;

    void Average() {
        System.out.println(name + " " + total_marks + " " + sub);
        double avg = total_marks/sub;
        System.out.println("Average : "+ avg);
    }
}
class student2{
    public static void main(String[] args) {
        CalculateAvg kalidas = new CalculateAvg();
        kalidas.name = "kalidas mehta";
        kalidas.total_marks = 500;
        kalidas.sub = 5;
        kalidas.Average();

        CalculateAvg harshad = new CalculateAvg();
        harshad.name = "harshad mehta";
        harshad.total_marks = 500;
        harshad.sub = 6;
        harshad.Average();
    }    
}