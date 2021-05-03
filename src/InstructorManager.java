public class InstructorManager extends Manager {
    @Override
    public void add(User user) {
        System.out.println("Eğitmen kursa eklendi " + user.getName() + " " + user.getLastName());
    }
}
