class Student {
    private int Id;
    private int Batch;
    private String name;

    public void setDetails(int i, int b) {
        Id = i;
        Batch = b;
    }

    public void setDetails3(String n) {
        name = n;
    }

    public int getDetails1() {
        return Id;
    }

    public int getDetails2() {
        return Batch;
    }

    public String getDetails3() {
        return name;
    }
}

class SetterGetter {
    public static void main(String[] args) {
        Student sc = new Student();
        sc.setDetails(10, 2025);
        sc.setDetails3("Vamsi");
        System.out.println("Id: " + sc.getDetails1());
        System.out.println("Batch: " + sc.getDetails2());
        System.out.println("Name: " + sc.getDetails3());
    }
}
