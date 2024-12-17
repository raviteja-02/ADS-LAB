interface Employee {
    void work();
}

interface Manager extends Employee {
    void manage();
}

class MultipleInheritanceEx implements Manager {
    public void work() {
        System.out.println("Employee is working on tasks");
    }

    public void manage() {
        System.out.println("Manager is managing the team");
    }

    public static void main(String[] args) {
        MultipleInheritanceEx obj = new MultipleInheritanceEx();
        obj.work();
        obj.manage();
    }
}
