public class Grades {
    private int[] grades;
    private int size;

    public Grades(){
        this.grades = new int[10];
        this.size=0;
    }

    public void add(int value){
        if (this.size ==10){
            return;
        }
        this.grades[this.size]=value;
        this.size++;
    }

    public void getLastGrade (){
        int lastAddedGrade = this.grades[grades.length-1];
        System.out.println("Last added grade is: " +lastAddedGrade);
    }

    public void countAndDisplayAverageGrade(){
        double averageGrade;
        double result = 0;

        for (int i=0; i<grades.length; i++){
            result = result+grades[i];
        }
        averageGrade = result/grades.length;
        System.out.println("Your average grade is: " + averageGrade);
    }

}
