package taibahcs;

import java.util.ArrayList;
import java.util.Scanner;

public class TaibahCS {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Convener convener = new Convener();
        ////////////////////////////////  Declare Objects for Courses ///////////////////////////
        ArrayList<Course> course = new ArrayList<>();
        course.add(new Course("CS111", "Programming 1                            ", 4));
        course.add(new Course("CS112", "Programming 2                            ", 4));
        course.add(new Course("CS103", "Discrete Structures                      ", 3));
        course.add(new Course("CS211", "Algorithms and Data Structures 1         ", 4));
        course.add(new Course("CE211", "Introduction to Software Engineering 1   ", 4));
        course.add(new Course("CS281", "Computer Organization and Architecture1  ", 3));
        course.add(new Course("CE224", "Computer Networks                        ", 4));
        course.add(new Course("CE332", "Software Modelling and Analysis          ", 4));
        course.add(new Course("CS284", "Theory of Computation                    ", 3));
        course.add(new Course("CS301", "Operating Systems                        ", 4));
        course.add(new Course("CS323", "Intelligent Systems                      ", 3));
        course.add(new Course("CS362", "Database Systems                         ", 4));
        course.add(new Course("CS372", "Computer Graphics                        ", 4));
        course.add(new Course("CS451", "Computer Security                        ", 4));
        course.add(new Course("CS424", "Introduction to Parallel Computing       ", 4));
        convener.setCourse(course);//ضفنا الكلاسات الموجودة في كلاس كونفينير 

        //////////////////////////////// End Declare Objects for Courses ///////////////////////////
        ////////////////////////////////  Declare Objects for Lecturers ///////////////////////////
        ArrayList<Lecturers> lecturers = new ArrayList<>();//
        lecturers.add((new Lecturers(1, "Nora   ", "Ahmad    ", "Lecturer ", "Algorithms                 ", 3, 12)));
        lecturers.add((new Lecturers(2, "Nora   ", "Abdullah ", "Lecturer ", "Natural Language Processing", 3, 12)));
        lecturers.add((new Lecturers(3, "Maryam ", "Mohammad ", "Lecturer ", "Computer Security          ", 3, 12)));
        lecturers.add((new Lecturers(4, "Samar  ", "Jamal    ", "Lecturer ", "Software Engineering       ", 3, 12)));
        lecturers.add((new Lecturers(5, "Fatimah", "Ali      ", "Lecturer ", "Computer Science           ", 3, 12)));
        lecturers.add((new Lecturers(6, "Hanan  ", "Hassan   ", "Lecturer ", "Machine Learning           ", 3, 12)));
        lecturers.get(0).setCourses("CS111");
        lecturers.get(0).setCourses("CS103");
        convener.setLecturers(lecturers);
        //////////////////////////////// End Declare Objects for Lecturers ///////////////////////////

        ////////////////////////////////  Declare Objects for TAs ///////////////////////////
        ArrayList<TAs> tas = new ArrayList<>();
        tas.add((new TAs(7, "Abrar    ", "Talal      ", "TA", "Computer Security   ", 4, 14)));
        tas.add((new TAs(8, "Rawan    ", "Omar       ", "TA", "Computer Science    ", 4, 14)));
        tas.add((new TAs(9, "Jameelah ", "Adel       ", "TA", "Computer Science    ", 4, 14)));
        tas.add((new TAs(10, "Huda     ", "Abdulmajeed", "TA", "Software Engineering", 4, 14)));
        tas.add((new TAs(11, "Mohammed ", "Majed      ", "TA", "Software Engineering", 4, 14)));
        tas.add((new TAs(12, "Lama     ", "Osama      ", "TA", "Computer Science    ", 4, 14)));
        tas.add((new TAs(13, "Noor     ", "Ayman      ", "TA", "Machine Learning    ", 4, 14)));
        convener.setTas(tas);
        ////////////////////////////////  Declare Objects for TAs ///////////////////////////

        ////////////////////////////////  Declare Objects for Convener ///////////////////////////
        ArrayList<Convener> convener1 = new ArrayList<>();
        convener1.add(new Convener(14, "Najwa   ", "Ahmad   ", "Assistant Professor", "Computer Science   "));
        convener1.add(new Convener(15, "Ali     ", "Khaled  ", "Assistant Professor", "Computer Science   "));
        convener1.add(new Convener(16, "Sara    ", "Ibrahim ", "Assistant Professor", "Computer Security  "));
        convener1.add(new Convener(17, "Layla   ", "Mohammad", "Assistant Professor", "Intelligent Systems"));
        convener1.add(new Convener(18, "Mohammad", "Mostafa ", "Assistant Professor", "Machine Learning   "));
        convener1.get(0).addCourse("CS111");//استدعينا ميثود من نوع استرينق 
        convener1.get(0).addCourse("CS112");
        convener1.get(0).addMember(1);
        convener1.get(0).addMember(2);
        convener1.get(0).addMember(15);
        convener1.get(0).addMember(11);
        //////////////////////////////// End  Declare Objects for Convener ///////////////////////////
        
        
        
        System.out.println("Welcome in taibacs ");
        String h;
        do {
            System.out.println("Plase enter the number of operation you want to use: "
                    + "\n1- Convener "
                    + "\n2- Lecturers"
                    + "\n3- TA (Teaching Assistant)");

            int num = input.nextInt();

            switch (num) {
                case 1:
                    ArrayList<String> j = new ArrayList<>();
                    System.out.println("\nEnter your ID : ");
                    int CID = input.nextInt();
                    if (CID >= 19 || CID <= 13) {
                        System.out.println("There is no Convener with this ID");
                        break;//يتاكد من الايدي حقه 
                    }
                    for (int c = 0; c < convener1.size(); c++) {//Start for 1                        

                        if (convener1.get(c).getFacultyID() == CID) {//Start if 1

                            System.out.println("\nPlase enter the number of operation you want to use: ");
                            System.out.println("1- Allocate course\n"
                                    + "2- Drop course\n"
                                    + "3- Print a report ");

                            int num1 = input.nextInt();
                            switch (num1) {//Start awitch 2
                                case 1:
                                    System.out.println("\nLecturers");//نختار نضيف مادة للمجاضر او للمساعد ونطبعها 
                                    for (int i = 0; i < lecturers.size(); i++) {
                                        System.out.println(lecturers.get(i));
                                    }
                                    System.out.println("\nTAs");
                                    for (int i = 0; i < tas.size(); i++) {
                                        System.out.println(tas.get(i));
                                    }

                                    System.out.println("\nEnter ID Member : ");
                                    int idmember = input.nextInt();
                                    if (idmember >= 14) {
                                        System.out.println("Ther is no member with this ID");
                                    }//يتاكد من ال رقم المحاظرة 

                                    System.out.println("\nUnlocatedCourse");
                                    for (int i = 0; i < course.size(); i++) {
                                        if (!convener1.get(c).get_courses().contains(course.get(i).getCousrseCode())) {//استدعي كونفينر واحد من ارري ليست وراح يطلب الكورسات الموجودة واذا كانت موجوده المادة عندها ماراح تنطبع 
                                            System.out.println(course.get(i));
                                        }//يطبع كل الكورسات الغير مدرجة 
                                    }

                                    System.out.println("\nEnter Course Code: ");
                                    String idcourse = input.next();
                                    //نختار اسم الكورس اللي نبغى نضيفه  
                                    int currentHourse = 0;//معدد ساعات المادة ال
                                    int currentCourse = 0;

                                    for (Course m : course) {//Start for 2
                                        if (idcourse == m.getCousrseCode()) {
                                            j.add(m.getCousrseCode());
                                            currentHourse += m.getCreditHours();//راح نحط المادة عدد ساعاتها ب الاري لست الموجود عندنا وعدد الاقصى من الكود 
                                        }
                                    }//End for 2

                                    for (int i = 0; i < lecturers.size(); i++) {//اذا الايدي نفس عدد المبمر ادخل ونفذلي 
                                        if (idmember == lecturers.get(i).getFacultyID()) {
                                            lecturers.get(i).setcurrentcourse(lecturers.get(i).getcurrentcourse() + currentCourse + 1);//يضيف المادة 
                                            lecturers.get(i).setcurrenthourse(lecturers.get(i).getcurrenthourse() + currentHourse);//اعطيني كل الكورسات اللي عندك مع زيادة كورس واحد مع الساعات
                                           
                                            for (int k = 0; k < course.size(); k++) {// راح تضيف الماده عند الكونفينر وتعطيه المبمبر 
                                                if (course.get(k).getCousrseCode().equals(idcourse)) {
                                                    convener.allocateCourse(course.get(k), idmember);//واحد من الكورسات موجوده تطابقت مع الكورسات تطابقت الاري  دي مبمب الخاص ر 
                                                    if (!(convener1.get(c).getmembers().contains(idmember))) {
                                                        convener1.get(c).addMember(idmember);
                                                    }
                                                    if (!(convener1.get(c).get_courses().contains(idcourse))) {
                                                        convener1.get(c).addCourse(idcourse);
                                                    }
                                                }
                                            }
                                            System.out.println("\n" + lecturers.get(i).toString());
                                        }
                                    }
  
                                    
                                    for (int i = 0; i < tas.size(); i++) {
                                        if (idmember == tas.get(i).getFacultyID()) {
                                            tas.get(i).setcurrentcourse(tas.get(i).getcurrentcourse() + currentCourse + 1);
                                           tas.get(i).setcurrenthourse(tas.get(i).getcurrenthourse() + currentHourse);
                                            for (int k = 0; k < course.size(); k++) {
                                                if (course.get(k).getCousrseCode().equals(idcourse)) {
                                                    convener.allocateCourse(course.get(k), idmember);
                                                    if (!(convener1.get(c).getmembers().contains(idmember))) {
                                                        convener1.get(c).addMember(idmember);
                                                    }
                                                    if (!(convener1.get(c).get_courses().contains(idcourse))) {
                                                        convener1.get(c).addCourse(idcourse);
                                                    }
                                                }
                                            }
                                            System.out.println("\n" + lecturers.get(i).toString());
                                        }
 }

                                    System.out.println(convener1.get(c));//اطبعليبينات الكونفينر بعد التنفيذ  
                                    break;
                                case 2:
                                    System.out.println("\nCourse");//اطبع الكورسات المموجوده عندك يا كونفينر 
                                    System.out.println(convener1.get(c).get_courses());
                                    System.out.println("\nEnter Course Code: ");//ادخل الايدي للكورس واحذفها 
                                    idcourse = input.next();
                                    convener1.get(c).get_courses().remove(idcourse);
                                    System.out.println("\nThe remaining courses");// راح تنطبع الكلاسات الموجودة اللي نحذفت 
                                    System.out.println(convener1.get(c).get_courses());
                                    break;

                                case 3:
                                    System.out.println("\nConvener");// راح تطبع معلومات الكونفينر 
                                    System.out.println(convener1.get(c));
                                    System.out.println("\nThe Course");//راح تنطبع الكورسات الموجودة لديه 
                                    for (int i = 0; i < course.size(); i++) {
                                        if (convener1.get(c).get_courses().contains(course.get(i).getCousrseCode())) {
                                            System.out.println(course.get(i));
                                        }
                                    }

                                    System.out.println("\nThe Member");// اطبع الكورسات الموجوده عن المبمبر 
                                    for (int i = 0; i < lecturers.size(); i++) {
                                        if (convener1.get(c).getmembers().contains(lecturers.get(i).getFacultyID())) {
                                            System.out.println(lecturers.get(i));
                                        }
                                    }

                                    for (int i = 0; i < tas.size(); i++) {// راح تطبع بيناته الtas
                                        if (convener1.get(c).getmembers().contains(tas.get(i).getFacultyID())) {
                                            System.out.println(tas.get(i));
                                        }
                                    }

                                    for (int i = 0; i < convener1.size(); i++) {// راح يطبع ال
                                        if (convener1.get(c).getmembers().contains(convener1.get(i).getFacultyID())) {
                                            System.out.println(convener1.get(i));
                                        }
                                    }

                                    System.out.println("\nUnlocatedCourse");//الكورسات الموجودة 
                                    for (int i = 0; i < course.size(); i++) {
                                        if (!convener1.get(c).get_courses().contains(course.get(i).getCousrseCode())) {
                                            System.out.println(course.get(i));
                                        }
                                    }
                                    break;

                                default:
                                    System.out.println("\nError, The number you can choose are only 1, 2, and 3.");
                            }//End awitch 2
                        }//End if
                    }//End for 1
                    break;

                case 2:
                    System.out.println("\nEnter your ID : ");
                    int LID = input.nextInt();
                    for (Lecturers ob : lecturers) {
                        if (LID >= 7) {
                            System.out.println("There is no Lecturers with that ID");
                            break;
                        }//End if
                        if (ob.getFacultyID() == LID) {
                            System.out.println(ob);
                        }//End if
                    }//End for
                    break;

                case 3:
                    System.out.println("\nEnter your ID : ");
                    int TID = input.nextInt();
                    for (TAs tb : tas) {
                        if (TID >= 14 || TID <= 6) {
                            System.out.println("There is no TAs with that ID");
                            break;
                        }//End if
                        if (tb.getFacultyID() == TID) {
                            System.out.println(tb.toString());
                        }//End if
                    }//End for
                    break;

                default:
                    System.out.println("\nError, The number you can choose are only 1, 2, and 3.");
            }//End switch 1

            System.out.println("\nIf you want another opration enter Yes/yes OR"
                    + " If you want exit enter No/no");
            h = input.next();
            System.out.println("\n");
            if ("No".equals(h) || "no".equals(h)) {
                break;
            }

        } while ("Yes".equals(h) || "yes".equals(h));
    }
}
