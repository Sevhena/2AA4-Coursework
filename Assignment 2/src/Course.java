import java.util.ArrayList;

public class Course {

    class LectureTime {
        private int day;
        private int hour;

        public LectureTime(int day, int hour){
            this.day = day;
            this.hour = hour;
        }
    }

    private ArrayList<LectureTime> lectures;
    private String courseCode;

    public Course(String courseCode){
        lectures = new ArrayList<LectureTime>();
        this.courseCode = courseCode;
    }

    public String getCode(){
        return courseCode;
    }

    public boolean hasLectureOn(int day){
        for (LectureTime time : lectures){
            if (time.day == day)
                return true;
        }
        return false;
    }

    public void addLecture(int day, int hour){
        if (this.hasLectureAt(day,hour))
            return;
        lectures.add(new LectureTime(day,hour));
    }

    public boolean hasLectureAt(int day, int hour){
        for (LectureTime time : lectures) {
            if (time.day == day && time.hour == hour)
                return true;
        }
        return false;
    }

    public boolean conflictsWith(Course other){
        for (LectureTime time : other.lectures){
            if (this.hasLectureAt(time.day,time.hour))
                return true;
        }
        return false;
    }

    /*public void display(){
        System.out.println(getCode());
        for (LectureTime lt: lectures){
            System.out.println("+ day: " +lt.day +"\thour: " +lt.hour);
        }
    }*/

    /*public static void main(String[] args) {
        Course c1 = new Course("SFWRENG 2AA4");
        c1.addLecture(4,15);
        c1.addLecture(1,8);

        Course c2 = new Course("SFWRENG 2GA3");
        c2.addLecture(3,15);
        c2.addLecture(2,8);

        System.out.println(c1.conflictsWith(c2));
        System.out.println(c1.hasLectureOn(2));
        System.out.println(c1.getCode());

    }*/
}

