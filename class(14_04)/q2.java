// class not found exception example short

class q2 {
    public static void main(String[] args) {
        try {
            Class.forName("home");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}