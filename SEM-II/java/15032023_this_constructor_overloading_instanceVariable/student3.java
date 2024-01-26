// creating class and method by its object using new operator
// method ( with return value, with no argument)
class CalculateAvg{
    String name;
    double total_marks;
    int sub;

    double Average() {
        System.out.println(name + " " + total_marks + " " + sub);
        double avg = total_marks/sub;
        return avg;
    }
}
class student3{
    public static void main(String[] args) {
        CalculateAvg kalidas = new CalculateAvg();
        kalidas.name = "kalidas mehta";
        kalidas.total_marks = 500;
        kalidas.sub = 5;
        System.out.println("Average : "+ kalidas.Average());

        CalculateAvg harshad = new CalculateAvg();
        harshad.name = "harshad mehta";
        harshad.total_marks = 500;
        harshad.sub = 6;
        double avg = harshad.Average();
        System.out.println("Average : "+ avg);
    }    
}