package se.exp3;

import se.exp3.a1.Thoroughbred;
import se.exp3.a2.*;
import se.exp3.a3.*;
import se.exp3.a4.*;

/**
 * 演示: 实例化四组类模型，验证代码可编译、可运行。
 * 编译: 在项目根目录执行 javac -encoding UTF-8 -d out (src 下全部 .java)
 * 运行: java -cp out .Demo
 */
public class Demo {
    public static void main(String[] args) {
        // A1-1
        Thoroughbred dam = new Thoroughbred(null, null, 2018);
        Thoroughbred sire = new Thoroughbred(null, null, 2017);
        Thoroughbred foal = new Thoroughbred(dam, sire, 2022);
        System.out.println("[A1-1] 马驹年龄=" + foal.getCurrentAge());

        // A1-2
        College c = new College("计算机学院");
        Building b = new Building("主楼", "科技路1号");
        Course course = new Course("软件工程", "CS301", 3);
        course.setBuilding(b); // 满足约束
        c.addBuilding(b);
        c.addCourse(course);
        System.out.println("[A1-2] " + course.getDescription() + " @ " + course.getBuilding().getLocation());

        // A1-3
        School sch = new School("示范大学", "学院路", 1952);
        Department dep = new Department("软件系", 1000000);
        Instructor ins = new Instructor("李老师", "教授", 20000);
        Subject sub = new Subject("CS301", "软件工程", 3);
        ins.assignSubject(sub);
        dep.addInstructor(ins);
        sch.addDepartment(dep);
        Student stu = new Student("张三", "202410760221", "软件工程");
        stu.enroll(sub);
        System.out.println("[A1-3] 教师负载=" + ins.getLoad() + " 学生已选=" + stu.getSubjects().size());

        // A1-4
        Customer cu = new Customer("王五", "w@x.com", "13800000000");
        Order o = cu.placeOrder();
        Product p = new Product("Java编程思想", 99.0, 1.2, 50);
        o.addItem(p, 2);
        o.calculateTotal();
        Payment pay = new AliPay("alipay_123");
        pay.setAmount(o.getTotalAmount());
        o.setPayment(pay);
        pay.processPayment();
        System.out.println("[A1-4] 订单总额=￥" + o.getTotalAmount());
    }
}
