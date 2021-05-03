public class StudentManager extends Manager {
    @Override
    public void add(User user) {
        System.out.println("Öğrenci eklendi :" + user.getName() + " " + user.getLastName());
    }
}
