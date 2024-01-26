// creating class and method by its object using new operator
// method ( with return value, with no argument)
class CalculateAvg{
    String name;
    double total_marks;
    int sub;

    CalculateAvg(){     // this is default constructer
        this.name = "hello";
        this.total_marks = 500;
        this.sub = 7;
    }
    CalculateAvg(String name, double total_marks, int sub){  // parameterized constructer
        this.name = name;
        this.total_marks = total_marks;
        this.sub = sub;
    }

    double Average() {
        System.out.println(name + " " + total_marks + " " + sub);
        double avg = total_marks/sub;
        return avg;
    }
}
class student4{
    public static void main(String[] args) {
        CalculateAvg kalidas = new CalculateAvg();      // constructor is called when object is created
        System.out.println(kalidas.name + " " + kalidas.total_marks + " " + kalidas.sub);
        double avg = kalidas.total_marks/kalidas.sub;
        System.out.println("Average : "+ avg);


        kalidas.name = "kalidas mehta";
        kalidas.total_marks = 500;
        kalidas.sub = 5;
        System.out.println("Average : "+ kalidas.Average());

        CalculateAvg harshad = new CalculateAvg();
        harshad.name = "harshad mehta";
        harshad.total_marks = 500;
        harshad.sub = 6;
        avg = harshad.Average();
        System.out.println("Average : "+ avg);

        CalculateAvg rahul = new CalculateAvg("rahul aurora", 700, 9);  // parameterized constructer
        System.out.println(rahul.name + " " + rahul.total_marks + " " + rahul.sub);
        avg = rahul.total_marks/rahul.sub;
        System.out.println("Average : "+ avg);

    }    
}