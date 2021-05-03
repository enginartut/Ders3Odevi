public class Main {

    public static void main(String[] args) {

        Instructor instructor1 = new Instructor(1, "Erol", "Taş", "eroltas@gmail.com");
        Instructor instructor2 = new Instructor(2, "Engin", "Demiroğ", "engindemirog@gmail.com");
        instructor1.setWebpage("www.eroltas.com");
        instructor1.setYoutubeChannel("yeşilçam anıları");

        instructor2.setWebpage("www.kodlama.io");
        instructor2.setYoutubeChannel("www.youtube.com/channel/engindemiroğ");

        Student student1 = new Student(1, "Engin", "Artut", "enginartut@gmail.com");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor1);
        instructorManager.add(instructor2);
        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);


    }
}
