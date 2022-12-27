import java.util.ArrayList;
public class Student {
    private String name;
    private ArrayList<Course> desiredCourses;

    public Student(String name){
        this.name = name;
        desiredCourses = new ArrayList<Course>();
    }

    public String getName(){
        return name;
    }

    public void addDesiredCourse(Course newCourse){
        for (Course c : desiredCourses)
            if (c.getCode().equals(newCourse.getCode()))
                return;

        desiredCourses.add(newCourse);
    }

    public ArrayList<Course> getBestSchedule(){
        ArrayList<ArrayList<Course>> allSchedules = new ArrayList<ArrayList<Course>>();
        ArrayList<Course> temp;
        for (int a = 0; a < desiredCourses.size()-4; a++){
            for (int b = a + 1; b < desiredCourses.size()-3; b++){
                for (int c = b + 1; c < desiredCourses.size()-2; c++){
                    for (int d = c + 1; d < desiredCourses.size()-1; d++){
                        for (int e = d + 1; e < desiredCourses.size(); e++){
                            temp = new ArrayList<>();
                            temp.add(desiredCourses.get(a));
                            temp.add(desiredCourses.get(b));
                            temp.add(desiredCourses.get(c));
                            temp.add(desiredCourses.get(d));
                            temp.add(desiredCourses.get(e));
                            allSchedules.add(temp);
                        }
                    }
                }
            }
        }

        ArrayList<Course> bestSchedule = new ArrayList<Course>();
        for (ArrayList<Course> s : allSchedules){
            if (bestSchedule.isEmpty() && isValidSchedule(s))
                bestSchedule = s;
            else if(isValidSchedule(s) && daysOnCampus(s) < daysOnCampus(bestSchedule))
                bestSchedule = s;
        }
        return bestSchedule;
    }

    /*public ArrayList<Course> getPowerSet(ArrayList<ArrayList<Course>> powerSet, int i, ArrayList<Course> lastElement){
        if (i != desiredCourses.size()){
            if (lastElement != null)
                powerSet.add(lastElement);
            ArrayList<Course> newElement = new ArrayList<Course>(lastElement);
            newElement.add(desiredCourses.get(i));
            return powerSet.add(newElement);
        }
    }*/

    public boolean isValidSchedule(ArrayList<Course> schedule){
        if (schedule.size() != 5)
            return false;
        for (int i = 0; i < schedule.size()-1; i++){
            for (int j = i+1; j < schedule.size(); j++){
                if (schedule.get(i).conflictsWith(schedule.get(j)))
                    return false;
            }
        }
        return true;
    }

    public int daysOnCampus(ArrayList<Course> schedule){
        boolean mon = false, tues = false, wed = false, thur = false, fri = false;
        int count = 0;
        for (Course c : schedule){
            if (c.hasLectureOn(1) && !mon){
                mon = true;
                count++;
            }
            else if (c.hasLectureOn(2) && !tues){
                tues = true;
                count++;
            }
            else if (c.hasLectureOn(3) && !wed){
                wed = true;
                count++;
            }
            else if (c.hasLectureOn(4) && !thur){
                thur = true;
                count++;
            }
            else if (c.hasLectureOn(5) && !fri){
                fri = true;
                count++;
            }
        }
        return count;
    }

    /*public void display(ArrayList<Course> schedule){
        for (Course c : schedule){
            c.display();
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Mat");
        Course c1 = new Course("2AA4");
        c1.addLecture(1, 13);
        c1.addLecture(3, 13);
        c1.addLecture(4, 13);
        Course c2 = new Course("2GA3");
        c2.addLecture(2, 15);
        c2.addLecture(3, 15);
        c2.addLecture(5, 15);
        Course c3 = new Course("2CO3");
        c3.addLecture(1, 11);
        c3.addLecture(3, 11);
        c3.addLecture(5, 13);
        Course c4 = new Course("2FA3");
        c4.addLecture(2, 12);
        c4.addLecture(3, 12);
        c4.addLecture(5, 12);
        Course c5 = new Course("2PX3");
        c5.addLecture(2, 10);
        c5.addLecture(2, 11);
        c5.addLecture(2, 1);
        c5.addLecture(4, 12);
        Course c6 = new Course("2FA3");
        c6.addLecture(2, 10);
        c6.addLecture(3, 12);
        c6.addLecture(5, 13);
        Course c7 = new Course("extra1");
        c7.addLecture(2, 17);
        c7.addLecture(3, 17);
        c7.addLecture(2, 14);
        Course c8 = new Course("extra2");
        c8.addLecture(2, 16);
        c8.addLecture(3, 16);
        c8.addLecture(2, 9);
        Course c9 = new Course("extra3");
        c9.addLecture(3, 14);
        c9.addLecture(2, 8);
        Course c10 = new Course("extra3");
        c10.addLecture(3, 12);
        c10.addLecture(2, 10);

        s1.addDesiredCourse(c1);
        s1.addDesiredCourse(c2);
        s1.addDesiredCourse(c3);
        s1.addDesiredCourse(c4);
        s1.addDesiredCourse(c5);
        s1.addDesiredCourse(c6);
        s1.addDesiredCourse(c7);
        s1.addDesiredCourse(c8);
        s1.addDesiredCourse(c9);
        s1.addDesiredCourse(c10);

        s1.display(s1.getBestSchedule());




    }*/
}
