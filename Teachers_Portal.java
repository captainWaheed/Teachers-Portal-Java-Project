/*
    For Login : Two accounts namely Teacher 1 and Teacher 2
    Passwords : To login -> 111 and 222, respectively!
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FInal_project {

    public static void main(String[] args) {

        //Initial details..
        String[] userName = {"Teacher 1", "Teacher 2"};
        String[] passwordKey = {"111", "222"};

        //Declaration of variables ..
        int desireOption = 0;
        int choiceMarks = 0;
        int choiceAttend = 0;
        int choiceMarksView = 0;
        int choiceAttendView = 0;
        int tries = 0;

        while (true) {

            //login console...
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Username: ");
            String email = input.nextLine().trim();
            System.out.print("Enter Password Key: ");
            String password = input.next();
            if ((email.equals(userName[0])) && (password.equals(passwordKey[0]))) {
                String[] studentNames = {"Student 1  ", "Student 2", "Student 3", "Student 4  ", "Student 5  ", "Student 6  "};
                do {
                    System.out.println("**PROGRAMMING FUNDAMENTAL TEACHER PORTAL**");
                    System.out.println("Welcome Teacher 1!");
                    System.out.println("Enter number to perform corresponding opeartion");
                    System.out.println("1: Insert marks");
                    System.out.println("2: Insert attendance");
                    System.out.println("3: View marks");
                    System.out.println("4: View attendance");
                    System.out.println("5: To log out");

                    desireOption = input.nextInt();

                    switch (desireOption) {
                        case 1:
                            do {
                                //To insert marks respectivley..

                                System.out.println("* Insert Marks **");
                                System.out.println("1: Enter Quiz 1 marks.");
                                System.out.println("2: Enter Quiz 2 marks.");
                                System.out.println("3: Enter Mid marks.");
                                System.out.println("4: Enter Terminal marks.");
                                System.out.println("5: Exit.");
                                System.out.println("Select respective choice: ");
                                choiceMarks = input.nextInt();

                                switch (choiceMarks) {
                                    case 1:
                                        //to write Quiz-1 marks..
                                        String fileName = "pfQuiz_1.txt";
                                        String type = "Quizzes:";
                                        String marksTotal = "   20        ";
                                        int marks[] = new int[studentNames.length];
                                        initializerQuiz(marks);
                                        fileWriterMarks(fileName, type, marksTotal, marks);
                                        break;

                                    case 2:
                                        //to write Quiz-2 marks..
                                        fileName = "pfQuiz_2.txt";
                                        type = "Quizzes:";
                                        marksTotal = "   20        ";
                                        marks = new int[studentNames.length];
                                        initializerQuiz(marks);
                                        fileWriterMarks(fileName, type, marksTotal, marks);

                                        break;
                                    case 3:
                                        //to write Mids marks..
                                        fileName = "pfMid.txt";
                                        type = "Mids:";
                                        marksTotal = "   30        ";
                                        marks = new int[studentNames.length];
                                        initializerMid(marks);
                                        fileWriterMarks(fileName, type, marksTotal, marks);
                                        break;

                                    case 4:
                                        //to write terminal marks..
                                        fileName = "pfTerminal.txt";
                                        type = "Terminals:";
                                        marksTotal = "   50        ";
                                        marks = new int[studentNames.length];
                                        initializerTerminal(marks);
                                        fileWriterMarks(fileName, type, marksTotal, marks);
                                        break;

                                    case 5:
                                        //Using the choice as a FLAG Variable to break loop..
                                        choiceMarks = 5;
                                        break;

                                    default:
                                        System.out.println("Invalid Input, please select a valid option");
                                }
                            } while (choiceMarks != 5);
                            break;

                        case 2:
                            do {
                                System.out.println("* Mark Attendance **");
                                System.out.println("1: Lab Attendance.");
                                System.out.println("2: Class Atendance.");
                                System.out.println("3: Exit.");
                                System.out.print("Your Choice: ");

                                choiceAttend = input.nextInt();
                                switch (choiceAttend) {
                                    case 1:
                                        //for lab attendance....
                                        String fileName = "pflabAttendance.txt";
                                        fileWriterAttendance(fileName);
                                        break;
                                    case 2:
                                        //for class Attendance
                                        fileName = "pfclassAttendance.txt";
                                        fileWriterAttendance(fileName);
                                        break;

                                    case 3:
                                        choiceAttend = 3;
                                        break;
                                    default:
                                        //If user enters other than choices --> prompt this..
                                        System.out.println("Invalid Input, please select a valid option");
                                }
                            } while (choiceAttend != 3);
                            break;
                        case 3:
                            do {
                                //To View marks respectivley..
                                System.out.println("* View Marks **");
                                System.out.println("1: View Quiz 1 marks.");
                                System.out.println("2: View Quiz 2 marks.");
                                System.out.println("3: View Mid marks.");
                                System.out.println("4: View Terminal marks.");
                                System.out.println("5: Exit.");
                                System.out.println("Select respective choice: ");
                                choiceMarksView = input.nextInt();

                                switch (choiceMarksView) {
                                    case 1:
                                        //to view Quiz-1 marks..
                                        String n = "pfQuiz_1.txt";
                                        reader(n);
                                        break;

                                    case 2:
                                        //to view Quiz-2 marks..
                                        n = "pfQuiz_2.txt";
                                        reader(n);
                                        break;

                                    case 3:
                                        //to view Mids marks..
                                        n = "pfMid.txt";
                                        reader(n);
                                        break;

                                    case 4:
                                        //to view Terminals marks..
                                        n = "pfTerminal.txt";
                                        reader(n);
                                        break;

                                    case 5:
                                        //flag variable to logout..
                                        choiceMarksView = 5;
                                        break;

                                    default:
                                        System.out.println("Invalid Input, please select a valid option");

                                }
                            } while (choiceMarksView != 5);

                            break;
                        case 4:
                            do {
                                System.out.println("* View Attendance **");
                                System.out.println("1: Lab Attendance.");
                                System.out.println("2: Class Atendance.");
                                System.out.println("3: Exit.");
                                System.out.print("Your Choice: ");

                                choiceAttendView = input.nextInt();
                                switch (choiceAttendView) {
                                    case 1:
                                        //to view Lab attendance..
                                        String n = "pfLabAttendance.txt";
                                        reader(n);
                                        break;
                                    case 2:
                                        //to view class attendance..
                                        n = "pfClassAttendance.txt";
                                        reader(n);

                                        break;

                                    case 3:
                                        //flag variable ..
                                        choiceAttendView = 3;
                                        break;

                                    default:
                                        //prompt for choices other than above case..
                                        System.out.println("Invalid Input, please select a valid option");
                                }
                            } while (choiceAttendView != 3);
                            break;

                        case 5:
                            //Flag Variable for Logout to Login console..
                            desireOption = 5;
                            break;

                        default:
                            System.out.println("Invalid Input, please select a valid option");
                    }
                } while (desireOption != 5);
                System.out.println("Logging Out!");
                break;

            } else if ((email.equals(userName[1])) && (password.equals(passwordKey[1]))) {
                String[] studentNames = {"Student 1  ", "Student 2", "Student 3", "Student 4  ", "Student 5  ", "Student 6  "};
                do {
                    System.out.println("**FUNDAMENTALS OF GENETICS TEACHER PORTAL**");
                    System.out.println("Welcome Teacher 2!");
                    System.out.println("Enter number to perform corresponding opeartion");
                    System.out.println("1: Insert marks");
                    System.out.println("2: Insert attendance");
                    System.out.println("3: View marks");
                    System.out.println("4: View attendance");
                    System.out.println("5: To log out");

                    desireOption = input.nextInt();

                    switch (desireOption) {
                        case 1:
                            do {
                                //To insert marks respectivley..
                                System.out.println("* Insert Marks **");
                                System.out.println("1: Enter Quiz 1 marks.");
                                System.out.println("2: Enter Quiz 2 marks.");
                                System.out.println("3: Enter Mid marks.");
                                System.out.println("4: Enter Terminal marks.");
                                System.out.println("5: Exit.");
                                System.out.println("Select respective choice: ");
                                choiceMarks = input.nextInt();

                                switch (choiceMarks) {
                                    case 1:
                                        //to write Quiz-1 marks..
                                        String fileName = "genQuiz_1.txt";
                                        String type = "Quizzes:";
                                        String marksTotal = "   20        ";
                                        int marks[] = new int[studentNames.length];
                                        initializerQuiz(marks);
                                        fileWriterMarks(fileName, type, marksTotal, marks);
                                        break;

                                    case 2:
                                        //to write Quiz-2 marks.
                                        fileName = "genQuiz_2.txt";
                                        type = "Quizzes:";
                                        marksTotal = "   20        ";
                                        marks = new int[studentNames.length];
                                        initializerQuiz(marks);
                                        fileWriterMarks(fileName, type, marksTotal, marks);
                                        break;

                                    case 3:
                                        //to write Mids marks...
                                        fileName = "genMid.txt";
                                        type = "Mids:";
                                        marksTotal = "   30        ";
                                        marks = new int[studentNames.length];
                                        initializerMid(marks);
                                        fileWriterMarks(fileName, type, marksTotal, marks);
                                        break;

                                    case 4:
                                        //to write terminal marks.
                                        fileName = "genTerminals.txt";
                                        type = "Terminals:";
                                        marksTotal = "   50        ";
                                        marks = new int[studentNames.length];
                                        initializerTerminal(marks);
                                        fileWriterMarks(fileName, type, marksTotal, marks);
                                        break;

                                    case 5:
                                        //Using the choice as a FLAG Variable to break loop..
                                        choiceMarks = 5;
                                        break;

                                    default:
                                        //flag variable..
                                        System.out.println("Invalid Input, please select a valid option");
                                }
                            } while (choiceMarks != 5);

                            break;
                        case 2:
                            do {
                                // to mark attendance ..
                                System.out.println("* Mark Attendance **");
                                System.out.println("1: Lab Attendance.");
                                System.out.println("2: Class Atendance.");
                                System.out.println("3: Exit.");
                                System.out.print("Your Choice: ");

                                choiceAttend = input.nextInt();
                                switch (choiceAttend) {
                                    case 1:
                                        //for lab attendance....
                                        String fileName = "genLabAttendance.txt";
                                        fileWriterAttendance(fileName);

                                        break;
                                    case 2:
                                        //for class Attendance
                                        fileName = "genClassAttendance.txt";
                                        fileWriterAttendance(fileName);

                                        break;

                                    case 3:
                                        choiceAttend = 3;
                                        break;

                                    default:
                                        System.out.println("Invalid Input, please select a valid option");
                                }
                            } while (choiceAttend != 3);

                            break;
                        case 3:
                            do {
                                //To View marks respectivley..
                                System.out.println("* View Marks **");
                                System.out.println("1: View Quiz 1 marks.");
                                System.out.println("2: View Quiz 2 marks.");
                                System.out.println("3: View Mid marks.");
                                System.out.println("4: View Terminal marks.");
                                System.out.println("5: Exit.");
                                System.out.println("Select respective choice: ");
                                choiceMarksView = input.nextInt();
                                switch (choiceMarksView) {
                                    case 1:
                                        //to view Quiz-1 marks..
                                        String n = "genQuiz_1.txt";
                                        reader(n);
                                        break;

                                    case 2:
                                        //to view Quiz-2 marks..
                                        n = "genQuiz_2.txt";
                                        reader(n);
                                        break;

                                    case 3:
                                        //to view Mids marks..
                                        n = "genMid.txt";
                                        reader(n);
                                        break;

                                    case 4:
                                        //to view Terminals marks..
                                        n = "genTerminals.txt";
                                        reader(n);
                                        break;
                                    case 5:
                                        //flag variable to Exit..
                                        choiceMarksView = 5;
                                        break;

                                    default:
                                        System.out.println("Invalid Input, please select a valid option");

                                }
                            } while (choiceMarksView != 5);

                            break;
                        case 4:
                            do {
                                //to view Lab attendance..
                                System.out.println("* View Attendance **");
                                System.out.println("1: Lab Attendance.");
                                System.out.println("2: Class Atendance.");
                                System.out.println("3: Exit.");
                                System.out.print("Your Choice: ");

                                choiceAttendView = input.nextInt();
                                switch (choiceAttendView) {
                                    case 1:
                                        //to view lab attendance..

                                        String n = "genLabAttendance.txt";
                                        reader(n);
                                        break;
                                    case 2:
                                        //to view class attendance
                                        n = "genClassAttendance.txt";
                                        reader(n);

                                        break;

                                    case 3:
                                        // flag variable
                                        choiceAttendView = 3;
                                        break;

                                    default:
                                        //prompt for choices other than above case..
                                        System.out.println("Invalid Input, please select a valid option");

                                }
                            } while (choiceAttendView != 3);
                            break;

                        case 5:
                            //Flag Variable for Logout to Login console..
                            desireOption = 5;
                            break;

                        default:
                            System.out.println("Invalid Input, please select a valid option");
                    }
                } while (desireOption != 5);
                System.out.println("Logging Out!");
                break;

            } else {
                if (tries == 3) {
                    break;
                }
                System.out.println("Try Again ( You have " + (3 - tries) + " tries)");
                System.out.println(" ");
                System.out.println("Invalid Key!");
                System.out.println(" ");
                tries++;
            }
        }
    }

    //Method --> Initializer For Quiz Marks entry to avoid repitition of same code ..
    private static int[] initializerQuiz(int[] marks) {
        Scanner input = new Scanner(System.in);
        int j = 1;
        int i = 0;
        while (i < marks.length) {
            System.out.print("Enter obtained marks for registeration number " + j + ": ");
            int mark = input.nextInt();
            //Condition to avoid invalid input ..
            if (mark >= 0 && mark <= 20) {
                marks[i] = mark;
                j++;
                i++;
            } else {
                System.out.println("Invalid input !");
            }
        }
        return marks;
    }

    //Method --> Initializer For mids Marks entry to avoid repitition of same code ..
    private static int[] initializerMid(int[] marks) {
        Scanner input = new Scanner(System.in);
        int j = 1;
        int i = 0;
        while (i < marks.length) {
            System.out.print("Enter obtained marks for registeration number " + j + ": ");
            int mark = input.nextInt();
            //Condition to avoid invalid input ..
            if (mark >= 0 && mark <= 30) {
                marks[i] = mark;
                j++;
                i++;
            } else {
                System.out.println("Invalid input !");
            }
        }
        return marks;
    }

    //Method --> Initializer For Terminal Marks entry to avoid repitition of same code ..
    private static int[] initializerTerminal(int[] marks) {
        Scanner input = new Scanner(System.in);
        int j = 1;
        int i = 0;
        while (i < marks.length) {
            System.out.print("Enter obtained marks for registeration number " + j + ": ");
            int mark = input.nextInt();
            //Condition to avoid invalid input ..
            if (mark >= 0 && mark <= 50) {
                marks[i] = mark;
                j++;
                i++;
            } else {
                System.out.println("Invalid input !");
            }
        }
        return marks;
    }

    //Method --> Initializer For Attendance to avoid repitition of same code ..
    private static String[] initializer(String[] attendance) {
        String[] x = {"p", "a", "P", "A"};
        Scanner input = new Scanner(System.in);
        int j = 1;
        int i = 0;
        while (i < attendance.length) {
            System.out.print("Enter attendance status for registeration number " + j + ": ");
            String attend = input.next();
            if (attend.equals(x[0]) || attend.equals(x[1]) || attend.equals(x[2]) || attend.equals(x[3])) {
                attendance[i] = attend;
                j++;
                i++;
            } else {
                System.out.println("Invalid Input");
            }
        }
        return attendance;
    }

    //Method --> Reader  For File reading of file which is passed as an argument ..
    private static void reader(String n) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(n));
            Scanner sc = new Scanner(reader);
            while (sc.hasNextLine()) {
                String Line = sc.nextLine();
                System.out.println(Line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Method --> File writer for Marks to avoid repitition of same code ..
    private static void fileWriterMarks(String a, String b, String c, int[] marks2) {
        String[] studentNames = {"Student 1  ", "Student 2", "Student 3", "Student 4  ", "Student 5  ", "Student 6  "};
        try {
            int[] marks = marks2;
            BufferedWriter writer = new BufferedWriter(new FileWriter(a));
            writer.write(b);
            writer.write("\n Name:        Marks:     Obtained:");
            for (int i = 0; i < studentNames.length; i++) {
                writer.write("\n ");
                writer.write(studentNames[i]);
                writer.write(c);
                writer.write(Integer.toString(marks[i]));
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Method --> File writer for Attendance to avoid repitition of same code ..
    private static void fileWriterAttendance(String a) {
        String[] studentNames = {"Student 1  ", "Student 2", "Student 3", "Student 4  ", "Student 5  ", "Student 6  "};
        try {
            String attendance[] = new String[studentNames.length];
            initializer(attendance);
            BufferedWriter writer = new BufferedWriter(new FileWriter(a));
            writer.write("Attendance:");
            writer.write("\n Name:           Attendance:");
            for (int i = 0; i < studentNames.length; i++) {
                writer.write("\n ");
                writer.write(studentNames[i]);
                writer.write("\t\t" + attendance[i]);
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

